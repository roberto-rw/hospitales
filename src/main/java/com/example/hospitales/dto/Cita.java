package com.example.hospitales.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Cita {
    private Long idCita;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Long nssPaciente;
    private Long cedulaMedico;
}
