package com.fedex.hm.patient_service.jmsController.jmsProducer;

import com.fedex.hm.patient_service.jmsController.outBoundAppointmentRequest.AppointmentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class AppointmentPublisher {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendAppointmentRequest(AppointmentRequest appointmentRequest){
        jmsTemplate.convertAndSend("appointment-queue", appointmentRequest);
    }

}
