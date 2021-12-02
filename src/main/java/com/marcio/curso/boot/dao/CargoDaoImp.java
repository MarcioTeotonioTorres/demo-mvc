package com.marcio.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.marcio.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImp extends AbstractDao<Cargo, Long> implements InterfaceCargoDao{

}
