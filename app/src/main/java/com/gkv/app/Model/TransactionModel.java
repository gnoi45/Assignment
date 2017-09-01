package com.gkv.app.Model;

/**
 * Created by GOKUL on 31-08-2017.
 */
public class TransactionModel {
    private String transactionDateTime;
    private String transactionType;
    private String transactionAmount;


    public TransactionModel() {

    }

    public TransactionModel(String transactionDateTime, String transactionType, String transactionAmount) {
        this.transactionDateTime = transactionDateTime;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public String toString() {
        return "TransactionModel{" +
                "transactionAmount='" + transactionAmount + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", transactionDateTime='" + transactionDateTime + '\'' +
                '}';
    }

}
