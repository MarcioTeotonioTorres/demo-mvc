package com.marcio.curso.boot.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcio.curso.boot.dao.FuncionarioDaoImp;
import com.marcio.curso.boot.domain.Funcionario;

@Service
@Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDaoImp funcionarioDaoImp;

	@Override
	public void salvar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		funcionarioDaoImp.save(funcionario);
	}

	@Override
	public void editar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		funcionarioDaoImp.update(funcionario);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		funcionarioDaoImp.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Funcionario buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return funcionarioDaoImp.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> buscarTodos() {
		// TODO Auto-generated method stub
		return funcionarioDaoImp.findAll();
	}

	@Override
	public List<Funcionario> buscarPorNome(String nome) {
		return funcionarioDaoImp.findByName(nome);
	}

	@Override
	public List<Funcionario> buscarPorCargo(Long id) {

		return funcionarioDaoImp.findByCargo(id);
	}

	@Override
	public List<Funcionario> buscarPorData(LocalDate entrada, LocalDate saida) {

		if (entrada != null && saida != null) {
			return funcionarioDaoImp.findByDatas(entrada, saida);
		} else if (entrada != null) {
			return funcionarioDaoImp.findByDataEntrada(entrada);
		} else if (saida != null) {
			return funcionarioDaoImp.findByDataSaida(saida);
		} else {
			return new ArrayList<>();	
		}

	}

}
