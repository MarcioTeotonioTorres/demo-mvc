package com.marcio.curso.boot.dao;

import java.util.List;

import com.marcio.curso.boot.domain.Departamento;

public interface IntefaceDepartamentoDao {

	public void save(Departamento departamento);

	public void update(Departamento departamento);

	public void delete(Long id);

	public List<Departamento> findAll();

}
