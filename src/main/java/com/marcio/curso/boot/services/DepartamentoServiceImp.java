package com.marcio.curso.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcio.curso.boot.dao.DepartamentoDaoImp;
import com.marcio.curso.boot.domain.Departamento;

@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImp implements DepartamentoService{

	@Autowired
	private DepartamentoDaoImp depDao;
	
	
	@Override
	public void salvar(Departamento departamento) {
		// TODO Auto-generated method stub
		depDao.save(departamento);
	}

	@Override
	public void editar(Departamento departamento) {
		// TODO Auto-generated method stub
		depDao.update(departamento);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		depDao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return depDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		// TODO Auto-generated method stub
		return depDao.findAll();
	}

	@Override
	public boolean departamentoTemCargo(Long id) {
	if(buscarPorId(id).getCargos().isEmpty()) {
		return false;
	}
	
		return true;
	}

}
