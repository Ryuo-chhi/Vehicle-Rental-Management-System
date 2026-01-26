package payment_data;

public class Payment {
    // 1. Primary Identifier
    private int paymentID;

    // 2. Foreign Keys / Relationships (Links to other entities)
    private int customerID;
    private int vehicleID;
    private int driverID;

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
    public Payment(int paymentID, int customerID, int vehicleID, int driverID, double pricePerDay, double damageFee,
                   double discount, double amount, String paymentMethod,
                   String date, String paymentStatus) {
        this.paymentID = paymentID;
        this.customerID = customerID;
        this.vehicleID = vehicleID;
        this.driverID = driverID;
        this.pricePerDay = pricePerDay;
        this.damageFee = damageFee;
        this.discount = discount;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.date = date;
        this.paymentStatus = paymentStatus;
    }

    // Getters and Setters
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
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

    // calculate total amount
    public void calculateTotalAmount(int rentalDays) {
        double total = (pricePerDay * rentalDays) + damageFee - discount;
        this.amount = total;
    }

    // toString method for easy representation
    @Override
    public String toString() {
        return "Payment [paymentID=" + paymentID + ", customerID=" + customerID + ", vehicleID=" + vehicleID
                + ", driverID=" + driverID + ", pricePerDay=" + pricePerDay + ", damageFee=" + damageFee + ", discount="
                + discount + ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", date=" + date
                + ", paymentStatus=" + paymentStatus + "]";
    }
    
}
