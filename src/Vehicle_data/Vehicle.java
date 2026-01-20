package Vehicle_data;

public class Vehicle {
    private int vehicleId;
    private String powertrain, vehicleClass, brand, model;
    private double price;
    private boolean isAvailable;

    public Vehicle(int vehicleId, String powertrain, String vehicleClass, String brand, String model, double price, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.powertrain = powertrain;
        this.vehicleClass = vehicleClass;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getPowertrain() {
        return powertrain;
    }

    public void setPowertrain(String powertrain) {
        this.powertrain = powertrain;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Vehicle_data.Vehicle{" +
                "vehicleId=" + vehicleId +
                ", powertrain='" + powertrain + '\'' +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
