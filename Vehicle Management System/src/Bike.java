public class Bike extends Vehicle implements MaintainenceTools
{
    public Bike(String model, String make, int year, float price) {
        super(model, make, year, price);
    }

    @Override
    void calculateMaintenanceCost()
    {
        System.out.println("Maintenance cost of Bike is Rs. 2,000");
    }

    @Override
    void performMaintenanceCheck() {
        System.out.println("Performance maintenance cost of Bike is checked.");
    }

    @Override
    public void maintainenceToolsName() {
        System.out.println("Maintenance Tools for Bikes:\n" +
                "\n" +
                "Bike Repair Stand\n" +
                "Bike Multi-Tool\n" +
                "Tire Levers and Patch Kit\n" +
                "Chain Lubricant\n" +
                "Brake Cable Cutter and Adjuster\n" +
                "Pedal Wrench\n" +
                "Spoke Wrench");
    }
    @Override
    public String toString() {
        return "Bike{" +
                "model='" + getModel() + '\'' +
                ", make='" + getMake() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                '}';
    }
}
