package com.projetobiblioteca.domain;

import java.util.Objects;

public class Livros {

	private Integer id;
	private String nome;
	public Livros() {
		super();
	}
	public Livros(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		Livros other = (Livros) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Livros [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
