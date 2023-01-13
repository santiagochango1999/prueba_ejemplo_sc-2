package com.example.demo.repository;

import com.example.demo.modelo.Doctor;

public interface IDoctorRepo {
	
	public void  insertar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscar(Integer id);
	public void borrar(Integer id);

}
