package com.example.demo.service;

import com.example.demo.modelo.Doctor;

public interface IDoctorService {

	public void  crear(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor consultar(Integer id);
	public void eliminar(Integer id);

}
