/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Evaluate;

/**
 *
 * @author Admin
 */
public class FacilityEvalute extends Evaluate{
    private Facility facility;

    public FacilityEvalute(String facility, String content, Student student, String dateOfImplementation) {
        super(content, student, dateOfImplementation);
        if(!isCheckEnum(facility)){
            throw new IllegalArgumentException("Đối số không phù hợp");
        }
        this.facility = Facility.valueOf(facility);
    }
    
    private boolean isCheckEnum(String facility){
        return facility.equals("HHL") || facility.equals("VVT") || facility.equals("NH");
    }

    /**
     * @return the facility
     */
    public Facility getFacility() {
        return facility;
    }

    /**
     * @param facility the facility to set
     */
    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "FacilityEvalute{" +super.toString() + "facility=" + facility + '}';
    }
    
    
}
