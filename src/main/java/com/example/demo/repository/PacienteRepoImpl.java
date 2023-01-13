package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class PacienteRepoImpl implements IPacienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Paciente paciente = this.buscar(id);
		this.entityManager.remove(paciente);

	}

}
