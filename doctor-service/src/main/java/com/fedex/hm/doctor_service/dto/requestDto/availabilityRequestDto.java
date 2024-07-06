package com.fedex.hm.doctor_service.dto.requestDto;

public class availabilityRequestDto {
    private String date;
    private String slotTime;

    private boolean isBooked;

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }
}
