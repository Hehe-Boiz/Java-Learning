package exercise2;

import java.io.*;
import java.util.*;

public class Exercise2 {
    public static void UpperCaseLetterOne(String inputPath, String outputPath) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(inputPath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath));

        String line;
        while((line = br.readLine()) != null ) {
            bw.write(line.toUpperCase());
            bw.write("\n");
        }

        br.close();
        bw.close();
    }

    public static void UpperCaseLetterTwo(String inputPath, String outputPath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputPath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath));
        String line;
        List<String> data = new ArrayList<String>();
        while((line = br.readLine()) != null ) {
            data.add(line.toUpperCase());
            data.add("\n");
        }
        if(!data.isEmpty()) {
            data.remove(data.size()-1);
        }
        for(String s : data) {
            bw.write(s);
        }
        br.close();
        bw.close();
    }

    public static void main(String[] args) {
        try {
            BufferedWriter bfWrite = new BufferedWriter(new FileWriter("OOP-Learning/Lab_9/exercise2/input.txt")); 
            bfWrite.write("information technology"); 
            bfWrite.newLine(); 
            bfWrite.write("nobject oriented programming");
            // fileTest.write("information technology\nobject oriented programming"); 
            bfWrite.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        String inputPath = "OOP-Learning/Lab_9/exercise2/input.txt";
        String outputPath = "OOP-Learning/Lab_9/exercise2/output.txt";
        
        try {
            UpperCaseLetterOne(inputPath, outputPath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        
    }
}
