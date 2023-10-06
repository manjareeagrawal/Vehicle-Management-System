public class Truck extends Vehicle implements MaintainenceTools,VehicleFinancing
{
    public Truck(String model, String make, int year, float price) {
        super(model, make, year, price);
    }
    @Override
    void calculateMaintenanceCost()
    {
        System.out.println("Maintenance cost of Truck is Rs. 15,000");
    }

    @Override
    void performMaintenanceCheck() {
        System.out.println("Performance maintenance cost of Truck is checked.");
    }

    @Override
    public void maintainenceToolsName() {
        System.out.println("Maintenance Tools for Trucks:\n" +
                "\n" +
                "Diagnostic Scanner\n" +
                "Engine Hoist and Stand\n" +
                "Torque Wrench\n" +
                "Oil Drain Pan\n" +
                "Jack and Jack Stands\n" +
                "Socket Set and Wrenches\n" +
                "Lug Wrench\n" +
                "Grease Gun");
    }

    @Override
    public void calculateMonthlyPayment() {
        System.out.println("You need to pay 10,000 every month.");
    }
    @Override
    public String toString() {
        return "Truck{" +
                "model='" + getModel() + '\'' +
                ", make='" + getMake() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                '}';
    }
}
