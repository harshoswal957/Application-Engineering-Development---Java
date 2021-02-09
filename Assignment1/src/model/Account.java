/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Harsh
 */
public class Account {
    private String bankName;
    private String bankRouting;
    private String bankAccountNo;
    private String accountBal;
    private String accountType;

    public Account() {
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankRouting() {
        return bankRouting;
    }

    public void setBankRouting(String bankRouting) {
        this.bankRouting = bankRouting;
    }


    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getAccountBal() {
        return accountBal;
    }

    public void setAccountBal(String accountBal) {
        this.accountBal = accountBal;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    
    
    
    
}
