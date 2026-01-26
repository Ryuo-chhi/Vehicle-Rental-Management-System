package Vehicle_data;

public class Rent {
    int rentId;
    Vehicle vehicle;
    String customerName;
    int days;

    public Rent(int rentId, Vehicle vehicle, String customerName, int days) {
        this.rentId = rentId;
        this.vehicle= vehicle;
        this.customerName= customerName;
        this.days= days;
    }
}
