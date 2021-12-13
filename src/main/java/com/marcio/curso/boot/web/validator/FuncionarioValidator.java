package com.marcio.curso.boot.web.validator;

import java.time.LocalDate;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.marcio.curso.boot.domain.Funcionario;

public class FuncionarioValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Funcionario.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub

		Funcionario f = (Funcionario) object;
		LocalDate entrada = f.getDataEntrada();
		if(f.getDataSaida() != null) {
			if(f.getDataSaida().isBefore(entrada)) {
				errors.rejectValue("dataSaida", "PosteriorDataEntrada.funcionario.dataSaida");
				
			}
		}
		
	}

}
