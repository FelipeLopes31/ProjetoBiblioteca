package com.projetobiblioteca.domain;

import java.util.Objects;

public class Bibliotecario {

	private Integer id;
	private String nome;
	private String cpf;
	public Bibliotecario(int i, String string) {
		super();
	}
	public Bibliotecario(Integer id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		Bibliotecario other = (Bibliotecario) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Bibliotecario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}

	
}
