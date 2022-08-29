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
    
    public String getAccountName ( ) {
        return accountName;
    }
    
    public void setAccountName ( String accountName ) {
        this.accountName = accountName;
    }
    
    public long getAccountNumber ( ) {
        return accountNumber;
    }
    
    public void setAccountNumber ( long accountNumber ) {
        this.accountNumber = accountNumber;
    }
    
    public double getAvailableBalance ( ) {
        return availableBalance;
    }
    
    public void setAvailableBalance ( double availableBalance ) {
        this.availableBalance = availableBalance;
    }
    
    public String getOpeningDate ( ) {
        return openingDate;
    }
    
    public void setOpeningDate ( String openingDate ) {
        this.openingDate = openingDate;
    }
    
    public String getModeOfOperation ( ) {
        return modeOfOperation;
    }
    
    public void setModeOfOperation ( String modeOfOperation ) {
        this.modeOfOperation = modeOfOperation;
    }
    
    public String getInternetBanking ( ) {
        return internetBanking;
    }
    
    public void setInternetBanking ( String internetBanking ) {
        this.internetBanking = internetBanking;
    }
    
    public double getInterestRate ( ) {
        return interestRate;
    }
    
    public void setInterestRate ( double interestRate ) {
        this.interestRate = interestRate;
    }
    
    public double getTotalBalance ( ) {
        return totalBalance;
    }
    
    public void setTotalBalance ( double totalBalance ) {
        this.totalBalance = totalBalance;
    }
    
    public double showAccountBalance ( ) {
        System.out.println ( "availableBalance = " + getAvailableBalance ( ) );
        return getAvailableBalance ( );
    }
}
