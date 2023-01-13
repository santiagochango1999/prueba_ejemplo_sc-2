package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = this.buscar(id);
		this.entityManager.remove(citaMedica);
	}

}
