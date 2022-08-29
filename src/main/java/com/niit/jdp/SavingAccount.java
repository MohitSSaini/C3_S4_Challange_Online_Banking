/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class SavingAccount extends BankAccount {
    private double amount;
    
    public SavingAccount ( ) {
    }
    
    public SavingAccount ( String accountName ,
                           long accountNumber ,
                           double availableBalance ,
                           String openingDate ,
                           String modeOfOperation ,
                           String internetBanking ,
                           double interestRate ,
                           double totalBalance ) {
        super ( accountName ,
                accountNumber ,
                availableBalance ,
                openingDate ,
                modeOfOperation ,
                internetBanking ,
                interestRate ,
                totalBalance );
    }
    
    public double getAmount ( ) {
        return amount;
    }
    
    public void setAmount ( double amount ) {
        this.amount = amount;
    }
    
    public double getRetrieveBalance ( double totalBalance ) {
        return totalBalance;
    }
}
