package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;
import com.example.demo.repository.ICitaMedicaRepo;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class PruebaEjemploSc2Application implements CommandLineRunner{

	@Autowired
	private ICitaMedicaService citaMedicaService;
	@Autowired
	private IDoctorService doctorService;
	@Autowired
	private IPacienteService iPacienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaEjemploSc2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//parte uno
		Doctor doctor=new Doctor();
		doctor.setApellido("c");
		doctor.setCedula("121412");
		doctor.setCodigoSenescyt("as31231");
		doctor.setFechaNacimiento(LocalDateTime.of(1999, 6, 16, 0, 0));
		doctor.setGenero("m");
		doctor.setNombre("san");
		doctor.setNumeroConsultorio("12");
		
		this.doctorService.crear(doctor);
		Doctor doctor1=new Doctor();
		doctor1.setApellido("c");
		doctor1.setCedula("121412");
		doctor1.setCodigoSenescyt("as31231");
		doctor1.setFechaNacimiento(LocalDateTime.of(1999, 6, 16, 0, 0));
		doctor1.setGenero("m");
		doctor1.setNombre("san");
		doctor1.setNumeroConsultorio("13");
		
		this.doctorService.crear(doctor1);
		
		//segunda 
		Paciente paciente = new Paciente();
		paciente.setCedula("1727501510");
		paciente.setNombre("Jhonatan");
		paciente.setApellido("Altamirano");
		paciente.setFechaNacimiento(LocalDateTime.of(2000, 12, 5, 1,10 ));
		paciente.setCodigoSeguro("111");
		paciente.setEstatura(new Double(161));
		paciente.setPeso(new Double(61));
		paciente.setGenero("Masculino");
		this.iPacienteService.crear(paciente);
		
		Paciente paciente1 = new Paciente();
		paciente1.setCedula("1727501510");
		paciente1.setNombre("Jhonatan");
		paciente1.setApellido("Altamirano");
		paciente1.setFechaNacimiento(LocalDateTime.of(2000, 12, 5, 1,10 ));
		paciente1.setCodigoSeguro("111");
		paciente1.setEstatura(new Double(161));
		paciente1.setPeso(new Double(61));
		paciente1.setGenero("Masculino");
		this.iPacienteService.crear(paciente1);
		
		//tercera
		this.citaMedicaService.generar(12, LocalDateTime.of(2000, 12, 5, 1,10 ), new BigDecimal(200), "quito", 1, 1);
		

	}

}
