package com.bea.olp.ant.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;
/**
 * BatAntAccounting
 */
@Entity
public class BatAntAccountEntity{

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "ACCOUNTING_TYPE")
    private String accountType;

    @Column(name = "ACCOUNTING_AMT")
    private BigDecimal accountAmt;

    @Column(name = "INPUT_DATE")
    private Date inputDate;

    @Column(name = "INPUT_TIME")
    private Date inputTime;

    @Column(name = "DATA_DATE")
    private Date dataDate;

    @Column
    private short status;


    public BatAntAccountEntity() {
    }
    


    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getAccountAmt() {
        return this.accountAmt;
    }

    public void setAccountAmt(BigDecimal accountAmt) {
        this.accountAmt = accountAmt;
    }

    public Date getInputDate() {
        return this.inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public Date getInputTime() {
        return this.inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Date getDataDate() {
        return this.dataDate;
    }

    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }
    
}