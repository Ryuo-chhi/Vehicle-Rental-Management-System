import Vehicle_data.Vehicle;
import Vehicle_data.VehicleSystem;


public class ManagementSystem {
    public static void main(String[] args){
        System.out.println("hello");
        System.out.println("Welcome to Java!");
        Vehicle v2 = new Vehicle(2,"gasoline", "SUV", "Ford", "Territory",30000,true);
        Vehicle v1 = new Vehicle(1,"gasoline", "SUV", "Ford", "Escape",30000,true);
//        System.out.println(v1.toString());

        VehicleSystem Garage = new VehicleSystem();
        Garage.addVehicle(v1);
        Garage.addVehicle(v2);

        Garage.vehicleList();
        Garage.removeVehicle(2);
        System.out.println();
        Garage.vehicleList();

    }


}
