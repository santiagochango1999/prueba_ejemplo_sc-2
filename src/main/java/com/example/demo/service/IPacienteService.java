package com.example.demo.service;

import com.example.demo.modelo.Paciente;

public interface IPacienteService {

	public void  crear(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente consultar(Integer id);
	public void eliminar(Integer id);
}
