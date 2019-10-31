package com.boot.service.doctor;

import com.boot.dao.doctor.DoctorRepositry;
import com.boot.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepositry repository;

    @PostConstruct
    public void initDoctor(){
        repository.saveAll(Stream.of(new Doctor(101,"John","Cardiac"),new Doctor(102,"JohnCena","Cantseeme")).collect(Collectors.toList()));
    }

    public List<Doctor> getDoctors(){
        return repository.findAll();
    }

}
