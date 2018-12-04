package com.example.store.model.sell_management;

import javax.persistence.*;

import com.example.store.model.audit.DateAudit;

@Entity
@Table(name = "sells")
public class Sell extends DateAudit{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long user_id;

    private Long customer_id;

    private Float tax;

    public Sell() {

    }

    public Sell(Long user_id, Long customer_id, Float tax) {
        this.user_id = user_id;
        this.customer_id = customer_id;
        this.tax = tax;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public Long getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getUserId() {
        return user_id;
    }

    public void setUserId(Long user_id) {
        this.user_id = user_id;
    }

}