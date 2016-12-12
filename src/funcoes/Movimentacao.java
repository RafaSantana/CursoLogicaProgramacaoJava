package funcoes;

import java.util.Random;

import javax.swing.JOptionPane;

public class Movimentacao {
	// Declaração dos atributos da classe MOVIMENTAÇÃO
	private ContaCorrente cc;
	private Titular pessoa;

	// Linha que de código que indica que esta classe mestre/Principal
	public static void main(String[] args) {
		Movimentacao operacao = new Movimentacao();

		// Recebe as opções indicadas pelo usuário e envia o requerimento para
		// suas respectivas classes
		int opcao = operacao.menu();
		while (opcao != 0) {

			switch (opcao) {
			case 1:
				operacao.cadastrarTitular();
				break;
			case 2:
				operacao.aberturaConta();
				break;
			case 3:
				operacao.saque();
				break;
			case 4:
				operacao.deposito();
				break;
			case 5:
				operacao.liberarCreditoEspecial();
				break;
			case 6:
				JOptionPane.showMessageDialog(null, operacao.getResumo());
				break;
			default:
				break;
			}
			opcao = operacao.menu();
		}

	}

	// cria uma conta corrente com números aleatórios. Recebe dados da agência
	// já declarados nesse código.
	public void aberturaConta() {
		cc = new ContaCorrente();
		cc.setNumero(gerarNumeroAleatorio());
		cc.setAgencia(new Agencia("24", "RUA 15", "Parque Amazônia", new Banco("Caixa", 23)));
		cc.setTitular(this.pessoa);
		JOptionPane.showMessageDialog(null, cc.getResumo());
	}

	// Código responsável por criar a sequencia de números aleatórios no código
	// de abertura de conta.
	public String gerarNumeroAleatorio() {
		Random random = new Random();
		return random.nextInt() + "";
	}

	// Menu de onde parte todos os comandos de funcionalidades
	public int menu() {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe a Opção Desejada:" + "\n 1 - Cadastrar Titular"
				+ "\n 2 - Abertura de Conta" + "\n 3 - Saque" + "\n 4 - Depósito" + "\n 5 - Liberar Crédito Especial"
				+ "\n 6 - Resumo da Conta" + "\n 0 - Sair"));
	}

	// Manda o pedido de saque para a classe responsável
	public void saque() {
		double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Saque"));
		if (cc.efetuarSaque(valorSaque)) {
			JOptionPane.showMessageDialog(null, "Saque Efetuado com Sucesso \n" + cc.getResumo());
		} else {
			JOptionPane.showMessageDialog(null, "Não foi Possível Sacar, Verifique seu Saldo"
					+ " ou Libere Crédito Especial. \n \n" + cc.getResumo());
		}
	}

	// Manda o pedido de deposito para a classe responsável
	public void deposito() {
		double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Depósito"));
		cc.efetuarDeposito(valorDeposito);
		JOptionPane.showMessageDialog(null, cc.getResumo());
	}

	// Faz o requerimento de crédito especial
	public void liberarCreditoEspecial() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Crédito Especial"));
		cc.liberarCreditoEspecial(valor);
		JOptionPane.showMessageDialog(null, cc.getResumo());

	}

	// Cadastra um titular para a conta
	public void cadastrarTitular() {

		String nome = JOptionPane.showInputDialog("Nome Titular: ");
		String endereco = JOptionPane.showInputDialog("Informe o endereço do Titular:");
		String cpf = (JOptionPane.showInputDialog(null, "Informe Numero do CPF"));
		int rg = Integer.parseInt(JOptionPane.showInputDialog("Informe Numero do Rg"));
		pessoa = new Titular(nome, endereco, cpf, rg);

	}
	//Mostra o resumo dos dados da conta
	public String getResumo() {
		return cc.getAgencia().getBanco().getResumo() + "\n " + cc.getAgencia().getResumo() + "\n " + cc.getResumo();
	}
}
