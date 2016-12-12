package funcoes;

import javax.swing.JOptionPane;

public class Titular {
	//Declaração dos atributos
	private String nome;
	private String endereco;
	private  String cpf;
	private int rg;

	// Criação do metodo
	public Titular (String nome, String endereco, String cpf, int rg){
		this.nome = nome;
		this.endereco = endereco;
		this.cpf= cpf; 
		this.rg = rg;
		
		//Mostra para o usuário mensagem de confirmação da criação do titular e mostra os dados do titular
		JOptionPane.showMessageDialog(null,"Titular Cadastrado com Sucesso! \n"
				+ "\n Nome: " + nome
				+ "\n Endereço: " + endereco
				+ "\n CPF: " + cpf
				+ "\n RG: " + rg);
	}
		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	
	
}
