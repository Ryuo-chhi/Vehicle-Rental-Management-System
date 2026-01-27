package customer_data;
import customer_data.customer_utils.CustomerOperations;

public class Customer {
    /*----- customer_data.Customer Field -----*/
    private int customerId;
    private String customerName;
    private String customerDOB;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;

    /*----- customer_data.Customer Constructor -----*/
    public Customer(int customerId, String customerName, String customerDOB, String customerAddress, String customerEmail, String customerPhone){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerDOB = customerDOB;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    /*----- Getter methods -----*/
    public int getCustomerId(){
        return customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerDOB(){
        return customerDOB;
    }
    public String getCustomerAddress(){
        return customerAddress;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public String getCustomerPhone(){
        return customerPhone;
    }

    /*----- Setter methods -----*/
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerDOB(String customerDOB){
        this.customerDOB = customerDOB;
    }
    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }
}

