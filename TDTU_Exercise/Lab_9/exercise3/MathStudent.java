package exercise3;

public class MathStudent extends Student{
    private String sID;

    public MathStudent() {
    }

    public MathStudent(String sID) {
        this.sID = sID;
    }

    public MathStudent(String sName, double gpa, String sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    @Override
    public String getRank(){
        if(getGpa() >=5 ) return "Passed";
        else if(getGpa() <5) return "Failed";
        return "None";
    }

    @Override
    public String toString() {
        return "MathStudent{" +
                "Name = " + getsName()+
                " - sID = '" + sID + '\'' +
                " - Gpa= " + getGpa()+
                '}';
    }

    
}
