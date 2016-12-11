package funcoes;

import java.util.Random;

import javax.swing.JOptionPane;

public class Movimentacao {
	
	private ContaCorrente cc;

	public static void main(String[] args) {		
		Movimentacao operacao = new Movimentacao();
		
		int opcao = operacao.menu();
		while(opcao!=0){
			switch (opcao) {
			case 1:
				operacao.aberturaConta();
				break;
			case 2:
				operacao.saque();
				break;
			case 3:
				operacao.deposito();
				break;
			case 4:
				operacao.liberarCreditoEspecial();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, operacao.getResumo());
				break;
			default:
				break;
			}
			opcao = operacao.menu();
		}
		
	}
	
	public void aberturaConta(){
		cc = new ContaCorrente();
		cc.setNumero(gerarNumeroAleatorio());
		cc.setAgencia(new Agencia("24", "RUA 15", 
			"Parque Amaz�nia", new Banco("Caixa",23)));
		JOptionPane.showMessageDialog(null, cc.getResumo());
	}
	
	public String gerarNumeroAleatorio(){
		Random random = new Random();
	    return random.nextInt() + "";
	}
	
	public int menu(){
		return Integer.parseInt
			(JOptionPane.showInputDialog(
			"Informe a Op��o Desejada:"
			+ "\n 1 - Abertura de Conta"
			+ "\n 2 - Saque"
			+ "\n 3 - Dep�sito"
			+ "\n 4 - Liberar Cr�dito Especial"
			+ "\n 5 - Resumo da Conta"
			+ "\n 0 - Sair"));
	}
	
	public void saque(){
		double valorSaque = Double.parseDouble(
				JOptionPane.showInputDialog(
				"Informe o Valor do Saque"));
		if(cc.efetuarSaque(valorSaque)){
			JOptionPane.showMessageDialog(null,
			"Saque Efetuado com Sucesso" + 
			cc.getResumo());
		}else{
			JOptionPane.showMessageDialog(null,
			"N�o foi Poss�vel Sacar, Verifique seu Saldo"
			+ " ou Libere Cr�dito Especial. \n \n" + 
			cc.getResumo());
		}
	}
	
	public void deposito(){
		double valorDeposito = Double.parseDouble(
				JOptionPane.showInputDialog(
				"Informe o Valor do Dep�sito"));
		cc.efetuarDeposito(valorDeposito);
		JOptionPane.showMessageDialog(null,cc.getResumo());
	}
	
	public void liberarCreditoEspecial(){
		double valor = Double.parseDouble(
				JOptionPane.showInputDialog(
				"Informe o Valor do Cr�dito Especial"));
		cc.liberarCreditoEspecial(valor);
		JOptionPane.showMessageDialog(null,cc.getResumo());
	}
	
	public String getResumo(){
		return cc.getAgencia().getBanco().getResumo() +
				"\n " + cc.getAgencia().getResumo() +
				"\n " + cc.getResumo();
	}
}
