package com.marcio.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.marcio.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImp extends AbstractDao<Funcionario, Long> implements InterfaceFuncionarioDao {

	public List<Funcionario> findByName(String nome) {
//		TypedQuery<Funcionario> query = getEntityManager().createQuery("select f from funcionario f where f.nome like :nome",Funcionario.class);
//		query.setParameter("nome",nome);
//		return query.getResultList();
		return createQuery("select f from Funcionario f where f.nome like concat('%', ?1, '%')", nome);
	}

	public List<Funcionario> findByCargo(Long id) {

		return createQuery("select f from Funcionario f where f.cargo.id = ?1", id);
	}

	public List<Funcionario> findByDatas(LocalDate entrada, LocalDate saida) {
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataEntrada <= ?1 and f.dataSaida <= ?2 ").append("order by f.dataEntrada asc")
				.toString();

		return createQuery(jpql, entrada, saida);
	}

	public List<Funcionario> findByDataEntrada(LocalDate entrada) {
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataEntrada = ?1 ").append("order by f.dataEntrada asc")
				.toString();
		return createQuery(jpql, entrada);
	}

	public List<Funcionario> findByDataSaida(LocalDate saida) {
		
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataSaida = ?1 ").append("order by f.dataEntrad asc")
				.toString();
		
		return createQuery(jpql, saida);

	}

}
