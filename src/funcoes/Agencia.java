package funcoes;

public class Agencia {

	private String numero;
	private String endereco;
	private String nome;
	private Banco banco;

	public Agencia(String numero, String end, String nome, Banco banco){
		this.numero = numero;
		this.endereco = end;
		this.nome = nome; 
		this.banco = banco;
	}
	
	public String getResumo(){
		return "Agência: " + numero + " - " + nome;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
}
