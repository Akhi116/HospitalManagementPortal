package com.fedex.hm.doctor_service.jmsController;


import com.fedex.hm.doctor_service.jmsController.outBoundMessage.updateAvailabilityRequest;
import com.fedex.hm.doctor_service.service.doctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class updateAvailabilityConsumer {

    @Autowired
    private doctorService doctorService;

    @JmsListener(destination = "availability-queue")
    public void receiveMessage(updateAvailabilityRequest request){
        doctorService.updateAvailabilitySchedule(request);

    }
}
