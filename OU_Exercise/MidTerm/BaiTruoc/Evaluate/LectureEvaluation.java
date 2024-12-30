/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Evaluate;

/**
 *
 * @author Admin
 */
public class LectureEvaluation extends Evaluate{
    private Teacher gv;
    private double score;

    public LectureEvaluation(Teacher gv, double score, String content, Student student, String dateOfImplementation) {
        super(content, student, dateOfImplementation);
        if(isCheckScore(score)){
            throw new IllegalArgumentException("Đối số không hợp lệ");
        }
        this.gv = gv;
        this.score = score;
    }
    
    private boolean isCheckScore(double score){
        return score < 0 || score >4;
    }

    /**
     * @return the gv
     */
    public Teacher getGv() {
        return gv;
    }

    /**
     * @param gv the gv to set
     */
    public void setGv(Teacher gv) {
        this.gv = gv;
    }

    /**
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "LectureEvaluation{"+ super.toString() + "gv=" + gv + ", score=" + score + '}';
    }
    
    
}
