package com.marcio.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

import com.marcio.curso.boot.domain.Funcionario;

public interface InterfaceFuncionarioDao {
	public void save(Funcionario funcionario); 

	public void update(Funcionario funcionario);

	public void delete(Long id);

	public List<Funcionario> findAll();
	
	public List<Funcionario> findByName(String nome);
	
	public List<Funcionario> findByCargo(Long id);
	
	public List<Funcionario> findByDatas(LocalDate entrada, LocalDate saida);
	
	public List<Funcionario> findByDataEntrada(LocalDate entrada);
	
	public List<Funcionario> findByDataSaida(LocalDate saida);
}
