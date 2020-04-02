package com.gft.mvc.casadeshow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CasaDeShow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long CasaDeShowId;
	public String Endereco;
	public String NomeDaCasa;

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
