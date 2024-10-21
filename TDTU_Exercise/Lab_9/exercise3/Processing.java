package exercise3;

import java.io.*;
import java.util.ArrayList;

public class Processing  {

    public ArrayList<Student> findStudent(ArrayList<Student> lstStu){
        ArrayList<Student> studentAPassed = new ArrayList<>();

        for (Student student : lstStu){
            if(student.getRank().equals("A") || student.getRank().equals("Passed")){
                studentAPassed.add(student);
            }
        }
        return studentAPassed;
    }

    public static <E> boolean writeFileBuffer(String path, ArrayList<E> lst){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for(int i = 0;i<lst.size() ; i++){
                bw.write(lst.get(i).toString());
                if(i < lst.size()){
                    bw.write("\n");
                }
            }
            bw.close();
            return true;
        }
        catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }

    public static <E> boolean writeFilePrint(String path, ArrayList<E> lst){
        try{
            PrintWriter writer = new PrintWriter(new FileWriter(path));
            for(int i = 0; i < lst.size(); i++){
                E data = lst.get(i);
                writer.print(data);
                if((i < lst.size() - 1)){
                    writer.println();
                }
            }
            writer.close();
            return true;
        }
        catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }


    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new ITStudent("Nhut",9.37,12345));
        listStudent.add(new MathStudent("HeheBoiz",6.7,"523H0132"));
        listStudent.add(new ITStudent("Nguyen Van A",7.1,43211));
        listStudent.add(new MathStudent("Nguyen Van B",1.7,"123H1234"));

        Processing p1 = new Processing();

        if(writeFileBuffer("OOP-Learning/Lab_9/exercise3/output.txt", p1.findStudent(listStudent))) {
            System.out.println("Success!");
        }
        else{
            System.out.println("Failure!");
        }

    }
}
