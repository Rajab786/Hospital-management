package com.boot.controller.doctor;

import com.boot.model.doctor.Doctor;
import com.boot.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService service;

    @GetMapping("/doctors")
    public List<Doctor> getDoctors(){
        return service.getDoctors();
    }
}
