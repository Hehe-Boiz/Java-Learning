package exercise4;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {

    public static ArrayList<File> fileExtensions(String path, String extension){
        File folder = new File(path);
        if(!folder.exists()){
            return null;
        }


        File [] files = folder.listFiles();
        ArrayList<File> containFiles = new ArrayList<>();

        if(files != null){
            for(File file : files){
                if(file.getName().contains(extension)){

                }
            }
        }
        return containFiles;
    }

    public static boolean isExistsFile(String path){
        File file = new File(path);
        return file.exists();
    }

    public static String checkPath(String path){
        File file = new File(path);
        if(file.isDirectory()){
            return file.getName() + " is a directory";
        }
        else if (file.isFile()){
            return file.getName() + " is a file";
        }
        else {
            return file.getName() + " does not exist.";
        }
    }

    public static void appendFile(String path, String text) throws IOException{
        BufferedWriter bw = new BufferedWriter( new FileWriter(path, true));
        bw.append(text);
        bw.close();
    }

    public static String longestWord(String path) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line;
        int countLongest = 0;
        String longest = "";


        while ((line = reader.readLine())  != null){
            String[] words = line.split("\\s+");
            for(String word : words){
                if(word.length() > countLongest){
                    countLongest = word.length();
                    longest = word;
                }
            }
        }
        reader.close();
        return longest;
    }

    public static String longestWordNhan(String path) throws IOException {
        Map<String,Integer> mapWordCount = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while((line = reader.readLine()) != null){
            Matcher matcher = Pattern.compile("\\b[a-zA-Z]+\\b").matcher(line);
            while (matcher.find()) {
                String word = matcher.group();
                mapWordCount.put(word, word.length());
            }
        }
        reader.close();
        String longestWord = "";
        int maxLength = 0;
        for(Map.Entry<String, Integer> entry : mapWordCount.entrySet()){
            if(entry.getValue() > maxLength) {
                longestWord = entry.getKey();
                maxLength = entry.getValue();
            }
        }

        return longestWord; // if there are more word which have the same length so we need return the list of word right ???
    }

    public static void main(String[] args) {
        String inputPath;
        
        // task 1
        System.out.println("Task 1:");
        inputPath = "OOP-Learning/Lab_9/test/task1";
        String extension = "txt";
        for (File file : fileExtensions(inputPath, extension)) {
            System.out.println("File " + file);
        }

        // task 2
        System.out.println();
        System.out.println("Task 2:");
        inputPath = "OOP-Learning/Lab_9/test/task2/test1.cpp";
        System.out.println(inputPath+" is exists: "+ isExistsFile(inputPath));

        // task 3
        System.out.println();
        System.out.println("Task 3:");
        inputPath = "OOP-Learning/Lab_9/test/task3/test1.cpp";
        System.out.println(inputPath+":  "+ checkPath(inputPath));
        inputPath = "OOP-Learning/Lab_9/test/task3/test2.txt";
        System.out.println(inputPath+":  "+ checkPath(inputPath));
        inputPath = "OOP-Learning/Lab_9/test/task3";
        System.out.println(inputPath+":  "+ checkPath(inputPath));

        // task 4
        System.out.println();
        System.out.println("Task 4:");
        inputPath = "OOP-Learning/Lab_9/test/task4/test.txt";
        String appendString = ", nice too meet you";
        try{
            appendFile(inputPath, appendString);
            System.out.println("Append successfully");
        }
        catch (IOException e){
            System.err.println("Error: "+e.getMessage());
        }

        // task 5
        System.out.println();
        System.out.println("Task 5:");
        inputPath = "OOP-Learning/Lab_9/test/task5/test.txt";
        try{
            System.out.println("Longest Word in file '"+inputPath+"' is: "+longestWord(inputPath));
        }
        catch (IOException e){
            System.err.println("Error: "+e.getMessage());
        }
    }
}
