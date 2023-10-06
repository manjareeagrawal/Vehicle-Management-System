import java.util.List;

public class TestDriveManager
{
        public static void scheduleTestDrive(Vehicle selectedVehicle, Customer customerName) {

            System.out.println("Scheduled a test drive for:");
            System.out.println(selectedVehicle);
            System.out.println("Customer: " + customerName.getName());
        }

}
