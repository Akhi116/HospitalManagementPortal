package com.fedex.hm.appointment_service.util;


import com.fedex.hm.appointment_service.dto.request.AppointmentRequestDto;
import com.fedex.hm.appointment_service.jmsController.inBoundAppointmentRequest.AppointmentRequest.AppointmentRequest;
import com.fedex.hm.appointment_service.jmsController.inBoundAppointmentRequest.AppointmentRequest.AvailabilitySchedule;
import com.fedex.hm.appointment_service.model.AppointmentStatus;
import com.fedex.hm.appointment_service.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class timeFormatter {

    @Autowired
    private AppointmentService appointmentService;

    public void parseTime(AppointmentRequest request) throws ParseException {
        AvailabilitySchedule availability = request.getAvailabilitySchedule();

        String[] times = availability.getSlotTime().split(" - ");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm a");
        Time startTime = new Time(timeFormat.parse(times[0]).getTime());
        Time endTime = new Time(timeFormat.parse(times[1]).getTime());

        Date date = availability.getDate();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        AppointmentRequestDto dto = new AppointmentRequestDto();
        dto.setPatientId(request.getPatientId());
        dto.setDoctorId(request.getDoctorId());
        dto.setAppointmentDate(formattedDate);
        dto.setStartTime(startTime);
        dto.setEndTime(endTime);
        dto.setStatus(AppointmentStatus.PENDING);

        appointmentService.saveAppointment(dto);
    }
}
