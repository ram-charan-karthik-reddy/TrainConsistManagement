import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // 🔹 Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 🔹 Add duplicate bogie
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // 🔹 Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);
    }
}



