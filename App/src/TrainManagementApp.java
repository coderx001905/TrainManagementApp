import java.util.LinkedList;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC4) ===");

        // 1. Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // 2. Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial train consist:");
        System.out.println(train);

        // 3. Insert Pantry Car at position 2 (index 2)
        System.out.println("\nInserting 'Pantry Car' at position 2...");
        train.add(2, "Pantry Car");

        System.out.println("After insertion:");
        System.out.println(train);

        // 4. Remove first and last bogie
        System.out.println("\nRemoving first and last bogies...");
        train.removeFirst();
        train.removeLast();

        // 5. Final train consist
        System.out.println("\nFinal train consist:");
        System.out.println(train);

        System.out.println("\nProgram continues...");
    }
}