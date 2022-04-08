package com.projetobiblioteca.domain;

import java.util.Objects;

public class Estoque {

	private Integer id;
	private String quantidade;
	public Estoque() {
		super();
	}
	public Estoque(Integer id, String quantidade) {
		super();
		this.id = id;
		this.quantidade = quantidade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
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
		Estoque other = (Estoque) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Estoque [id=" + id + ", quantidade=" + quantidade + "]";
	}
	
	
}
