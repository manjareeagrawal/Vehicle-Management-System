abstract class Vehicle
{
    private String model;
    private String make;
    private int year;
    private float price;

    public Vehicle(String model, String make, int year, float price) {
        this.model=model;
        this.make=make;
        this.year=year;
        this.price=price;
    }

    abstract void calculateMaintenanceCost();
    abstract void performMaintenanceCheck();

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
