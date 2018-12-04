package com.example.store.payload.buy_management.response;

import java.util.HashSet;
import java.util.Set;

import com.example.store.payload.buy_management.request.BuyItemInfor;

public class BuyInforResponse {

    private Boolean success = true;

    private Long id;

    private Long user_id;

    private Set<BuyItemInfor> buy_items = new HashSet<>();

    public BuyInforResponse(Long id, Long user_id) {
        this.id = id;
        this.user_id = user_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Set<BuyItemInfor> getBuy_items() {
        return buy_items;
    }

    public void setBuy_items(Set<BuyItemInfor> buy_items) {
        this.buy_items = buy_items;
    }

    public void addBuy_items(Long product_id, Long supplier_id, Float price, Long quantities){
        this.buy_items.add(new BuyItemInfor(product_id, supplier_id, price, quantities));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
