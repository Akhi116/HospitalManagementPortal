package com.fedex.hm.doctor_service.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fedex.hm.doctor_service.jmsController.outBoundMessage.updateAvailabilityRequest;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;
import jakarta.jms.TextMessage;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

@Component
public class AvailabilityMessageConverter implements MessageConverter {
    private static final ObjectMapper mapper = new ObjectMapper();

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
    public updateAvailabilityRequest fromMessage(Message message) throws JMSException, MessageConversionException {
        TextMessage textMessage = (TextMessage) message;
        String payload = textMessage.getText();
        try {
            return mapper.readValue(payload, updateAvailabilityRequest.class);
        } catch (JsonProcessingException e) {

            throw new RuntimeException(e);
        }
    }
}
