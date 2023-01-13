package com.example.demo.repository;

import com.example.demo.modelo.Paciente;

public interface IPacienteRepo {

	public void  insertar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscar(Integer id);
	public void borrar(Integer id);
}
