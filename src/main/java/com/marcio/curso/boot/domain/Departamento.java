package com.marcio.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Informe um nome.")
	@Size(min = 3, max = 60, message = "O nome do Departamento deve ter entre 3 e 60 caracteres.")
	@Column(name = "nome",length = 60, unique = true, nullable = false )
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
