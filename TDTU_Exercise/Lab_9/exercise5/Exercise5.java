package exercise5;

import java.io.*;
import java.util.*;


public class Exercise5 {
    public static void calculateInfile(String input, String output) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(input));

        String line;
        int sum = 0;
        while((line = br.readLine()) != null){
            String[] nums = line.split("\\s+");

            for(String num : nums){
                sum += Integer.parseInt(num);
            }
        }


        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));
        bw.write(String.valueOf(sum));
        bw.close();
    }

    public static void main(String[] args) {
        try{
            String input = "OOP-Learning/Lab_9/exercise5/input.txt";
            String output = "OOP-Learning/Lab_9/exercise5/output.txt";

            calculateInfile(input, output);
        } catch(IOException e){
            System.out.println("An error occurred."); 
            e.printStackTrace(); 
        }
    }

    public static void calculateInfileNhan(){
        // test input
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("OOP-Learning/Lab_9/exercise5/input.txt"));
            pw.print("0 12 8 4\n6 100 1 9");
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // implement the task
        try {
            Scanner sc = new Scanner(new File("OOP-Learning/Lab_9/exercise5/input.txt"));
            int sum = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] arr = (line.split("\\s+"));
                for (String s : arr) {
                    sum += Integer.parseInt(s);
                }
            }
            sc.close();
            PrintWriter pw = new PrintWriter(new FileWriter("OOP-Learning/Lab_9/exercise5/output.txt"));
            pw.print(sum);
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
