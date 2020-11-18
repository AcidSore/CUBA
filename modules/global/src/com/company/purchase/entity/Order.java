package com.company.purchase.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "PURCHASE_ORDER")
@Entity(name = "purchase_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = -2925296173161402478L;

    @NotNull
    @Column(name = "ORDER_ID", nullable = false, unique = true)
    protected Integer orderId;

    @NotNull
    @Column(name = "COST", nullable = false)
    protected BigDecimal cost;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}