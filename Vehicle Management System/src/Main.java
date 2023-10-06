import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("WELCOME TO MY SHOP !");
        VehicleDataStorage dataStorage=new VehicleDataStorage();

        // Create different vehicles
        Vehicle car1 = new Car("Sedan", "Toyota", 2022, 25000, 4);
        Vehicle bike1 = new Bike("Mountain Bike", "Trek", 2021, 800);
        Vehicle truck1 = new Truck("Semi-Truck", "Volvo", 2020, 80000);

        Vehicle car2 = new Car("SUV", "Honda", 2023, 30000, 5);
        Vehicle bike2 = new Bike("Road Bike", "Cannondale", 2022, 1200);
        Vehicle truck2 = new Truck("Pickup Truck", "Ford", 2021, 35000);

        Vehicle car3 = new Car("Convertible", "BMW", 2022, 45000, 2);
        Vehicle bike3 = new Bike("Electric Bike", "Specialized", 2023, 2500);
        Vehicle truck3 = new Truck("Dump Truck", "Caterpillar", 2021, 120000);

        Vehicle car4 = new Car("Hatchback", "Hyundai", 2022, 18000, 5);
        Vehicle bike4 = new Bike("City Bike", "Giant", 2022, 600);
        Vehicle truck4 = new Truck("Delivery Truck", "Isuzu", 2020, 45000);

        dataStorage.addVehicle(car1);
        dataStorage.addVehicle(bike1);
        dataStorage.addVehicle(truck1);
        dataStorage.addVehicle(car2);
        dataStorage.addVehicle(bike2);
        dataStorage.addVehicle(truck2);
        dataStorage.addVehicle(car3);
        dataStorage.addVehicle(bike3);
        dataStorage.addVehicle(truck3);

        CustomerDataStorage customerDataStorage = new CustomerDataStorage();

        Customer customer1 = new Customer("Manjaree", "manjaree@example.com", "9828423224");
        Customer customer2 = new Customer("Sakshi", "sakshi@example.com", "9876543210");
        Customer customer3 = new Customer("Bhavya", "bhavya@example.com", "9876598765");
        VIPCustomer vipCustomer1 = new VIPCustomer("Jasneet","jasneet@gmail.com","98766587",5);

        customerDataStorage.addCustomer(customer1);
        customerDataStorage.addCustomer(customer2);
        customerDataStorage.addCustomer(customer3);
        customerDataStorage.addVIPCustomer(vipCustomer1);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Inquire about vehicles");
            System.out.println("2. Schedule a test drive");
            System.out.println("3. Receive maintenance reminders");
            System.out.println("4. View customers list");
            System.out.println("5. Get Sales System Information");
            System.out.println("6. Get Maintenance Cost");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nFilter Options:");
                    System.out.println("1. Show all vehicles");
                    System.out.println("2. Show only cars");
                    System.out.println("3. Show only bikes");
                    System.out.println("4. Show only trucks");
                    System.out.print("Select a filter option: ");
                    int filterOption = scanner.nextInt();
                    List<Vehicle> filteredVehicles = dataStorage.filterVehicles(dataStorage.getAllVehicles(), filterOption);
                    dataStorage.printVehicles(filteredVehicles);
                    break;
                case 2:
                    List<Vehicle> allVehicles2 = dataStorage.getAllVehicles();
                    System.out.println("\nAvailable Vehicles: Select one from the list.");
                    for (int i = 0; i < allVehicles2.size(); i++) {
                        System.out.println(i + ". " + allVehicles2.get(i));
                    }

                    System.out.print("Enter the index of the vehicle to schedule a test drive: ");
                    int selectedVehicleIndex = scanner.nextInt();
                    scanner.nextLine();

                    if (selectedVehicleIndex >= 0 && selectedVehicleIndex < allVehicles2.size()) {
                        Vehicle selectedVehicle = allVehicles2.get(selectedVehicleIndex);

                        System.out.println("Select the type of customer:");
                        System.out.println("1. Normal Customer");
                        System.out.println("2. VIP Customer");
                        System.out.print("Enter the customer type (1/2): ");
                        int customerType = scanner.nextInt();
                        scanner.nextLine();

                        if (customerType == 1) {
                            // Normal Customer
                            System.out.print("Enter customer name: ");
                            String customerName = scanner.nextLine();
                            System.out.print("Enter customer email: ");
                            String customerEmail = scanner.nextLine();
                            System.out.print("Enter customer phone number: ");
                            String customerPhone = scanner.nextLine();

                            Customer customer = new Customer(customerName, customerEmail, customerPhone);
                            customerDataStorage.addCustomer(customer);
                            TestDriveManager.scheduleTestDrive(selectedVehicle, customer);
                        } else if (customerType == 2) {
                            // VIP Customer
                            System.out.print("Enter customer name: ");
                            String customerName = scanner.nextLine();
                            System.out.print("Enter customer email: ");
                            String customerEmail = scanner.nextLine();
                            System.out.print("Enter customer phone number: ");
                            String customerPhone = scanner.nextLine();
                            System.out.print("Enter VIP level: ");
                            int vipLevel = scanner.nextInt();
                            scanner.nextLine();

                            VIPCustomer vipCustomer = new VIPCustomer(customerName, customerEmail, customerPhone, vipLevel);
                            customerDataStorage.addCustomer(vipCustomer);
                            TestDriveManager.scheduleTestDrive(selectedVehicle, vipCustomer);
                        } else {
                            System.out.println("Invalid customer type selection.");
                        }
                    } else {
                        System.out.println("Invalid vehicle selection.");
                    }
                    break;
                case 3:
                    List<Vehicle> allVehicles3 = dataStorage.getAllVehicles();
                    MaintenanceReminderManager.sendMaintenanceReminder(allVehicles3);
                    break;
                case 4:
                    List<Customer> allCustomers = customerDataStorage.getAllCustomers();
                    System.out.println("\nAll Customers:");
                    for (Customer customer : allCustomers) {
                        System.out.println(customer);
                    }
                    break;
                case 5:
                    SalesSystem salesSystem = new SalesSystem();
                    System.out.println("Select an option:");
                    System.out.println("1. Invoicing");
                    System.out.println("2. Customer Handling");
                    System.out.println("3. Vehicle Allocation");
                    int option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            Invoicing invoicing = new Invoicing();
                            invoicing.InvoicingFunction();
                            break;
                        case 2:
                            CustomerHandling customerHandling = new CustomerHandling();
                            customerHandling.CustomerHandlingFunction();
                            break;
                        case 3:
                            VehicleAllocation vehicleAllocation = new VehicleAllocation();
                            vehicleAllocation.VehicleAllocationSystem();
                            break;
                        default:
                            System.out.println("Invalid option.");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("\nCalculate Maintenance Cost:");
                    System.out.println("1. Car");
                    System.out.println("2. Bike");
                    System.out.println("3. Truck");
                    System.out.print("Enter the type of vehicle (1/2/3): ");
                    int vehicleType = scanner.nextInt();
                    List<Vehicle> allVehicles = dataStorage.getAllVehicles();

                    switch (vehicleType) {
                        case 1:
                            System.out.println("\nCalculating maintenance cost for Cars:");
                            dataStorage.calculateMaintenanceCostForVehicleType(allVehicles, Car.class);
                            break;
                        case 2:
                            System.out.println("\nCalculating maintenance cost for Bikes:");
                            dataStorage.calculateMaintenanceCostForVehicleType(allVehicles, Bike.class);
                            break;
                        case 3:
                            System.out.println("\nCalculating maintenance cost for Trucks:");
                            dataStorage.calculateMaintenanceCostForVehicleType(allVehicles, Truck.class);
                            break;
                        default:
                            System.out.println("Invalid vehicle type.");
                            break;
                    }
                    break;

                case 7:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

    }
}