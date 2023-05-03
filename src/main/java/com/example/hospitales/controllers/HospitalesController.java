package com.example.hospitales.controllers;

import com.example.hospitales.dto.Cita;
import com.example.hospitales.dto.RequestDTO;
import com.example.hospitales.services.HospitalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HospitalesController {

    @Autowired
    HospitalesService hospitalesService;
    
    @GetMapping("/citas")
    public List<Cita> getCitas(@RequestParam String nombreHospital, @RequestParam String cedulaMedico){
        RequestDTO body = new RequestDTO(nombreHospital, cedulaMedico);
        return hospitalesService.getCitas(body);
    }

    @GetMapping("/citas-medico")
    public List<Cita> getCitasMedico(@RequestBody RequestDTO body){return hospitalesService.getCitasMedico(body);}
}
