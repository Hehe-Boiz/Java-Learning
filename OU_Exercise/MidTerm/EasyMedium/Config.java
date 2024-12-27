package OU_Exercise.MidTerm.EasyMedium;

import java.time.format.DateTimeFormatter;

public class Config {
    public final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final int MIN_BOOKING_DAYS = 1;
    public static final int MAX_BOOKING_DAYS = 30;
    public static final int MIN_ADVANCE_BOOKING_DAYS = 1;
    public static final double MIN_HOTEL_STARS = 3.0;
    public static final double MAX_HOTEL_STARS = 5.0;
    
    public static final double STANDARD_BASE_PRICE = 500000;
    public static final double DELUXE_BASE_PRICE = 1200000;
    public static final double SUITE_BASE_PRICE = 2000000;
    
    public static final double STANDARD_BED_PRICE = 100000;
    public static final double DELUXE_BED_PRICE = 200000;
    public static final double DELUXE_BALCONY_PRICE = 300000;
    public static final double SUITE_BEDROOM_PRICE = 500000;
    public static final double SUITE_KITCHEN_PRICE = 500000;
}
