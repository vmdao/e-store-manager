package com.example.store.payload.user_management.response;

import java.util.HashSet;
import java.util.Set;

public class UserInfor {
    private Long id;
    private String name;
    private String username;
    private Long salary;
    private String email;
    private String address;
    private String mobileNo;
    private Set<String> roles = new HashSet<>();

    public UserInfor(Long id, String name, String username, Long salary, String email, String address, String mobileNo){
        this.id = id;
        this.name = name;
        this.username = username;
        this.salary = salary;
        this.email = email;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addRole(String role) {
        this.roles.add(role);
    }
}