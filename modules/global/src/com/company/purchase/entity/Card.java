package com.company.purchase.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "PURCHASE_CARD")
@Entity(name = "purchase_Card")
public class Card extends StandardEntity {
    private static final long serialVersionUID = 5177621560091817304L;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "cardId")
    protected Client clientId;

    @NotNull
    @Column(name = "CARD_ID", nullable = false, unique = true)
    protected Integer cardId;

    @NotNull
    @Column(name = "DISCOUNT", nullable = false)
    protected BigDecimal discount;

    @NotNull
    @Column(name = "TOTAL_COST", nullable = false)
    protected BigDecimal totalCost;

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }
}