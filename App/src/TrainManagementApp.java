import java.util.LinkedHashSet;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC5) ===");

        // 1. Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // 2. Add bogies
        System.out.println("\nAdding bogies...");
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // 3. Attempt to add duplicate
        System.out.println("\nAttempting to add duplicate 'Sleeper'...");
        boolean added = train.add("Sleeper");

        if (!added) {
            System.out.println("Duplicate ignored: Sleeper");
        }

        // 4. Display final formation
        System.out.println("\nFinal train formation:");
        System.out.println(train);

        System.out.println("\nProgram continues...");
    }
}