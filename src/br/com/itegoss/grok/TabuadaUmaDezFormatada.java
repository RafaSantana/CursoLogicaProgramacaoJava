package br.com.itegoss.grok;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TabuadaUmaDezFormatada {
	public static void main(String[] args) {
		String message = "";
		for (int cont1 = 1; cont1 <= 10; cont1++) {
			for (int cont2 = 1; cont2 <= 10; cont2++) {
				message += (cont1+"x"+cont2+"="+(cont1*cont2)+" \t");
			}
			message+="\n";
		}
		JTextArea formatado = new JTextArea(message);
		JOptionPane.showMessageDialog(null, formatado);
	}
}