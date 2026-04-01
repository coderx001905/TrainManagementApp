import java.util.HashMap;
import java.util.Map;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC6) ===");

        // 1. Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // 2. Insert bogie capacities
        System.out.println("\nAdding bogie capacity details...");
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // 3. Iterate using entrySet()
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram continues...");
    }
}