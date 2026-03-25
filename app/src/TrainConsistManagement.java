import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 🔹 Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for printing
    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // 🔹 Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // 🔹 Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 🔹 Display sorted bogies
        System.out.println("\nBogies sorted by capacity:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}



