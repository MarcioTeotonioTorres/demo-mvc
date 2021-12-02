package com.marcio.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.marcio.curso.boot.domain.Departamento;

@Repository
public class DepartamentoDaoImp extends AbstractDao<Departamento, Long> implements IntefaceDepartamentoDao{

}
