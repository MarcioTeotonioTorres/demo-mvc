package com.marcio.curso.boot.web.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.marcio.curso.boot.domain.Departamento;
import com.marcio.curso.boot.services.DepartamentoService;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento>{

	@Autowired
	private DepartamentoService service;
	
	@Override
	public Departamento convert(String source) {
		if(source.isEmpty()) {
			return null;	
		}
		Long id = Long.valueOf(source);
		return service.buscarPorId(id); 
	}

}
