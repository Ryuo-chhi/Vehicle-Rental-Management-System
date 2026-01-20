import Vehicle_data.Vehicle;

public class ManagementSystem {
    public static void main(String[] args){
        System.out.println("hello");
        System.out.println("Welcome to Java!");
        Vehicle v1 = new Vehicle(1,"gasoline", "SUV", "Ford", "Escape",30000,true);
        System.out.println(v1.toString());
    }


}
