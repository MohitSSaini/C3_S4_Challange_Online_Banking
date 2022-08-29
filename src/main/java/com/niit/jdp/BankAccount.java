/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class BankAccount {
    private String accountName;
    private long accountNumber;
    private double availableBalance;
    private String openingDate;
    private String modeOfOperation;
    private String internetBanking;
    private double interestRate;
    private double totalBalance;
    
    public BankAccount ( ) {
    }
    
    public BankAccount ( String accountName ,
                         long accountNumber ,
                         double availableBalance ,
                         String openingDate ,
                         String modeOfOperation ,
                         String internetBanking ,
                         double interestRate ,
                         double totalBalance ) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.availableBalance = availableBalance;
        this.openingDate = openingDate;
        this.modeOfOperation = modeOfOperation;
        this.internetBanking = internetBanking;
        this.interestRate = interestRate;
        this.totalBalance = totalBalance;
    }
}
