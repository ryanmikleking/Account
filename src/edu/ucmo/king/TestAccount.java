/* Ryan M. King
* CS 1110
* HW3
* Description: Runs and tests the class Account.
 */
package edu.ucmo.king;

public class TestAccount {
    public static void main(String[] args) {
        // Test and runs the program for Account object

        Account newAccount = new Account(1122, 20000);

        newAccount.setAnnualInterestRate(4.5);

        // Prints the new object
        System.out.println("The account balance is: " + newAccount.getBalance() + "\n The account monthly interest: " +
                newAccount.getMonthlyInterest() + "\n" + newAccount.getDate());
        System.out.println("");

        // Withdraws money from account
        newAccount.withdraw(2500);

        // Prints the new object after withdrawal
        System.out.println("The account balance is: " + newAccount.getBalance() + "\n The account monthly interest: " +
                newAccount.getMonthlyInterest() + "\n" + newAccount.getDate());
        System.out.println("");


        // Deposits money into account
        newAccount.deposit(3000);

        // Prints the new object
        System.out.println("The account balance is: " + newAccount.getBalance() + "\n The account monthly interest: " +
                newAccount.getMonthlyInterest() + "\n" + newAccount.getDate());
    }
}
