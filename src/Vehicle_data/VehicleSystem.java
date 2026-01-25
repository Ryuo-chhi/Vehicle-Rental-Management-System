package Vehicle_data;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleSystem {
    private ArrayList<Vehicle> garage = new ArrayList<>();

    public void addVehicle(Vehicle v1){
        garage.add(v1);
        System.out.println("Add vehicle successfully.");
    }
    public void vehicleList(){
        for(Vehicle item: garage){
            System.out.println(item.toString());
        }
    }

    public void removeVehicle(int id){
        if(garage.isEmpty()){
            System.out.println("No vehicle to remove!");
            return;
        }
        boolean removed = garage.removeIf(v -> v.getVehicleId() == id);

        if (removed) {
            System.out.println("Vehicle with ID " + id + " removed successfully.");
        } else {
            System.out.println("Vehicle with ID " + id + " not found.");
        }
    }

    public void updateVehicle(int id){

        for(Vehicle item: garage){
            if(item.getVehicleId() == id){

                Scanner scanner = new Scanner(System.in);
                boolean quit = false;
                int choice;
                do{
                    //powerTrain VehicleClass brand model price status
                    System.out.println("""
                            Update vehicle:
                            0.Quit
                            1. PowerTrain
                            2. Vehicle Class
                            3. Brand
                            4. Model
                            5. Price
                            6. Status""");

                    System.out.print("Enter choice: ");
                    choice = scanner.nextInt();
                    switch (choice){
                        case 0:
                            quit = true;
                            break;
                        case 1:
                            System.out.print("New PowerTrain: ");
                            String powerTrain = scanner.nextLine();
                            item.setPowertrain(powerTrain);
                            break;

                        case 2:
                            System.out.print("New Vehicle Class: ");
                            String VehicleClass = scanner.nextLine();
                            item.setVehicleClass(VehicleClass);
                            break;

                        case 3:
                            System.out.print("New Brand: ");
                            String brand = scanner.nextLine();
                            item.setBrand(brand);
                            break;

                        case 4:
                            System.out.print("New Model: ");
                            String model = scanner.nextLine();
                            item.setModel(model);
                            break;

                        case 5:
                            System.out.print("New Price: ");
                            int price = scanner.nextInt();
                            item.setPrice(price);
                            break;

                        case 6:
                            System.out.print("Update status(true/false): ");
                            boolean status = scanner.nextBoolean();
                            item.setAvailable(status);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    System.out.println();

                }while(!quit);
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }
}
