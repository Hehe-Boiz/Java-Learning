package OU_Exercise.MidTerm.EasyMedium;

import java.time.LocalDate;

public class RangeTime {
    private LocalDate startTime;
    private LocalDate endTime;
    
    public RangeTime(String startTime, String endTime) {
        this.startTime = LocalDate.parse(startTime, Config.FORMATTER);
        this.endTime = LocalDate.parse(endTime, Config.FORMATTER);
    }

    public boolean overlaps(RangeTime other) {
        return (startTime.isBefore(other.getEndTime()) && endTime.isAfter(other.getStartTime()));
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    
}
