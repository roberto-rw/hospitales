package com.example.hospitales.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Hospital {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_hospital")
    private Long id;
    @Column(name = "url")
    private String url;
    @Column(name = "nombre")
    private String nombre;
}
