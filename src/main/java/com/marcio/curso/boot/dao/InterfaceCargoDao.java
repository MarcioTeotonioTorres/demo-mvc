package com.marcio.curso.boot.dao;

import java.util.List;

import com.marcio.curso.boot.domain.Cargo;

public interface InterfaceCargoDao {

	public void save(Cargo cargo);

	public void update(Cargo cargo);

	public void delete(Long id);

	public Cargo findById(Long id);

	public List<Cargo> findAll();
}
