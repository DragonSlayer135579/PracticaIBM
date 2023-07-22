package com.ibm.practica.spital.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doctor {

    private String firstName;
    private String lastName;
    private int age;
    // Secializarea
    private String specialization;
    private String DoctorID;

}
