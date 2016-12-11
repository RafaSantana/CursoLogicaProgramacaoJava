package br.gov.go.itegoss.funcoes;

public class Banco {

	private String nome;
	private int numero;
	
	public Banco(String nome, int numero){
		this.nome = nome;
		this.numero = numero;
	}
	
	public Banco(){} //Contrutor Padr�o
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getResumo(){
		return "Banco: " + numero + " - " + nome;
	}
}
