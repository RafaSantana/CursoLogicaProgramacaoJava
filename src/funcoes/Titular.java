package funcoes;

import javax.swing.JOptionPane;

public class Titular {
	private String nome;
	private String endereco;
	private  int cpf;
	private int rg;

	public Titular (String nome, String endereco, int cpf, int rg){
		this.nome = nome;
		this.endereco = endereco;
		this.cpf= cpf; 
		this.rg = rg;
		
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	
	
}
