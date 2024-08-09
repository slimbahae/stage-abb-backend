package com.acc.detail.dto;


import com.acc.detail.entity.AccountMotRejet;
import com.acc.detail.entity.AccountingFile;

public class AccountFileResultDTO {

    private AccountingFile accountFile;
    private AccountMotRejet accountMotRejet;

    public AccountFileResultDTO(AccountingFile accountFile, AccountMotRejet accountMotRejet) {
        this.accountFile = accountFile;
        this.accountMotRejet = accountMotRejet;
    }

    // Getters and Setters

    public AccountingFile getAccountFile() {
        return accountFile;
    }

    public void setAccountFile(AccountingFile accountFile) {
        this.accountFile = accountFile;
    }

    public AccountMotRejet getAccountMotRejet() {
        return accountMotRejet;
    }

    public void setAccountMotRejet(AccountMotRejet accountMotRejet) {
        this.accountMotRejet = accountMotRejet;
    }


}
