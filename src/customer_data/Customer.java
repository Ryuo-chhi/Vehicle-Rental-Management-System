package customer_data;

public class Customer {
    /* customer_data.Customer Field */
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerTel;

    /* customer_data.Customer Constructor */
    public Customer(int customerId, String customerName, String customerAddress, String customerEmail, String customerTel){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerTel = customerTel;
    }

    /* Getter methods */
    public int getCustomerId(){
        return customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerAddress(){
        return customerAddress;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public String getCustomerTel(){
        return customerTel;
    }

    /* Setter methods */
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public void setCustomerTel(String customerTel){
        this.customerTel = customerTel;
    }
}
