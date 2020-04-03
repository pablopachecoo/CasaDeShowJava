package com.gft.mvc.casadeshow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
public class CasaDeShow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long CasaDeShowId;
	@NotNull
	@NotEmpty
	public String Endereco;
	@NotEmpty
	@NotNull
	public String NomeDaCasa;

	public CasaDeShow() {
		
	}
	
	public CasaDeShow(Long casaDeShowId, String endereco, String nomeDaCasa) {
		CasaDeShowId = casaDeShowId;
		Endereco = endereco;
		NomeDaCasa = nomeDaCasa;
	}

	public Long getCasaDeShowId() {
		return CasaDeShowId;
	}

	public void setCasaDeShowId(Long casaDeShowId) {
		CasaDeShowId = casaDeShowId;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getNomeDaCasa() {
		return NomeDaCasa;
	}

	public void setNomeDaCasa(String nomeDaCasa) {
		NomeDaCasa = nomeDaCasa;
	}

}
