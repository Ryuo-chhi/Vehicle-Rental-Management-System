package customer_data.customer_utils;
import customer_data.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerOperations {

    private List<Customer> customerList;
    

    // Scanner object
    private Scanner reader;

    public CustomerOperations(){
        this.customerList = new ArrayList<>();
        this.reader = new Scanner(System.in);
    }

    /*=============== Add customer ===============*/
    public void addCustomer(){
        // Input new customer information
        System.out.println("/*===== Enter Customer Information =====*/");
        System.out.print("Enter Customer ID: ");
        int ID = reader.nextInt();
        reader.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = reader.nextLine();

        System.out.print("Enter Customer Address: ");
        String address = reader.nextLine();

        System.out.print("Enter Customer Email: ");
        String email = reader.nextLine();

        System.out.print("Enter Customer Tel: ");
        String tel = reader.nextLine();

        Customer c1 = new Customer(ID, name, address, email, tel);

        System.out.println("/*======================================*/");
        customerList.add(c1);
        System.out.println("Customer added successfully!");
    }

    /*=============== Delete customer ===============*/
    public void deleteCustomer(){
        // Delete customer by ID
        System.out.println("/*=============== Delete Customer By ID ============== */");
        System.out.println("Enter Customer ID: ");
    }
}
