package com.company.classe;

public class Lance {
	private String nome;
	private double valor;
	
	
	public Lance (String nome, Double valor){
		nome=nome;
		valor=valor;
	}
	
	
	public String getNome(){
		return nome;
	}

	public double getValor() {
		return valor;
	}
}
