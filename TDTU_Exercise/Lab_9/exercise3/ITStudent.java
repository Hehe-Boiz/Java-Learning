package exercise3;

public class ITStudent extends Student{
    private int sID;

    public ITStudent() {
    }

    public ITStudent(int sID) {
        this.sID = sID;
    }

    public ITStudent(String sName, double gpa, int sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    @Override
    public String getRank(){
        if(getGpa() <= 5) return "C";
        else if(getGpa() >5 && getGpa() <=8) return "B";
        else if(getGpa() > 8 && getGpa() <= 10) return "A";
        return "None"; 
    }

    @Override
    public String toString() {
        return "ITStudent{" +
                "Name = " + getsName()+
                " - sID = '" + sID + '\'' +
                " - Gpa= " + getGpa()+
                '}';
    }

    
}
