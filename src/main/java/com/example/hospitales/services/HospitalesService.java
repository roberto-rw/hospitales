package com.example.hospitales.services;

import com.example.hospitales.dto.Cita;
import com.example.hospitales.dto.RequestDTO;
import com.example.hospitales.entity.Hospital;
import com.example.hospitales.repository.HospitalesRepository;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;


import java.util.List;

@Service
public class HospitalesService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HospitalesRepository hospitalesRepository;

    public List<Cita> getCitas(RequestDTO request) {
        String url = getURLHospital(request.getNombreHospital());
        System.out.println(url);
        ResponseEntity<Cita[]> responseEntity = restTemplate.getForEntity(url, Cita[].class);
        Cita[] objects = responseEntity.getBody();
        return Arrays.asList(objects);
    }

    public List<Cita> getCitasMedico(RequestDTO request){
        String medico= request.getCedulaMedico();
        String url= getURLHospital(request.getNombreHospital());
        url= url+"/"+medico;
        ResponseEntity<Cita[]> responseEntity= restTemplate.getForEntity(url, Cita[].class);
        Cita[] objetos= responseEntity.getBody();
        return Arrays.asList(objetos);
    }

    public String getURLHospital(String nombre){
        List<Hospital> hospitales = hospitalesRepository.findHospitalByNombre(nombre);
        Hospital hospital = hospitales.get(0);
        return hospital.getUrl();
    }

}
