
public class Car extends Vehicle implements MaintainenceTools
{
    private int numDoors;
    public Car(String model, String make, int year, float price, int numDoors) {
        super(model, make, year, price);
        this.numDoors = numDoors;
    }

    @Override
    void calculateMaintenanceCost()
    {
        System.out.println("Maintenance cost of Car is Rs. 5,000");
    }

    @Override
    void performMaintenanceCheck() {
        System.out.println("Performance maintenance cost of Car is checked.");
    }

    void numberOfDoors(int d)
    {
        this.numDoors=d;
        System.out.println("Number of doors should be: "+numDoors);
    }

    @Override
    public void maintainenceToolsName() {
        System.out.println("Maintenance Tools for Cars:\n" +
                "\n" +
                "OBD-II Scanner\n" +
                "Jack and Jack Stands\n" +
                "Socket Set and Wrenches\n" +
                "Oil Filter Wrench\n" +
                "Tire Pressure Gauge\n" +
                "Spark Plug Gap Tool\n" +
                "Battery Charger");
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                ", make='" + getMake() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                ", numberDoors=" + numDoors +
                '}';
    }
}
