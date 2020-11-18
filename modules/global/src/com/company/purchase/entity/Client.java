package com.company.purchase.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s|firstName")
@Table(name = "PURCHASE_CLIENT")
@Entity(name = "purchase_Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 8276096865990474366L;

    @NotNull
    @Column(name = "CLIENT_ID", nullable = false, unique = true)
    protected Integer clientId;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false, length = 100)
    protected String firstName;

    @NotNull
    @Column(name = "SECOND_NAME", nullable = false, length = 100)
    protected String secondName;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "REGISTRATION_DATE", nullable = false)
    protected Date registrationDate;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, length = 15)
    protected String phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, length = 50)
    protected String email;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CARD_ID_ID")
    protected Card cardId;

    public Card getCardId() {
        return cardId;
    }

    public void setCardId(Card cardId) {
        this.cardId = cardId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}