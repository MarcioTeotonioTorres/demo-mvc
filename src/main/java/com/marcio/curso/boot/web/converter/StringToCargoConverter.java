package com.marcio.curso.boot.web.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.marcio.curso.boot.domain.Cargo;
import com.marcio.curso.boot.services.CargoService;

@Component
public class StringToCargoConverter implements Converter<String, Cargo>{

	
	@Autowired
	private CargoService cargoService; 
	@Override
	public Cargo convert(String text) {
		if(text.isEmpty()) {
		return null;
		}
		Long id = Long.valueOf(text);
		return cargoService.buscarPorId(id);
		
	}

}
