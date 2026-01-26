package payment_data;

import Vehicle_data.Vehicle;
import customer_data.Customer;

public class Payment {
    // 1. Primary Identifier
    private int paymentID;

    // 2. Foreign Keys / Relationships (Links to other entities)
    private Customer customer; //get customerID from Customer class
    private Vehicle vehicle; //get vehicleID from Vehicle class
    private String driverID; //if exists

    // 3. Core Business Data (The "How much")
    private double pricePerDay;
    private double damageFee;
    private double discount;
    private double amount;

    // 4. Transaction Details (The "How and When")
    private String paymentMethod;
    private String date; 
    private String paymentStatus;

    // Constructor
    public Payment(int paymentID, Customer customer, Vehicle vehicle, String driverID, double pricePerDay, double damageFee, double discount, double amount, String paymentMethod, String date, String paymentStatus) {
        this.paymentID = paymentID;
        this.customer = customer;
        this.vehicle = vehicle;
        this.driverID = driverID;
        this.pricePerDay = pricePerDay;
        this.damageFee = damageFee;
        this.discount = discount;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.date = date;
        this.paymentStatus = paymentStatus;
    }

    // calculate total amount
    public void calculateTotalAmount(int daysRented) {
        double total = (pricePerDay * daysRented) + damageFee - discount;
        this.amount = total;
    }

    // Getters and Setters
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getDamageFee() {
        return damageFee;
    }

    public void setDamageFee(double damageFee) {
        this.damageFee = damageFee;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    // toString method for easy representation
    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", customer=" + customer +
                ", vehicle=" + vehicle +
                ", driverID='" + driverID + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", damageFee=" + damageFee +
                ", discount=" + discount +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", date='" + date + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
