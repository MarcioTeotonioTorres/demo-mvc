package com.marcio.curso.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcio.curso.boot.dao.CargoDaoImp;
import com.marcio.curso.boot.domain.Cargo;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDaoImp cargoDao;

	@Override
	public void salvar(Cargo cargo) {
		// TODO Auto-generated method stub
		cargoDao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		// TODO Auto-generated method stub
		cargoDao.update(cargo);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		cargoDao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		return cargoDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return cargoDao.findAll();
	}

	@Override
	public boolean cargoTemFuncionarios(Long id) {
		if (buscarPorId(id).getFuncionarios().isEmpty()) {
			return false;
		}
		return true;
	}

}
