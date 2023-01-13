package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;
import com.example.demo.repository.ICitaMedicaRepo;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;
	@Autowired
	private IDoctorService doctorService;
	@Autowired
	private IPacienteService iPacienteService;
	
	@Override
	public void generar(Integer numeroCita,LocalDateTime fechaCita,BigDecimal valorCita,String lugarCita,Integer cedulaDoctor,Integer cedulaPaciente) {
		// TODO Auto-generated method stub
		

		CitaMedica citaMedica=new CitaMedica();
		citaMedica.setDiagnostico("enfermo");
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setFechaProximaCita(null);
		citaMedica.setIdDoctor(cedulaDoctor);
		citaMedica.setIdPaciente(cedulaPaciente);
		citaMedica.setLugarCita(lugarCita);
		citaMedica.setNumeroCita(numeroCita);
		citaMedica.setReceta("paracetamosl");
		citaMedica.setValorCita(new BigDecimal(20));

		this.citaMedicaRepo.insertar(citaMedica);
	}

}
