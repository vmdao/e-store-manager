package com.example.store.payload.invoice_management.response;

import java.util.ArrayList;
import java.util.List;

public class SearchInvoicesResponse {

    private boolean success = true;
    
    private Long draw;

    private Long recordsTotal;

    private Long recordsFiltered;

    private List<Data> data = new ArrayList<>();

    public SearchInvoicesResponse(Long draw, Long recordsTotal, Long recordsFiltered){
        this.draw = draw;
        this.recordsTotal = recordsTotal;
        this.recordsFiltered = recordsFiltered;
    }

    public Long getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Long recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public Long getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Long getDraw() {
        return draw;
    }

    public void setDraw(Long draw) {
        this.draw = draw;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void addData(Data supplier) {
        data.add(supplier);
    }

    public List<Data> getData(){
        return this.data;
    }

    public void setData(List<Data> data){
        this.data = data;
    }
}