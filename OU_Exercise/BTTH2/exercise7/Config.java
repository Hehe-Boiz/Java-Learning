package exercise7;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Config {
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final Scanner sc = new Scanner(System.in);
}