package br.com.itegoss.grok;

import javax.swing.JOptionPane;

public class TabuadaDe9Vetor {
	public static void main(String[] args) {
		int n[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int cont;
		String msg="";
		for( cont = 0; cont <= n.length; cont++){
		System.out.println(n[8]+"*"+n[cont]+"="+(n[8]*n[cont]));
		}
		System.out.println(msg);
		//JOptionPane.showMessageDialog(null,msg);
	}
}
