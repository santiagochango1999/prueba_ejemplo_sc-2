package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.demo.modelo.CitaMedica;


public interface ICitaMedicaService {

	public void generar(Integer numeroCita,LocalDateTime fechaCita,BigDecimal valorCita,String lugarCita,Integer cedulaDoctor,Integer cedulaPaciente);
	

}
