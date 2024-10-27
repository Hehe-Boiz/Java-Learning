package AssignmentRequire;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static String[] REQUIREMENT_OUTPUT_FILES = new String[] {
        "AssignmentRequire/output/Req1.txt",
        "AssignmentRequire/output/Req2_1.txt",
        "AssignmentRequire/output/Req2_2.txt",
        "AssignmentRequire/output/Req3_1.txt",
        "AssignmentRequire/output/Req3_2.txt",
        "AssignmentRequire/output/Req4_1.txt",
        "AssignmentRequire/output/Req4_2.txt",
        "AssignmentRequire/output/Req5.txt",
        "AssignmentRequire/output/Req6.txt",
    };
    public static void main(String[] args) {
        String roomPath = "AssignmentRequire/data/room_type.csv";
        String accPath = "AssignmentRequire/data/accommodation.csv";
        String roomInAccPath = "AssignmentRequire/data/room_in_accommodation.csv";

        File f = new File("AssignmentRequire/output");
        if (!f.exists()) {
            f.mkdirs();
        }

        ReservationSystem ReservationSystem = new ReservationSystem(accPath, roomPath, roomInAccPath);
        ArrayList<Accommodation> req1 = ReservationSystem.getAccommodations();
        writeFile(REQUIREMENT_OUTPUT_FILES[0], req1);
        List<Accommodation> req2_1 = ReservationSystem.searchForRoom("City H", 1);
        List<Accommodation> req2_2 = ReservationSystem.searchForRoom("City B", 1);
        writeFile(REQUIREMENT_OUTPUT_FILES[1], req2_1);
        writeFile(REQUIREMENT_OUTPUT_FILES[2], req2_2);

        List<Accommodation> req4_1 = ReservationSystem.searchInAdvance("City A", 2, "Standard", null,
                            null, null, null);
        List<Accommodation> req4_2 = ReservationSystem.searchInAdvance("City D", 20, "Standard", true,
                            5, true, null);
        writeFile(REQUIREMENT_OUTPUT_FILES[5], req4_1);
        writeFile(REQUIREMENT_OUTPUT_FILES[6], req4_2);
    }

    public static <E> boolean writeFile(String path, List<E> rows) {
        try {
            FileWriter writer = new FileWriter(path);
            for (E row : rows) {
                writer.write(row.toString());
                writer.write("\r\n");
            }

            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        } catch (Exception e) {
            System.out.println("Cannot write file");
            return false;
        }

        return true;
    }
}
