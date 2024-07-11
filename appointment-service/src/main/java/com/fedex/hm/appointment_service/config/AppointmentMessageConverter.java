package com.fedex.hm.appointment_service.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fedex.hm.appointment_service.jmsController.inBoundAppointmentRequest.AppointmentRequest.AppointmentRequest;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;
import jakarta.jms.TextMessage;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

@Component
public class AppointmentMessageConverter implements MessageConverter {
    private static ObjectMapper mapper = new ObjectMapper();

    public AppointmentMessageConverter(ObjectMapper mapper) {
            this.mapper = mapper;
    }

    @Override
    public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
        String payload;
        try {
            payload = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new MessageConversionException("Error converting message to JSON", e);
        }
        TextMessage message = session.createTextMessage(payload);
        return message;
    }
    @Override
    public AppointmentRequest fromMessage(Message message) throws JMSException, MessageConversionException {
        TextMessage textMessage = (TextMessage) message;
        String payload = textMessage.getText();
        try {
            return mapper.readValue(payload, AppointmentRequest.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
