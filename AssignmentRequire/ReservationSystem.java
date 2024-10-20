package AssignmentRequire;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ReservationSystem {
    private ArrayList<Accommodation> accommodations;

    public ArrayList<Accommodation> getAccommodations() {
        return accommodations;
    }

    public ReservationSystem(String accPath, String roomPath, String roomOfAccPath) {
        this.accommodations = loadAccommodation(accPath, roomPath, roomOfAccPath);
    }

    public ArrayList<Accommodation> loadAccommodation(String accPath, String roomPath, String roomOfAccPath){
        ArrayList<Accommodation> accommodation = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(accPath));
            String line;

            while((line = br.readLine()) != null){
                String[] elements = line.split(",");
                int choieAcc = elements.length;

                switch (choieAcc) {
                    case 5:
                        accommodation.add(new Homestay(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3], Float.parseFloat(elements[4])));
                        break;
                    case 7:
                        boolean is_pool_available_Resort = elements[5].equals("yes");
                        accommodation.add(new Resort(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3],
                            Float.parseFloat(elements[6]), Integer.parseInt(elements[4]), is_pool_available_Resort));
                        break;
                    case 6:
                        accommodation.add(new Hotel(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3],
                            Float.parseFloat(elements[5]), Integer.parseInt(elements[4])));
                        break;
                    case 10:
                        boolean is_welcome_drink_LuxuryAccommodation = elements[5].equals("yes");
                        boolean is_free_breakfast_LuxuryAccommodation = elements[6].equals("yes");
                        boolean is_gym_available_LuxuryAccommodation = elements[7].equals("yes");
                        boolean is_pool_available_LuxuryAccommodation = elements[4].equals("yes");
                        accommodation.add(new Villa(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3], 
                            is_pool_available_LuxuryAccommodation, is_welcome_drink_LuxuryAccommodation, 
                            is_free_breakfast_LuxuryAccommodation, is_gym_available_LuxuryAccommodation, 
                            Integer.parseInt(elements[8]), Integer.parseInt(elements[9])));
                        break;
                    case 11:
                        // for(String i : elements){
                        //     System.out.println(i);
                        // }
                        boolean is_serve_bar_CruiseShip = elements[8].equals("yes");
                        boolean is_welcome_drink_CruiseShip = elements[5].equals("yes");
                        boolean is_free_breakfast_CruiseShip = elements[6].equals("yes");
                        boolean is_gym_available_CruiseShip = elements[7].equals("yes");
                        boolean is_pool_available_CruiseShip = elements[4].equals("yes");
                        accommodation.add(new CruiseShip(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3], 
                            is_pool_available_CruiseShip, is_welcome_drink_CruiseShip, 
                            is_free_breakfast_CruiseShip, is_gym_available_CruiseShip, 
                            Integer.parseInt(elements[9]), Integer.parseInt(elements[10]), is_serve_bar_CruiseShip));
                        break;
                    default:
                        System.out.println("Error Req1: Incorrect format");
                        break;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error br1 Req1: " + e.getMessage());
            e.printStackTrace();
        }

        //thêm phòng cho từng nơi lưu trú 
        ArrayList<Room> rooms = new ArrayList<>(); 
        try{
            BufferedReader br = new BufferedReader(new FileReader(roomPath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] elements = line.split(","); 
                rooms.add(new Room(Integer.parseInt(elements[0]), elements[1], Integer.parseInt(elements[2]),
                    elements[3], Integer.parseInt(elements[4]), Integer.parseInt(elements[5]),
                    Double.parseDouble(elements[6]), Double.parseDouble(elements[7])));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error br2 Req1: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(roomOfAccPath));
            HashMap<Integer, ArrayList<Integer>> room_acc = new HashMap<>();

            String line;
            while((line = br.readLine()) != null){
                String [] elements = line.split(",");

                int key = Integer.parseInt(elements[0]);
                int value = Integer.parseInt(elements[1]);

                if(room_acc.containsKey(key)){
                    room_acc.get(key).add(value);
                }
                else {
                    ArrayList<Integer> listRoom = new ArrayList<>();
                    listRoom.add(value);
                    room_acc.put(key, listRoom); 
                }

            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error br3 Req1: " + e.getMessage());
            e.printStackTrace();
        }
        
        return accommodation;
    }
}
