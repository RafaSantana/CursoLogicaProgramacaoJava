package br.com.itegoss.grok;

import javax.swing.JOptionPane;

public class TabuadaNoveMultLacoFor {
	public static void main(String[] args) {
		String message = "";
		for (int cont = 1; cont <= 10; cont++) {
			message += (cont) + ((cont != 11) ? "x9= "+(cont*9)+"\n" : "");
		}
		JOptionPane.showMessageDialog (null, message);
	}
}
