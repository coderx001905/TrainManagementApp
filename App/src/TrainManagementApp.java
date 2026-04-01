import java.util.HashSet;

public class TrainManagementApp{

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC3) ===");

        // 1. Create HashSet for unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // 2. Add bogie IDs (including duplicates)
        System.out.println("\nAdding bogie IDs...");

        addBogie(bogieIDs, "B101");
        addBogie(bogieIDs, "B102");
        addBogie(bogieIDs, "B103");
        addBogie(bogieIDs, "B101"); // duplicate
        addBogie(bogieIDs, "B102"); // duplicate

        // 3. Display unique bogie IDs
        System.out.println("\nUnique bogie IDs:");
        System.out.println(bogieIDs);

        System.out.println("\nProgram continues...");
    }

    // Helper method to show duplicate handling clearly
    public static void addBogie(HashSet<String> set, String id) {
        if (set.add(id)) {
            System.out.println("Added: " + id);
        } else {
            System.out.println("Duplicate ignored: " + id);
        }
    }
}