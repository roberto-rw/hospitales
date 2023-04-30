package com.example.hospitales.controllers;

import com.example.hospitales.dto.Cita;
import com.example.hospitales.dto.RequestDTO;
import com.example.hospitales.services.HospitalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HospitalesController {

    @Autowired
    HospitalesService hospitalesService;
    @GetMapping("/citas")
    public List<Cita> getCitas(@RequestBody RequestDTO body){
        return hospitalesService.getCitas(body);
    }
}
