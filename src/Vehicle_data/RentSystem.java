package Vehicle_data;

import customer_data.Customer;

import java.util.ArrayList;

public class RentSystem {
    ArrayList<Rent> rentList;
    int nextRentId;

    public RentSystem(){
        rentList = new ArrayList<>();
        nextRentId = 1;
    }

    public void rentVehicle(Vehicle vehicle, String customerName, int days) {
        Rent rent = new Rent(nextRentId, vehicle, customerName, days);
        rentList.add(rent);
        nextRentId++;

        System.out.println("Rent created successfully.");
    }

    public void showRents() {
        if (rentList.isEmpty()) {
            System.out.println(
                    "No rent records."
            );
            return;
        }
        for (Rent r : rentList){
            System.out.println(
                    "Rent ID: " + r.rentId + ", Customer: " + r.customerName+ ", Days: " + r.days + ", Vehicle: " + r.vehicle
            );
        }
    }

}
