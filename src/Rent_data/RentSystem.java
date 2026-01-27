package Rent_data;

import Vehicle_data.Vehicle;
import customer_data.Customer;
import payment_data.Payment;
import payment_data.PaymentOperations;

import java.util.ArrayList;

public class RentSystem {
    ArrayList<Rent> rentList;
    PaymentOperations paymentOperations;
    int nextRentId;
    int nextPaymentId;

    public RentSystem() {
        rentList = new ArrayList<>();
        paymentOperations = new PaymentOperations();
        nextRentId = 1;
        nextPaymentId = 1;
    }

    public void rentVehicle(Vehicle vehicle, String customerName, int days) {
        if (!vehicle.isAvailable()) {
            System.out.println("Vehicle is not available for rental.");
            return;
        }

        vehicle.rent();
        Rent rent = new Rent(nextRentId, vehicle, customerName, days);
        rentList.add(rent);
        nextRentId++;

        System.out.println("Rent created successfully.");
    }

    public void processPayment(int rentId, Customer customer, double damageFee, double discount, String paymentMethod,
            String date) {
        Rent rent = findRent(rentId);
        if (rent == null) {
            System.out.println("Rental record not found.");
            return;
        }

        if (rent.getPayment() != null) {
            System.out.println("Payment already processed for this rental.");
            return;
        }

        double pricePerDay = rent.getVehicle().getPrice();
        Payment payment = new Payment(nextPaymentId, customer, rent.getVehicle(), "", pricePerDay, damageFee, discount,
                0, paymentMethod, date, "Pending");
        payment.calculateTotalAmount(rent.getDays());

        rent.setPayment(payment);
        paymentOperations.addPayment(payment);
        nextPaymentId++;

        System.out.println("Payment processed. Total Amount: $" + payment.getAmount());
    }

    public void completePayment(int rentId, String paymentStatus) {
        Rent rent = findRent(rentId);
        if (rent == null) {
            System.out.println("Rental record not found.");
            return;
        }

        if (rent.getPayment() == null) {
            System.out.println("No payment found for this rental.");
            return;
        }

        rent.getPayment().setPaymentStatus(paymentStatus);
        paymentOperations.updatePayment(rent.getPayment());
        System.out.println("Payment status updated to: " + paymentStatus);

        // Return vehicle and make it available again when payment is completed successfully
        if (paymentStatus.equalsIgnoreCase("Completed")) {
            rent.getVehicle().returnVehicle();
        }
    }

    public void returnVehicle(int rentId) {
        Rent rent = findRent(rentId);
        if (rent == null) {
            System.out.println("Rental record not found.");
            return;
        }

        rent.getVehicle().returnVehicle();
        System.out.println("Rental record updated.");
    }

    public Rent findRent(int rentId) {
        for (Rent r : rentList) {
            if (r.getRentId() == rentId) {
                return r;
            }
        }
        return null;
    }

    public void showRents() {
        if (rentList.isEmpty()) {
            System.out.println("No rent records.");
            return;
        }
        for (Rent r : rentList) {
            System.out.println("Rent ID: " + r.getRentId() + ", Customer: " + r.getCustomerName() + ", Days: "
                    + r.getDays() + ", Vehicle: " + r.getVehicle());
            if (r.getPayment() != null) {
                System.out.println("  Payment: $" + r.getPayment().getAmount() + " - Status: "
                        + r.getPayment().getPaymentStatus());
            } else {
                System.out.println("  Payment: Not yet processed");
            }
        }
    }

    public void showPayments() {
        System.out.println("Total payments tracked: " + (nextPaymentId - 1));
    }
}
