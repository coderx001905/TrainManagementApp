import java.util.ArrayList;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC2) ===");

        // 1. Create ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // 2. Add bogies
        System.out.println("\nAdding passenger bogies...");
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // 3. Display bogies after insertion
        System.out.println("Current bogies: " + bogies);

        // 4. Remove a bogie (AC Chair)
        System.out.println("\nRemoving 'AC Chair' bogie...");
        bogies.remove("AC Chair");

        // 5. Check existence of "Sleeper"
        System.out.println("\nChecking if 'Sleeper' exists...");
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // 6. Final list state
        System.out.println("\nFinal bogies: " + bogies);

        System.out.println("\nProgram continues...");
    }
}