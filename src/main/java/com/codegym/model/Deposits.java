package com.codegym.model;

import java.math.BigDecimal;

public class Deposits {
    private Long id;
    private Long customerId;
    private BigDecimal transactionAmount;

    public Deposits() {
    }

    public Deposits(Long id, Long customerId, BigDecimal transactionAmount) {
        this.id = id;
        this.customerId = customerId;
        this.transactionAmount = transactionAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
