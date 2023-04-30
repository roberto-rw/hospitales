package com.example.hospitales.dto;

import lombok.Data;

@Data
public class RequestDTO {
    private String nombreHospital;
    private String cedulaMedico;
    private String ssdPaciente;
}
