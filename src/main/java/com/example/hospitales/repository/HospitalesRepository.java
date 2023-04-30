package com.example.hospitales.repository;

import com.example.hospitales.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospitalesRepository extends JpaRepository<Hospital, Long> {
    List<Hospital> findHospitalByNombre(String nombre);
}
