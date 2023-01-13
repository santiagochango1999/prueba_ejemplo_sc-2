package com.example.demo.repository;

import com.example.demo.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	public void  insertar(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);
	public CitaMedica buscar(Integer id);
	public void borrar(Integer id);
}
