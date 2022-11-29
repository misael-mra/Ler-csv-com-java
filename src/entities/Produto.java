package entities;

import java.io.Serializable;

public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	//Construtor Vazio
	public Produto() {	
	}

	//Construtor 
	public Produto(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}	
}