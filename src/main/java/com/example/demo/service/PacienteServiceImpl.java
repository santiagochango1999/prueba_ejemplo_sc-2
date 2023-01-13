package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Paciente;
import com.example.demo.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteRepo iPacienteRepo;

	@Override
	public void crear(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.insertar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.actualizar(paciente);
	}

	@Override
	public Paciente consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPacienteRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.borrar(id);
	}

}
