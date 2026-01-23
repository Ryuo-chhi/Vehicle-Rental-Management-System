package Vehicle_data;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleSystem {
    private ArrayList<Vehicle> garage = new ArrayList<>();
    public void addVehicle(Vehicle v1){
        garage.add(v1);
    }
    public void vehicleList(){
        for(Vehicle item: garage){
            System.out.println(item.toString());
        }
    }

    public void removeVehicle(int id){
        garage.removeIf(v -> v.getVehicleId() == id);
    }

    public void updateVehicle(int id){

        for(Vehicle item: garage){
            if(item.getVehicleId() == id){

                Scanner input = new Scanner(System.in);
                //powerTrain VehicleClass brand model price status

                return;
            }
        }
        System.out.println("Vehicle not found!");
    }
}
