
import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 🔹 Display after adding
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // 🔹 Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // 🔹 Display after removal
        System.out.println("\nPassenger Bogies after removal:");
        System.out.println(passengerBogies);

        // 🔹 Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present in the train.");
        } else {
            System.out.println("\nSleeper bogie is NOT present.");
        }

        // 🔹 Final state
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);
    }
}


