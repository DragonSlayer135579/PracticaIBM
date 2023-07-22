package com.ibm.practica.spital.service;

import com.ibm.practica.spital.DTO.AddReservation;
import com.ibm.practica.spital.DTO.Doctor;
import com.ibm.practica.spital.DTO.Pacient;
import com.ibm.practica.spital.DTO.Reservation;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
public class SpitalService {


 public List<Pacient> getAllPacients(){
  log.info("SpitalService.getAllPacients() retrieving all pacients...");
  Pacient p = new Pacient();
  p.setPacientID("12313");
  p.setFirstName("Bogdan");
  Pacient p1 = new Pacient();
  p1.setPacientID("12314");
  p1.setFirstName("Dan");
  return List.of(p,p1);
 }

 public List<Reservation> getReservations(){
  log.info("SpitalService.getReservations() retrieving all reservations...");
  Reservation p = new Reservation();
  p.setId("12");
  p.setPacientID("12313");
  Reservation p1 = new Reservation();
  p1.setPacientID("12314");
  p1.setId("123");
  return List.of(p,p1);
 }

 public Reservation getReservation(){
  log.info("SpitalService.getReservation() retrieving all reservations...");
  Reservation p = new Reservation();
  p.setId("12");
  p.setPacientID("12313");
  return p;
 }

 public List<Reservation> getReservationForPacient(String pacientID){
  log.info("SpitalService.getReservations() retrieving all reservations...");
  Reservation p = new Reservation();
  p.setId("12");
  p.setPacientID("12313");
  Reservation p1 = new Reservation();
  p1.setPacientID("12314");
  p1.setId("123");
  List<Reservation> list = new ArrayList<>();
  list.add(p);
  list.add(p1);

  return list.stream().filter(r -> r.getPacientID().equals(pacientID)).collect(Collectors.toList());
 }

 public boolean addReservation(AddReservation reservation){
  return true;
 }

 public boolean deleteReservation(String reservationID){
  return false;
 }

 public List<Doctor> getAllDoctors() {
  log.info("SpitalService.getAllDoctors() retrieving all pacients...");
  Doctor p = new Doctor();
  p.setDoctorID("1");
  p.setFirstName("Bogdan");
  p.setSpecialization("Anestezie");
  p.setDoctorID("1");
  p.setAge(40);
  Doctor p1 = new Doctor();
  p1.setDoctorID("2");
  p1.setFirstName("Ion");
  p1.setSpecialization("Cardiologie");
  p1.setAge(21);
  return List.of(p,p1);
 }
}
