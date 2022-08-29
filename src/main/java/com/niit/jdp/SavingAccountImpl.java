/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class SavingAccountImpl {
    public static void main ( String[] args ) {
        SavingAccount savingAccount = new SavingAccount ( "Mohit" ,
                12342233 , 14538.56 ,
                "12/07/2019" , "JointAccount" ,
                "Active" , 10.5 , 50000.0 );
        System.out.println ( "HolderName = " + savingAccount.getAccountName ( ) );
        System.out.println ( "accountNumber = " + savingAccount.getAccountNumber ( ) );
        System.out.println ( "Avalable balance = " + savingAccount.getAvailableBalance ( ) );
        System.out.println ( "openingdatev =" + savingAccount.getOpeningDate ( ) );
        System.out.println ( "mode = " + savingAccount.getModeOfOperation ( ) );
        System.out.println ( "banking = " + savingAccount.getInternetBanking ( ) );
        System.out.println ( "rate = " + savingAccount.getInterestRate ( ) );
        double totalBalance = savingAccount.getRetrieveBalance ( 50000.0 );
        double totalBalanceAfterDebit = savingAccount.getDebitBalance ( 50000.0 , 10000.0 );
        double totalBalanceCredit = savingAccount.getCreditBalance ( 40000.0 , 40000.0 );
        System.out.println ( "totalBalance = " + totalBalance );
        System.out.println ( "totalBalanceAfterDebit = " + totalBalanceAfterDebit );
        System.out.println ( "totalBalanceCredit = " + totalBalanceCredit );
    }
}