import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Bogie class (custom object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for clean printing
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC7) ===");

        // 2. Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // 3. Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore sorting:");
        System.out.println(bogies);

        // 4. Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 5. Display sorted bogies
        System.out.println("\nAfter sorting by capacity (ascending):");
        System.out.println(bogies);

        System.out.println("\nProgram continues...");
    }
}