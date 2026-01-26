package customer_data.customer_utils;

import customer_data.Customer;
import java.util.ArrayList;

public class CustomerOperations {

    private final ArrayList<Customer> customerList = new ArrayList<>();

    /* =============== Add customer =============== */
    public void addCustomer(Customer c1) {
        if (c1 != null) {
            customerList.add(c1);
            System.out.println("Customer added successfully.");
        }
    }

    /* =============== Delete customer =============== */
    public void deleteCustomer(int id) {
        boolean deleted = customerList.removeIf(customer -> customer.getCustomerId() == id);
        if (deleted) {
            System.out.println("Customer deleted successfully.");
        } else {
            System.out.println("Customer not found!");
        }
    }

    /* =============== Update customer =============== */
    public void updateCustomer(int id, String name, String dob, String address, String email, String phone) {
        for (Customer c : customerList) {
            if (c.getCustomerId() == id) {
                c.setCustomerName(name);
                c.setCustomerDOB(dob);
                c.setCustomerAddress(address);
                c.setCustomerEmail(email);
                c.setCustomerPhone(phone);
                System.out.println("Customer updated successfully.");
                return;
            }
        }
        System.out.println("Customer not found!");
    }

    /* =============== Search customer (By ID) =============== */
    public Customer searchCustomerById(int id) {
        for (Customer c : customerList) {
            if (c.getCustomerId() == id) {
                return c;
            }
        }
        return null;
    }

    /* =============== Search customer (By Name) =============== */
    public Customer searchCustomerByName(String name) {
        for (Customer c : customerList) {
            if (c.getCustomerName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    /* =============== Find customer by ID =============== */
    public Customer findCustomerById(int id) {
        return searchCustomerById(id);
    }

    /* =============== Show all customers =============== */
    public void showAllCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }
        for (Customer c : customerList) {
            System.out.println("ID: " + c.getCustomerId() + ", Name: " + c.getCustomerName() + ", Email: "
                    + c.getCustomerEmail() + ", Phone: " + c.getCustomerPhone());
        }
    }
}
