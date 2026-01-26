package payment_data;

import java.util.ArrayList;


public class PaymentOperations {

    private ArrayList<Payment> paymentList = new ArrayList<>();

    // CRUD Operations for Payment
    // addPayment
    public void addPayment(Payment payment) {
        paymentList.add(payment);
        System.out.println("Payment with ID " + payment.getPaymentID() + " added.");
    }
    // removePayment
    public void removePayment(int paymentID) {
        paymentList.removeIf(payment -> payment.getPaymentID() == paymentID);
        System.out.println("Payment with ID " + paymentID + " removed.");
    }
    // updatePayment
    public void updatePayment(Payment payment) {
        for (int i = 0; i < paymentList.size(); i++) {
            if (paymentList.get(i).getPaymentID() == payment.getPaymentID()) {
                paymentList.set(i, payment);
                System.out.println("Payment with ID " + payment.getPaymentID() + " updated.");
                return;
            }
        }
        System.out.println("Payment with ID " + payment.getPaymentID() + " not found.");
    }
    // getPayment (show details)
    public Payment getPayment(int paymentID) {
        // Logic to retrieve payment from the database or data structure
        for (Payment payment : paymentList) {
            if (payment.getPaymentID() == paymentID) {
                System.out.println("Payment with ID " + paymentID + " retrieved.");
                return payment;
            }
        }
        System.out.println("Payment with ID " + paymentID + " not found.");
        return null; // Placeholder return
    }
}
