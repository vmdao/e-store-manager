import { app, BrowserWindow, Menu} from "electron";
import { ConfigGetter } from "../../services/ConfigGetter";
import { EventGetter } from "../../services/EventGetter";
import { TextGetter } from "../../services/TextGetter";
import { Dialog } from "../../services/Dialog";
import {View} from '../shared/View';
import {UserController} from '../../controllers/UserController';
const {ipcMain} = require('electron');
const { dialog } = require('electron');


export class AddEmployeeView extends View {

    constructor(window: BrowserWindow, parent: BrowserWindow) {
        super("add_employee", window, parent, 600, 600);
        this.getWindow().webContents.openDevTools();
        this.setMenu(null);
    }

    // Handle all logic of this view
    logicHandle():void {

        var userController = new UserController();

        // ======= Handle requests from renderer process ========

        ipcMain.on(EventGetter.get('add_employee'), (event:any, data:any) => {
            userController.addUser(data, (respond:any) => {
                this.getWindow().webContents.send(EventGetter.get("add_employee_success"));
                Dialog.showDialog("info", TextGetter.get("created_user_successfully") + respond.id, null, this.getWindow());
            }, (respond:any) => {
                Dialog.showDialogFromRespond("error", respond, this.getWindow());
            })
        });


    }

}