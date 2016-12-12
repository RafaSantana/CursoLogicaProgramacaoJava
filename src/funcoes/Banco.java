package funcoes;

public class Banco {
	//Criação dos atributos
	private String nome;
	private int numero;
	
	// criação do metodo
	public Banco(String nome, int numero){
		this.nome = nome;
		this.numero = numero;
	}
	
	public Banco(){} //Contrutor Padrão
	
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
