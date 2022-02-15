package com.mayab.desarrollo.estructura.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AdapterOldPerson implements INewPerson {
	private OldPerson oldperson;
	
	public AdapterOldPerson(OldPerson oldperson) {
		this.oldperson = oldperson; 
	}
	
	public String getName() {
		return oldperson.getName() + "  " + oldperson.getLastName(); 
		
	}
	
	public String getAge() {
		// Fecha
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(oldperson.getDateBirth(), fmt);
		LocalDate ahora = LocalDate.now();
		// Valor en edad (numerico)
		Period periodo = Period.between(fechaNac, ahora);
		String edad = Integer.toString(periodo.getYears());
		return edad;
		
	}

}
