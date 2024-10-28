import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static String[] REQUIREMENT_OUTPUT_FILES = new String[] {
            "./output/Req1.txt",
            "./output/Req2_1.txt",
            "./output/Req2_2.txt",
            "./output/Req3_1.txt",
            "./output/Req3_2.txt",
            "./output/Req4_1.txt",
            "./output/Req4_2.txt",
            "./output/Req5.txt",
            "./output/Req6.txt",
    };

    public static void main(String[] args) {
        String roomPath = "data/room_type.csv";
        String accPath = "data/accommodation.csv";
        String roomInAccPath = "data/room_in_accommodation.csv";

        File f = new File("./output");
        if (!f.exists()) {
            f.mkdirs();
        }

        ReservationSystem ReservationSystem = new ReservationSystem(accPath, roomPath, roomInAccPath);

        for (String arg : args) {
            switch (arg) {
                case "1":
                    // requirement 1
                    ArrayList<Accommodation> req1 = ReservationSystem.getAccommodations();
                    writeFile(REQUIREMENT_OUTPUT_FILES[0], req1);
                    break;
                case "2":
                    // requirement 2
                    List<Accommodation> req2_1 = ReservationSystem.searchForRoom("City H", 1);
                    List<Accommodation> req2_2 = ReservationSystem.searchForRoom("City B", 1);
                    writeFile(REQUIREMENT_OUTPUT_FILES[1], req2_1);
                    writeFile(REQUIREMENT_OUTPUT_FILES[2], req2_2);
                    break;
                case "3":
                    // requirement 3
                    List<Accommodation> req3_1 = ReservationSystem.searchForRoomByRange("data/reservation_3.csv", 10,
                            3000,
                            new Date(1713512750), new Date(1713771950), "City H", 1);
                    List<Accommodation> req3_2 = ReservationSystem.searchForRoomByRange("data/reservation_3.csv", 10,
                            3000,
                            new Date(1713512750), new Date(1713771950), "City B", 1);
                    writeFile(REQUIREMENT_OUTPUT_FILES[3], req3_1);
                    writeFile(REQUIREMENT_OUTPUT_FILES[4], req3_2);
                    break;
                case "4":
                    // requirement 4
                    List<Accommodation> req4_1 = ReservationSystem.searchInAdvance("City A", 2, "Standard", null,
                            null, null, null);
                    List<Accommodation> req4_2 = ReservationSystem.searchInAdvance("City D", 20, "Standard", true,
                            5, true, null);
                    writeFile(REQUIREMENT_OUTPUT_FILES[5], req4_1);
                    writeFile(REQUIREMENT_OUTPUT_FILES[6], req4_2);
                    break;
                case "5":
                    // requirement 5
                    ArrayList<String> req5 = new ArrayList<>();
                    try {
                        Accommodation acc = new Homestay(1, "Cozy Homestay", "123 Main St", "City A", 4.8f);
                        Room room = new Room(1, "Single Room", 1, "Standard", 1, 1, 20.0, 50.0);
                        double totalPrice = ReservationSystem.performReservation("data/reservation_5.csv", acc, room,
                                new Date(1713368812), new Date(1713398812));
                        req5.add(String.valueOf(totalPrice));
                    } catch (Exception e) {
                        req5.add(String.valueOf(e.getMessage()));
                    }
                    writeFile(REQUIREMENT_OUTPUT_FILES[7], req5);
                    break;
            }
        }
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