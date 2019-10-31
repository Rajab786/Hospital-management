package com.boot.dao.doctor;

import com.boot.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepositry extends JpaRepository<Doctor,Integer> {
}
