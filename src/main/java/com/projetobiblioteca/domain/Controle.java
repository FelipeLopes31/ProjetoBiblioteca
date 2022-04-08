package com.projetobiblioteca.domain;

import java.util.Objects;

public class Controle {
	
	private Integer id;
	private String dataRetirada;
	private String dataDevolucao;
	public Controle() {
		super();
	}
	public Controle(Integer id, String dataRetirada, String dataDevolucao) {
		super();
		this.id = id;
		this.dataRetirada = dataRetirada;
		this.dataDevolucao = dataDevolucao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(String dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Controle other = (Controle) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Controle [id=" + id + ", dataRetirada=" + dataRetirada + ", dataDevolucao=" + dataDevolucao + "]";
	}
	
	
}
