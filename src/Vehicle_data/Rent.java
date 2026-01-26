package Vehicle_data;

import payment_data.Payment;

public class Rent {
    int rentId;
    Vehicle vehicle;
    String customerName;
    int days;
    Payment payment;

    public Rent(int rentId, Vehicle vehicle, String customerName, int days) {
        this.rentId = rentId;
        this.vehicle = vehicle;
        this.customerName = customerName;
        this.days = days;
        this.payment = null;
    }

    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentId=" + rentId +
                ", vehicle=" + vehicle +
                ", customerName='" + customerName + '\'' +
                ", days=" + days +
                ", payment=" + payment +
                '}';
    }
}
