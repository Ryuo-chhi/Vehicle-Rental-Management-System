import Vehicle_data.Vehicle;
import Vehicle_data.VehicleSystem;
import Rent_data.RentSystem;
import customer_data.Customer;
import customer_data.customer_utils.CustomerOperations;

import java.util.Scanner;

public class ManagementSystem {
    public static void main(String[] args) {
        String powertrain, vehicleClass, brand, model;
        double price;
        boolean quit = false;
        int ID = 1, idSearch, choice, customerId = 1;
        Scanner scanner = new Scanner(System.in);

        Vehicle v1 = new Vehicle(ID++, "gasoline", "SUV", "Ford", "Escape", 30000, true);
        Vehicle v2 = new Vehicle(ID++, "gasoline", "SUV", "Ford", "Territory", 30000, true);
        // System.out.println(v1.toString());

        VehicleSystem Garage = new VehicleSystem();
        RentSystem rentSystem = new RentSystem();
        CustomerOperations customerOps = new CustomerOperations();
        Garage.addVehicle(v1);
        Garage.addVehicle(v2);

        // Garage.vehicleList();
        // Garage.removeVehicle(2);
        // Garage.updateVehicle(0);
        // System.out.println();
        // Garage.vehicleList();

        do {
            System.out.println("""
                    Management System:
                    0. Quit

                    1. Add vehicle
                    2. Remove vehicle
                    3. Update vehicle
                    4. Show all vehicles

                    5. Rent a vehicle
                    6. Show all rental records
                    7. Return a vehicle

                    8. Add customer
                    9. Show all customers
                    
                    10. Process payment for rental
                    11. Complete payment
                    """);
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // <-- consume the leftover newline

            switch (choice) {
                case 0:
                    quit = true;
                    System.out.println("Exiting...");
                    break;
                case 1:
                    // Take inputs
                    System.out.print("Enter powertrain ( Electric, Gasoline): ");
                    powertrain = scanner.nextLine();

                    System.out.print("Enter vehicle class ( SUV, Sedan, Van): ");
                    vehicleClass = scanner.nextLine();

                    System.out.print("Enter brand: ");
                    brand = scanner.nextLine();

                    System.out.print("Enter model: ");
                    model = scanner.nextLine();

                    System.out.print("Enter price: ");
                    price = scanner.nextDouble();

                    Vehicle newVehicle = new Vehicle(ID++, powertrain, vehicleClass, brand, model, price, true);
                    Garage.addVehicle(newVehicle);
                    break;

                case 2:
                    System.out.print("Enter vehicle ID(int): ");
                    idSearch = scanner.nextInt();
                    Garage.removeVehicle(idSearch);
                    break;
                case 3:
                    System.out.print("Enter vehicle ID(int): ");
                    idSearch = scanner.nextInt();
                    Garage.updateVehicle(idSearch, scanner);
                    break;
                case 4:
                    System.out.println();
                    Garage.vehicleList();
                    break;
                case 5:
                    System.out.print("Enter vehicle ID(int): ");
                    idSearch = scanner.nextInt();
                    scanner.nextLine();

                    Vehicle vehicleToRent = Garage.findVehicle(idSearch);
                    if (vehicleToRent != null) {
                        System.out.print("Enter customer name: ");
                        String customerName = scanner.nextLine();

                        System.out.print("Enter number of days: ");
                        int days = scanner.nextInt();

                        rentSystem.rentVehicle(vehicleToRent, customerName, days);
                    } else {
                        System.out.println("Vehicle not found!");
                    }
                    break;
                case 6:
                    System.out.println();
                    rentSystem.showRents();
                    break;
                case 7:
                    System.out.print("Enter rental ID to return: ");
                    int rentIdToReturn = scanner.nextInt();
                    rentSystem.returnVehicle(rentIdToReturn);
                    break;
                case 8:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();

                    System.out.print("Enter date of birth (YYYY-MM-DD): ");
                    String dob = scanner.nextLine();

                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();

                    Customer newCustomer = new Customer(customerId++, customerName, dob, address, email, phone);
                    customerOps.addCustomer(newCustomer);
                    break;
                case 9:
                    customerOps.showAllCustomers();
                    break;
                case 10:
                    System.out.print("Enter rental ID: ");
                    int rentIdForPayment = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter customer ID: ");
                    int custId = scanner.nextInt();
                    scanner.nextLine();

                    Customer customerForPayment = customerOps.searchCustomerById(custId);
                    if (customerForPayment != null) {
                        System.out.print("Enter damage fee (0 if none): ");
                        double damageFee = scanner.nextDouble();

                        System.out.print("Enter discount (0 if none): ");
                        double discount = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Enter payment method (Cash/Card/Online): ");
                        String paymentMethod = scanner.nextLine();

                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String paymentDate = scanner.nextLine();
                        rentSystem.processPayment(rentIdForPayment, customerForPayment, damageFee, discount,
                                paymentMethod, paymentDate);
                    } else {
                        System.out.println("Customer not found!");
                    }
                    break;
                case 11:
                    System.out.print("Enter rental ID: ");
                    int rentIdForCompletion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter payment status (Completed/Failed): ");
                    String status = scanner.nextLine();

                    rentSystem.completePayment(rentIdForCompletion, status);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        } while (!quit);

        scanner.close();

    }

}
