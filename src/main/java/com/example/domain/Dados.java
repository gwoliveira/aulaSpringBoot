package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dados {
	@Id
	private Integer id;
	private Integer qtd;
	public Dados() {
	}
	
	public Dados(Integer id) {
		this.id = id;
		this.qtd = 0;
	}
	public Integer getId() {
		return id;
	}
	public Integer getQtd() {
		return qtd;
	}

	public Integer incrementa() {
		return ++qtd;
	}
	
	

}
