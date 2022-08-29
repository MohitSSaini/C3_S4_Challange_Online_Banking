/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class RecurringDepositAccount extends BankAccount {
    
    public RecurringDepositAccount ( ) {
    }
    
    public RecurringDepositAccount ( String accountName ,
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
}
