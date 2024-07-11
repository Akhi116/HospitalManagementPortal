package com.fedex.hm.appointment_service.jmsController;


import com.fedex.hm.appointment_service.jmsController.inBoundAppointmentRequest.AppointmentRequest.AppointmentRequest;
import com.fedex.hm.appointment_service.jmsController.inBoundAppointmentRequest.updateAvailabilityRequest.updateAvailabilityRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import com.fedex.hm.appointment_service.util.timeFormatter;

import java.text.ParseException;

@Component
public class AppointmentConsumer {

    @Autowired
    private timeFormatter timeFormatter;

    @Autowired
    private JmsTemplate jmsTemplate;

    @JmsListener(destination = "appointment-queue")
    public void receiveMessage(AppointmentRequest response) throws ParseException {
        System.out.println("Hello..!!");
        try {
            timeFormatter.parseTime(response);

            updateAvailabilityRequest request = new updateAvailabilityRequest();
            request.setDoctorId(response.getDoctorId());
            request.setAvailabilitySchedule(response.getAvailabilitySchedule());

            jmsTemplate.convertAndSend("availability-queue", request);
        } catch (ParseException e){
            System.out.println("Error parsing time in Appointment Consumer..!!");
        }

    }

}
