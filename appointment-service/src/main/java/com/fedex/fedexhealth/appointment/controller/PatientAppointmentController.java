package com.fedex.fedexhealth.appointment.controller;

import com.fedex.fedexhealth.appointment.dto.request.AppointmentRequestDto;
import com.fedex.fedexhealth.appointment.dto.response.AppointmentResponseDto;
import com.fedex.fedexhealth.appointment.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "http://localhost:4200")

public class PatientAppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/create")
    public ResponseEntity<AppointmentResponseDto> SaveAppointment(@RequestBody AppointmentRequestDto dto){
        AppointmentResponseDto responseDto = appointmentService.saveAppointment(dto);
        URI location = URI.create("/appointments/" + responseDto.getId());
        return ResponseEntity.created(location).body(responseDto);
    }

    @GetMapping
    public ResponseEntity<List<AppointmentResponseDto>> GetAppointments(){
        return ResponseEntity.ok(appointmentService.getAppointments());
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<AppointmentResponseDto>> GetAppointmentsByPatientId(@PathVariable Long id) {
        return ResponseEntity.ok(appointmentService.GetAppointmentsByPatientId(id));
    }

    @GetMapping("/doctor/{id}")
    public ResponseEntity<List<AppointmentResponseDto>> GetAppointmentsByDoctorId(@PathVariable Long id) {
        return ResponseEntity.ok(appointmentService.GetAppointmentsByDoctorId(id));
    }

    @PutMapping("/doctor/{id}")
    public ResponseEntity<AppointmentResponseDto> UpdateAppointmentByDoctorId(@PathVariable Long id, AppointmentRequestDto dto) {
        return ResponseEntity.ok(appointmentService.UpdateAppointmentByDoctorId(id));
    }

}
