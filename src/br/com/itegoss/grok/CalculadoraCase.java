package br.com.itegoss.grok;

import javax.swing.JOptionPane;

public class CalculadoraCase {
	public static void main(String[] args) {
		double num1, num2, resu = 0;
		String simbEq = "";
		int cont = 1;
		while (cont == 1) {
			int eq = Integer.parseInt(JOptionPane.showInputDialog(null,
					"         ********************************" + "\n             **** CALCULADORA ****"
							+ "\n                    usando (switch)" + "\n         ********************************"
							+ "\n1. * Multiplica��o    ||    2. / Divis�o \n3. + Soma                 ||    4. - Subtra��o"
							+ "\n -----------------------------" + "\n Informe o tipo da equa��o: "));
			if (eq == 1 || eq == 2 || eq == 3 || eq == 4) {
				num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe 1� valor: "));
				num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe 2� valor: "));
				switch (eq) {
				case 1:
					resu = num1 * num2;
					simbEq = "*";
					break;
				case 2:
					resu = num1 / num2;
					simbEq = "/";
					break;
				case 3:
					resu = num1 + num2;
					simbEq = "+";
					break;
				case 4:
					resu = num1 - num2;
					simbEq = "-";
					break;
				default:
					JOptionPane.showMessageDialog(null, "     ERRO!\nVALOR INVALIDO!");
					break;
				}
				JOptionPane.showMessageDialog(null, "====================" + "\n      '" + num1 + " " + simbEq + " "
						+ num2 + "'"+String.format(" = %.2f", resu) + "\n====================");
			} else {
				JOptionPane.showMessageDialog(null,
						"\tERRO!\nValor digitado n�o corresponde" + "\n as opera��es disponiveis.");
			}
			cont = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Deseja fazer outra opera��o" + "\n 1 - SIM | 0 - SAIR"));
		}
	}

}
