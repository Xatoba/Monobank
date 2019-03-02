/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monobank;

/**
 *
 * @author student1
 */
public class CustomerReport {

    public CustomerReport() {
    }
   


    public void generateReport() throws Exception {

        // Print report header
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        // For each customer...
        for (int cust_idx = 0;
                cust_idx < Banking.getNumOfCustomers();
                cust_idx++) {
            Customer customer = Banking.getCustomer(cust_idx);

            // Print the customer's name
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            // For each account for this customer...
            for (int acct_idx = 0;
                    acct_idx < customer.getNumOfAccounts();
                    acct_idx++) {
                Account account = customer.getAccount(acct_idx);
                String account_type = "";

                // Determine the account type
                if (account instanceof SavingsAccount) {
                    account_type = "Savings Account";
                } else if (account instanceof CheckingAccount) {
                    account_type = "Checking Account";
                } else {
                    account_type = "Unknown Account Type";
                }

                // Print the current balance of the account
                System.out.println("    " + account_type + ": current balance is "
                        + account.getBalance());
            }
        }
    }
}