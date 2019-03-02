package monobank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student1
 */
public class Banking {

    private static Customer[] customers;
    private static int numberOfCustomers=0;
    private static List<Customer> customers;
    
    
    static {
    customers = new ArrayList<Customer>(10);
    }
    public static void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
    }

    public static int getNumOfCustomers() {
        return customers.size();
    }

    public static Customer getCustomer(int customer_index) {
        return customers.get(customer_index);
    }

    static {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    private String name;
    private Account[] accounts;

    private Banking() {
        //this.name = name;
        //accounts = new Account[numberOfAccounts];
    }

    public String toString() {
        return "Bank name: " + name + "\nnumber of accounts: "
                + accounts.length;
    }

}
