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
public class Customer {
    private static int baseNumber = 1000;
    private List<Account> accounts;

    private String firstName;
    private String lastName;
    private int custNumber;

    private int numberOfAccounts;
    private int currentAccountNumber = 0;
   

    public Customer(String firstName, String lastName, int numberOfAccounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfAccounts = numberOfAccounts;
        

        baseNumber++;
        this.custNumber = baseNumber;
    }

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
// initialize accounts attribute
        accounts = new ArrayList<Account>(10);
    }

    public boolean setAccount(Account newAccount) {
        if (currentAccountNumber < numberOfAccounts) {
            accounts.set(currentAccountNumber, newAccount);
            currentAccountNumber++;
            
            return true;
        } else {
            return false;
        }
    }

    public Account getAccount(int account_index) {
    return accounts.get(account_index);
    }

    @Override
    public String toString() {
        return "\n"+ firstName + " " + lastName + "\n===\n номер клиента: " + custNumber + "\n количество счетов: " + numberOfAccounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumOfAccounts() {
    return accounts.size();
    }
    public void addAccount(Account acct) {
    accounts.add(acct);
    }
    
   
    
    }