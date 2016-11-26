package br.com.itegoss.grok;
import java.util.Scanner;

public class Calculoraio {
	public static void main(String[] args) {
		int raio;
		double resu;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Infome o raio: ");
		raio = teclado.nextInt();
		resu = Math.pow(raio, 2)*3.14;
		System.out.println("O valor da área é "+resu);
		
	}
}
