package br.com.itegoss.grok;

import javax.swing.JOptionPane;

public class CemPrimeirosNumerosPrimos {
	public static void main(String[] args) {
		int primo, cont;
		String msg = "";
		for (primo = 2; primo <=542; primo++) {
			int medidor = 0;
			for (cont = 1; cont <= primo; cont++) {
				if (primo % cont == 0) {
					medidor++;
				}
			}
			if (medidor < 3) {
				msg += (primo + ". ");
			}
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}
