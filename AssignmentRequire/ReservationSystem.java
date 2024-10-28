package AssignmentRequire;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationSystem {
    private ArrayList<Accommodation> accommodations;

    public ArrayList<Accommodation> getAccommodations() {
        return accommodations;
    }

    public ReservationSystem(String accPath, String roomPath, String roomOfAccPath) {
        this.accommodations = loadAccommodation(accPath, roomPath, roomOfAccPath);
    }

    public ArrayList<Accommodation> loadAccommodation(String accPath, String roomPath, String roomOfAccPath) {
        ArrayList<Accommodation> accommodation = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(accPath));
            String line;

            while ((line = br.readLine()) != null) {
                String[] elements = line.split(",");
                int choieAcc = elements.length;

                switch (choieAcc) {
                    case 5:
                        accommodation.add(new Homestay(Integer.parseInt(elements[0]), elements[1], elements[2],
                                elements[3], Float.parseFloat(elements[4])));
                        break;
                    case 7:
                        boolean is_pool_available_Resort = elements[5].equals("yes");
                        accommodation
                                .add(new Resort(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3],
                                        Float.parseFloat(elements[6]), Integer.parseInt(elements[4]),
                                        is_pool_available_Resort));
                        break;
                    case 6:
                        accommodation
                                .add(new Hotel(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3],
                                        Float.parseFloat(elements[5]), Integer.parseInt(elements[4])));
                        break;
                    case 10:
                        boolean is_welcome_drink_LuxuryAccommodation = elements[5].equals("yes");
                        boolean is_free_breakfast_LuxuryAccommodation = elements[6].equals("yes");
                        boolean is_gym_available_LuxuryAccommodation = elements[7].equals("yes");
                        boolean is_pool_available_LuxuryAccommodation = elements[4].equals("yes");
                        accommodation
                                .add(new Villa(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3],
                                        is_pool_available_LuxuryAccommodation, is_welcome_drink_LuxuryAccommodation,
                                        is_free_breakfast_LuxuryAccommodation, is_gym_available_LuxuryAccommodation,
                                        Integer.parseInt(elements[8]), Integer.parseInt(elements[9])));
                        break;
                    case 11:
                        // for(String i : elements){
                        // System.out.println(i);
                        // }
                        boolean is_serve_bar_CruiseShip = elements[8].equals("yes");
                        boolean is_welcome_drink_CruiseShip = elements[5].equals("yes");
                        boolean is_free_breakfast_CruiseShip = elements[6].equals("yes");
                        boolean is_gym_available_CruiseShip = elements[7].equals("yes");
                        boolean is_pool_available_CruiseShip = elements[4].equals("yes");
                        accommodation.add(
                                new CruiseShip(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3],
                                        is_pool_available_CruiseShip, is_welcome_drink_CruiseShip,
                                        is_free_breakfast_CruiseShip, is_gym_available_CruiseShip,
                                        Integer.parseInt(elements[9]), Integer.parseInt(elements[10]),
                                        is_serve_bar_CruiseShip));
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

        // thêm phòng cho từng nơi lưu trú
        ArrayList<Room> rooms = new ArrayList<>();
        try {
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
            while ((line = br.readLine()) != null) {
                String[] elements = line.split(",");

                int key = Integer.parseInt(elements[0]);
                int value = Integer.parseInt(elements[1]);

                if (room_acc.containsKey(key)) {
                    room_acc.get(key).add(value);
                } else {
                    ArrayList<Integer> listRoom = new ArrayList<>();
                    listRoom.add(value);
                    room_acc.put(key, listRoom);
                }

            }

            // đưa danh sách phòng vào từng thằng
            for (Integer key : room_acc.keySet()) {
                ArrayList<Room> temp = new ArrayList<>();
                for (Accommodation a : accommodation) {
                    if (a.iD_Accommodation == key) {
                        for (Integer value : room_acc.get(key)) {
                            for (Room room : rooms) {
                                if (room.getID_Room() == value) {
                                    temp.add(room);
                                }
                            }
                        }
                        CommonAccommodation b = (CommonAccommodation) a;
                        b.setRoom_List(temp);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error br3 Req1: " + e.getMessage());
            e.printStackTrace();
        }

        return accommodation;
    }

    public ArrayList<Accommodation> searchForRoom(String city, int numOfPeople) {
        ArrayList<Accommodation> outputList = new ArrayList<>();
        ArrayList<Accommodation> luxury = new ArrayList<>();
        ArrayList<Accommodation> common = new ArrayList<>();

        for (Accommodation acc : accommodations) {
            if (acc.city_Accommodation.equals(city)) {
                if (acc instanceof CommonAccommodation) {
                    CommonAccommodation b = (CommonAccommodation) acc;
                    int sum = 0;
                    for (Room room : b.getRoom_List()) {
                        sum += room.getMaximum_people_Room();
                    }
                    if (sum >= numOfPeople) {
                        common.add(b);
                    }
                } else {
                    LuxuryAccommodation b = (LuxuryAccommodation) acc;
                    if (b.getMaximum_people_can_serve_LuxuryAccommodation() >= numOfPeople) {
                        luxury.add(b);
                    }
                }
            }
        }

        Collections.sort(luxury, new Comparator<Accommodation>() {
            @Override
            public int compare(Accommodation acc1, Accommodation acc2) {
                return acc1.name_Accommodation.compareTo(acc2.name_Accommodation);
            }
        });

        Collections.sort(common, new Comparator<Accommodation>() {
            @Override
            public int compare(Accommodation acc1, Accommodation acc2) {
                return acc1.name_Accommodation.compareTo(acc2.name_Accommodation);
            }
        });

        outputList.addAll(luxury);
        outputList.addAll(common);

        return outputList;
    }

    // req 3
    public ArrayList<Accommodation> searchForRoomByRange(String reservationPath, double priceFrom,
            double priceTo, Date checkin, Date checkout, String city, int numOfPeople) {
        ArrayList<Accommodation> outpuList = new ArrayList<>();
        ArrayList<Reservation> reser = new ArrayList<>();
        // HashMap<Integer, Reservation> reservations = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(reservationPath));
            String line;

            while ((line = br.readLine()) != null) {
                String[] elements = line.split(",");

                int choie = elements.length;

                switch (choie) {
                    case 4:
                        long checkInLong = Long.parseLong(elements[2]);
                        long checkOutLong = Long.parseLong(elements[3]);

                        Date checkInDate = new Date(checkInLong);
                        Date checkOutDate = new Date(checkOutLong);
                        reser.add(new Reservation(Integer.parseInt(elements[0]), Integer.parseInt(elements[1]), -1,
                                checkInDate, checkOutDate));
                        // reservations.put(Integer.parseInt(elements[1]), new
                        // Reservation(Integer.parseInt(elements[0]),
                        // Integer.parseInt(elements[1]), -1, checkInDate, checkOutDate));
                        break;
                    case 5:
                        checkInLong = Long.parseLong(elements[3]);
                        checkOutLong = Long.parseLong(elements[4]);

                        checkInDate = new Date(checkInLong);
                        checkOutDate = new Date(checkOutLong);

                        reser.add(new Reservation(Integer.parseInt(elements[0]), Integer.parseInt(elements[1]),
                                Integer.parseInt(elements[2]), checkInDate, checkOutDate));
                        // reservations.put(Integer.parseInt(elements[0]),new
                        // Reservation(Integer.parseInt(elements[0]), Integer.parseInt(elements[1]),
                        // Integer.parseInt(elements[2]), checkInDate, checkOutDate));
                        break;
                    default:
                        System.out.println("Error: Invalid number of arguments in line: " + line);
                        break;
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reader req3");
        }

        for (Accommodation a : accommodations) {
            if (a.city_Accommodation.equals(city)) {
                if (a instanceof LuxuryAccommodation) {
                    LuxuryAccommodation b = (LuxuryAccommodation) a;

                    if (b.getPrice_night_LuxuryAccommodation() >= priceFrom
                            && b.getPrice_night_LuxuryAccommodation() <= priceTo
                            && b.getMaximum_people_can_serve_LuxuryAccommodation() <= numOfPeople + 2
                            && b.getMaximum_people_can_serve_LuxuryAccommodation() >= numOfPeople) {
                        boolean isReserved = false;
                        for (Reservation r : reser) {
                            if (r.getAccId() == a.iD_Accommodation && r.getRoomId() == -1) {
                                // isReserved = true;
                                Date start = r.getCheckin();
                                Date end = r.getCheckout();
                                if (start.compareTo(checkout) <= 0 && end.compareTo(checkin) >= 0) {
                                    isReserved = true;
                                    break;
                                }
                            }
                        }

                        if (!isReserved) {
                            outpuList.add(b);
                        }
                    }
                }

                else { // ay da
                    CommonAccommodation b = (CommonAccommodation) a;
                    for (Room room : b.getRoom_List()) {
                        if (room.getPrice_night_Room() >= priceFrom && room.getPrice_night_Room() <= priceTo
                                && (numOfPeople + 2 >= room.getMaximum_people_Room())
                                && (numOfPeople <= room.getMaximum_people_Room())) {
                            boolean isReserved = false;
                            for (Reservation r : reser) {
                                if (r.getAccId() == b.iD_Accommodation && (r.getRoomId() == room.getID_Room())) {
                                    // isReserved = true;
                                    Date start = r.getCheckin();
                                    Date end = r.getCheckout();
                                    if (start.compareTo(checkout) <= 0 && end.compareTo(checkin) >= 0) {
                                        System.out.println(b);
                                        isReserved = true;
                                        break;
                                    }
                                }
                            }
                            if (!isReserved) {
                                outpuList.add(b);
                            }
                        }
                    }
                }
            }
        }

        Collections.sort(outpuList, new Comparator<Accommodation>() {
            @Override
            public int compare(Accommodation a1, Accommodation a2) {
                return a2.name_Accommodation.compareTo(a1.name_Accommodation);
            }
        });

        return outpuList;
    }

    // req4
    public ArrayList<Accommodation> searchInAdvance(String city, Integer numOfPeople, String roomType,
            Boolean privatePool, Integer starQuality, Boolean freeBreakfast, Boolean privateBar) {
        ArrayList<Accommodation> finalFilter = new ArrayList<>();
        for (Accommodation a : accommodations) {
            if (a.city_Accommodation.equals(city)) {

                // xử lí cho LuxuryAccommodation
                if (a instanceof LuxuryAccommodation) {
                    boolean matches = true;
                    LuxuryAccommodation la = (LuxuryAccommodation) a;

                    if (la.getMaximum_people_can_serve_LuxuryAccommodation() < numOfPeople) {
                        matches = false;
                    }

                    if (privatePool != null) {
                        if (la.isIs_pool_available_LuxuryAccommodation() != privatePool) {
                            matches = false;
                        }
                    }

                    if (freeBreakfast != null) {
                        if (la.isIs_free_breakfast_LuxuryAccommodation() != freeBreakfast) {
                            matches = false;
                        }
                    }

                    if (privateBar != null && la instanceof CruiseShip) {
                        CruiseShip cs = (CruiseShip) la;
                        if (cs.isIs_serve_bar_CruiseShip() != privateBar ||
                                (numOfPeople != null
                                        && numOfPeople > cs.getMaximum_people_can_serve_LuxuryAccommodation())) {
                            matches = false;
                        }
                    }

                    if (starQuality != null) {
                        matches = false;
                    }

                    if (matches) {
                        finalFilter.add(a);
                        continue;
                    }
                }

                // chỉ sửa cho HomeStay để phù hợp thực tế
                // xử lí cho CommonAccommodation
                else {
                    boolean matches = true;
                    CommonAccommodation la = (CommonAccommodation) a;
                    boolean hasMatchingRoom = false;
                    int sumPeople = 0;

                    for (Room room : la.getRoom_List()) {
                        if (roomType != null && room.getType_Room().equals(roomType)) {
                            continue;
                        }

                        if (numOfPeople != null) {
                            if (la instanceof Hotel && numOfPeople > room.getMaximum_people_Room()
                                    || la instanceof Resort && numOfPeople > room.getMaximum_people_Room()) {
                                matches = false;
                                break;
                            } else if (la instanceof Homestay) {
                                sumPeople += room.getMaximum_people_Room();
                            }
                        }

                        hasMatchingRoom = true; // có ít nhất 1 phòng phù hợp

                    }

                    if (numOfPeople != null && a instanceof Homestay && numOfPeople > sumPeople) {
                        matches = false;
                        System.out.println("Tong phong" + sumPeople);
                        for (Room room : la.getRoom_List()) {
                            System.out.println(room);
                        }
                    }

                    if (!hasMatchingRoom) {
                        matches = false;
                    }

                    if (starQuality != null) {
                        if (la instanceof Hotel) {
                            Hotel h = (Hotel) la;
                            if (h.getRating_hotel() != starQuality) {
                                matches = false;
                            }
                        } else if (la instanceof Resort) {
                            Resort r = (Resort) la;
                            if (r.getRating_stars_Resort() != starQuality) {
                                matches = false;
                            }
                        } else {
                            matches = false;
                        }
                    }

                    if (matches) {
                        finalFilter.add(a);
                        continue;
                    }
                }
            }
        }
        return finalFilter;
    }

    // req5
    public double performReservation(String reservationPath, Accommodation acc, Room room, Date checkin, Date checkout)
            throws Exception {
        // ArrayList<Reservation> reser = new ArrayList<>();
        HashMap<Integer, ArrayList<Reservation>> reservations = new HashMap<>();
        HashMap<Integer, Accommodation> accs = new HashMap<>();
        int size = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(reservationPath));
            String line;

            while ((line = br.readLine()) != null) {
                String[] elements = line.split(",");

                int choie = elements.length;

                switch (choie) {
                    case 4:
                        long checkInLong = Long.parseLong(elements[2]);
                        long checkOutLong = Long.parseLong(elements[3]);

                        Date checkInDate = new Date(checkInLong);
                        Date checkOutDate = new Date(checkOutLong);
                        // reser.add(new Reservation(Integer.parseInt(elements[0]),
                        // Integer.parseInt(elements[1]), -1,
                        // checkInDate, checkOutDate));
                        if (!reservations.containsKey(Integer.parseInt(elements[1]))) {
                            reservations.put(Integer.parseInt(elements[1]), new ArrayList<>());
                        }
                        reservations.get(Integer.parseInt(elements[1]))
                                .add(new Reservation(Integer.parseInt(elements[0]),
                                        Integer.parseInt(elements[1]), -1, checkInDate, checkOutDate));
                        size++;
                        // reservations.put(Integer.parseInt(elements[1]), new
                        // Reservation(Integer.parseInt(elements[0]),
                        // Integer.parseInt(elements[1]), -1, checkInDate, checkOutDate));
                        break;
                    case 5:
                        checkInLong = Long.parseLong(elements[3]);
                        checkOutLong = Long.parseLong(elements[4]);

                        checkInDate = new Date(checkInLong);
                        checkOutDate = new Date(checkOutLong);
                        // reser.add(new Reservation(Integer.parseInt(elements[0]),
                        // Integer.parseInt(elements[1]),
                        // Integer.parseInt(elements[2]), checkInDate, checkOutDate));
                        if (!reservations.containsKey(Integer.parseInt(elements[1]))) {
                            reservations.put(Integer.parseInt(elements[1]), new ArrayList<>());
                        }
                        reservations.get(Integer.parseInt(elements[1]))
                                .add(new Reservation(Integer.parseInt(elements[0]), Integer.parseInt(elements[1]),
                                        Integer.parseInt(elements[2]), checkInDate, checkOutDate));
                        // reservations.put(Integer.parseInt(elements[0]),new
                        // Reservation(Integer.parseInt(elements[0]), Integer.parseInt(elements[1]),
                        // Integer.parseInt(elements[2]), checkInDate, checkOutDate));
                        size++;
                        break;
                    default:
                        System.out.println("Error: Invalid number of arguments in line: " + line);
                        break;
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reader req3");
        }

        for (Accommodation a : accommodations) {
            accs.put(a.iD_Accommodation, a);
        }

        // ánh xạ tới mảng các dịch vụ đã đặt trước
        for (Reservation r : reservations.getOrDefault(acc.iD_Accommodation, new ArrayList<>())) {
            if (r.getAccId() == acc.iD_Accommodation) {
                if ((acc instanceof LuxuryAccommodation && r.getRoomId() == -1) ||
                    (acc instanceof CommonAccommodation && r.getRoomId() == room.getID_Room())) {
                    
                    Date start = r.getCheckin();
                    Date end = r.getCheckout();
                    if (start.compareTo(checkout) <= 0 && end.compareTo(checkin) >= 0) {
                        throw new Exception("The room has already been booked during this time period.");
                    }
                }
            }
        }

        long startCheckIn = checkin.getTime();
        long endCheckOut = checkout.getTime();
        double totalMoney = room.getPrice_night_Room() * diffBetweenDays(startCheckIn, endCheckOut);
        double payMoney = totalMoney + 0.08 * totalMoney;

        // Lưu đặt phòng mới
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reservationPath, true))) {
            writer.newLine();
            String str = String.format("%d,%d,%d,%d,%d", 
                size, acc.iD_Accommodation, room.getID_Room(), startCheckIn, endCheckOut);
            writer.write(str);
        } catch (IOException e) {
            System.out.println("Error writing reservation");
        }
        return payMoney;
    }

    public long diffBetweenDays(long dateStart, long dateEnd) {
        Date date = new Date(dateStart * 1000);
        Date date1 = new Date(dateEnd * 1000);

        date = removeTime(date);
        date1 = removeTime(date1);

        long diff = Math.abs(date1.getTime() - date.getTime());
        long numOfDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return numOfDays;
    }

    private Date removeTime(Date date) {
        long time = date.getTime();
        long timeWithoutTime = time - (time % (24 * 60 * 60 * 1000));
        return new Date(timeWithoutTime);
    }
}
