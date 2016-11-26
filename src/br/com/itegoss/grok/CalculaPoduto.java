package br.com.itegoss.grok;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaPoduto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float valProd, valAume = 0;
		String por = "", valPar = "";
		int cont = 1;
		while (cont == 1) {
			
			valProd = (float) Double.parseDouble(JOptionPane.showInputDialog(null,"==========================="
					+ "\n      Bem vindo à"
					+ "\n---------- RAFAEL ELETRO ------------"
					+ "\n                           BLACK FRIDAY!!"
					+ "\n==========================="
					+ "\nInforme o valor do produto: R$"));
			
			int op = Integer.parseInt(JOptionPane.showInputDialog(null,"--------------------------------------------------------------------------"
					+ "\n 1- Á vista em dinheiro ou cheque 10% de desconto"
					+ "\n 2- Á vista no cartão de crédio, 5% de desconto" + "\n 3- Em 2X, SEM JUROS"
					+ "\n 4- Em 3X, com 10% DE JUROS" + "\n--------------------------------------------------------------------------"
					+ "\n Informe a forma de pagamento:"));
			switch (op) {
			case 1:
				valAume = valProd - (valProd * 10 / 100);
				por = ("Á vista 10% de desconto");
				break;
			case 2:
				valAume = valProd - (valProd * 5 / 100);
				por = ("Á vista no cartão, 5% de desc.");
				break;
			case 3:
				valAume = valProd;
				por = ("Em 2X, SEM JUROS");
				valPar = String.format("\t  Valor parcela: 2X R$ %.2f", valAume / 2);
				break;
			case 4:
				valAume = valProd + (valProd * 10 / 100);
				por = ("Em 3X, com 10% DE JUROS");
				valPar = String.format("\t  Valor parcela: 3X R$ %.2f", valAume / 3);
				break;
			default:
				System.out.println("ERRO! Valor invalido!");
			}
			if ((op == 1) || (op == 2)) {
				
				JOptionPane.showMessageDialog(null, "**************************************************"
						+ "\n \t Valor Produto: " + valProd
						+"\n \t Tipo pagto.: " + por
						+"\n \t Valor Pagar: R$ " + valAume
						+"\n**************************************************");
			} else if ((op == 3) || (op == 4)) {
				JOptionPane.showMessageDialog(null, "*********************************************"
						+ "\n \t Valor Produto: " + valProd
						+"\n \t Tipo pagto.: " + por
						+"\n"+valPar
						+"\n \t Valor Pagar: R$ " + valAume
						+"\n*********************************************");
			}
			cont = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja comprar outro produto?" + "\n 1 - SIM | 0 - SAIR"));
		}
		
	}

}

