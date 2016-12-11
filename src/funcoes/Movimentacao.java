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
			"Parque Amazônia", new Banco("Caixa",23)));
		JOptionPane.showMessageDialog(null, cc.getResumo());
	}
	
	public String gerarNumeroAleatorio(){
		Random random = new Random();
	    return random.nextInt() + "";
	}
	
	public int menu(){
		return Integer.parseInt
			(JOptionPane.showInputDialog(
			"Informe a Opção Desejada:"
			+ "\n 1 - Abertura de Conta"
			+ "\n 2 - Saque"
			+ "\n 3 - Depósito"
			+ "\n 4 - Liberar Crédito Especial"
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
			"Não foi Possível Sacar, Verifique seu Saldo"
			+ " ou Libere Crédito Especial. \n \n" + 
			cc.getResumo());
		}
	}
	
	public void deposito(){
		double valorDeposito = Double.parseDouble(
				JOptionPane.showInputDialog(
				"Informe o Valor do Depósito"));
		cc.efetuarDeposito(valorDeposito);
		JOptionPane.showMessageDialog(null,cc.getResumo());
	}
	
	public void liberarCreditoEspecial(){
		double valor = Double.parseDouble(
				JOptionPane.showInputDialog(
				"Informe o Valor do Crédito Especial"));
		cc.liberarCreditoEspecial(valor);
		JOptionPane.showMessageDialog(null,cc.getResumo());
	}
	
	public String getResumo(){
		return cc.getAgencia().getBanco().getResumo() +
				"\n " + cc.getAgencia().getResumo() +
				"\n " + cc.getResumo();
	}
}
