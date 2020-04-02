package com.gft.mvc.casadeshow.model;

import java.util.Date;

public class Evento {

	public int EventoId;
	public String NomeDoEvento;
	public int CapacidadeDoEvento;
	public int QuantidadeDeIngressos;
	public Date DataDoEvento;
	public double ValorDoIngresso;
	public String GeneroDoEvento;

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

}
