package br.com.itegoss.grok;

import javax.swing.JOptionPane;

public class RendimentoVendedores {
	public static void main(String[] args) {
		int loop = 1;
		do {
			double sem1=0, sem2=0, vendas1=0, vendas2=0;
			for (int mes = 1; mes <=6; mes++) {
				vendas1 = Double.parseDouble(JOptionPane.showInputDialog("Informe as vendas do " + mes + "º mês"));
				sem1+=vendas1;
			}
			for (int mes = 7; mes <= 12; mes++) {
				vendas2 = Double.parseDouble(JOptionPane.showInputDialog("Informe as vendas do " + mes + "º mês"));
				sem2+=vendas2;
			}
			JOptionPane.showMessageDialog(null,"\t  Vendas 1ª semestre: " + sem1+"\n \t Vendas 2º semestre: "+sem2+"\n \t Resumo do ano: "+(sem1+sem2));
			loop = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Deseja ver rendimento de outro vendedor?\n 1- SIM\n 0- NÃO"));
			if (loop != 1 && loop != 0) {
				JOptionPane.showMessageDialog(null, "VALOR INVALIDO!");
				loop = 1;
			}
		} while (loop == 1);
	}

}