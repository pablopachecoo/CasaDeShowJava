package com.gft.mvc.casadeshow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int EventoId;
	public String NomeDoEvento;
	public int CapacidadeDoEvento;
	public int QuantidadeDeIngressos;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	public Date DataDoEvento;
	
	public double ValorDoIngresso;
	public String GeneroDoEvento;
	@ManyToOne
	private CasaDeShow casadeshow;
	
	public Evento() {
		
	}
	

	public int getEventoId() {
		return EventoId;
	}

	public void setEventoId(int eventoId) {
		EventoId = eventoId;
	}

	public String getNomeDoEvento() {
		return NomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		NomeDoEvento = nomeDoEvento;
	}

	public int getCapacidadeDoEvento() {
		return CapacidadeDoEvento;
	}

	public void setCapacidadeDoEvento(int capacidadeDoEvento) {
		CapacidadeDoEvento = capacidadeDoEvento;
	}

	public int getQuantidadeDeIngressos() {
		return QuantidadeDeIngressos;
	}

	public void setQuantidadeDeIngressos(int quantidadeDeIngressos) {
		QuantidadeDeIngressos = quantidadeDeIngressos;
	}

	public Date getDataDoEvento() {
		return DataDoEvento;
	}

	public void setDataDoEvento(Date dataDoEvento) {
		DataDoEvento = dataDoEvento;
	}

	public double getValorDoIngresso() {
		return ValorDoIngresso;
	}

	public void setValorDoIngresso(double valorDoIngresso) {
		ValorDoIngresso = valorDoIngresso;
	}

	public String getGeneroDoEvento() {
		return GeneroDoEvento;
	}

	public void setGeneroDoEvento(String generoDoEvento) {
		GeneroDoEvento = generoDoEvento;
	}

	public CasaDeShow getCasadeshow() {
		return casadeshow;
	}

	public void setCasadeshow(CasaDeShow casadeshow) {
		this.casadeshow = casadeshow;
	}

}
