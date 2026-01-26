import Vehicle_data.Vehicle;
import Vehicle_data.VehicleSystem;
import Vehicle_data.RentSystem;

import java.util.Scanner;

public class ManagementSystem {
    public static void main(String[] args) {
        String powertrain, vehicleClass, brand, model;
        double price;
        boolean quit = false;
        int ID = 1, idSearch, choice;
        Scanner scanner = new Scanner(System.in);

        Vehicle v1 = new Vehicle(ID++, "gasoline", "SUV", "Ford", "Escape", 30000, true);
        Vehicle v2 = new Vehicle(ID++, "gasoline", "SUV", "Ford", "Territory", 30000, true);
        // System.out.println(v1.toString());

        VehicleSystem Garage = new VehicleSystem();
        RentSystem rentSystem = new RentSystem();
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
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        } while (!quit);

        scanner.close();

    }

}
