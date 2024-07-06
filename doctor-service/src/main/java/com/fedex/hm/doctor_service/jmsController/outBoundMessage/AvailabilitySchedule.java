package com.fedex.hm.doctor_service.jmsController.outBoundMessage;

import java.util.Date;

public class AvailabilitySchedule {

    private Date date;
    private String slotTime;

    public String getSlotTime() {
        return slotTime;
    }
    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
