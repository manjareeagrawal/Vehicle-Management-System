import java.util.List;

public class MaintenanceReminderManager {
    public static void sendMaintenanceReminder(List<Vehicle> vehicles) {
        System.out.println("\nSending maintenance reminders:");

        for (Vehicle vehicle : vehicles) {
            String message = "Maintenance reminder for " +
                    vehicle.getMake() + " " +
                    vehicle.getModel() + " " +
                    "with year " + vehicle.getYear() +
                    ". Please visit our service center for maintenance.";
            System.out.println(message);
        }
    }
}