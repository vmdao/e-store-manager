package com.example.store.payload.user_management.response;

public class CreateUserResponse {
    public Boolean success;
    public Long user_id;
    public String password;

    public CreateUserResponse(Boolean success, Long user_id, String password){
        this.success = success;
        this.user_id = user_id;
        this.password = password;
    }

}