package com.example.hospitales.dto;

import lombok.Data;

@Data
public class RequestDTO {
    private String nombreHospital;
    private String cedulaMedico;
    private String nssPaciente;

    public RequestDTO(String nombreHospital, String cedulaMedico) {
        this.nombreHospital = nombreHospital;
        this.cedulaMedico = cedulaMedico;
    }
    
}
