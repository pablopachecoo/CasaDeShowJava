package com.gft.mvc.casadeshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.mvc.casadeshow.model.Evento;

public interface Eventos extends JpaRepository<Evento, Long>{

}
