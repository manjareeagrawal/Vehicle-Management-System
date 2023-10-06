import java.util.ArrayList;
import java.util.List;

public class VehicleDataStorage {
    private List<Vehicle> vehicles;

    public VehicleDataStorage() {
        vehicles = new ArrayList<>();

    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }
    public List<Vehicle> filterVehicles(List<Vehicle> allVehicles, int filterOption) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : allVehicles) {
            if (filterOption == 1) {
                filteredVehicles.add(vehicle);
            } else if (filterOption == 2 && vehicle instanceof Car) {
                filteredVehicles.add(vehicle);
            } else if (filterOption == 3 && vehicle instanceof Bike) {
                filteredVehicles.add(vehicle);
            } else if (filterOption == 4 && vehicle instanceof Truck) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }
    public void printVehicles(List<Vehicle> vehicles) {
        System.out.println("\nAvailable Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void calculateMaintenanceCostForVehicleType(List<Vehicle> vehicles, Class<?> vehicleClass) {
        System.out.println("Maintenance costs for " + vehicleClass.getSimpleName() + "s:");
        for (Vehicle vehicle : vehicles) {
            if (vehicleClass.isInstance(vehicle)) {
                System.out.println("Maintenance cost for " + vehicle + ":");
                vehicle.calculateMaintenanceCost();
                break;
            }
        }
    }
}
