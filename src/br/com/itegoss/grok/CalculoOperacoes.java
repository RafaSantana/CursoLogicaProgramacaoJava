package br.com.itegoss.grok;

import java.util.Scanner;

public class CalculoOperacoes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2;
		System.out.print("Informe o 1� n�mero: ");
		num1 = teclado.nextDouble();
		System.out.print("Informe o 2� n�mero: ");
		num2 = teclado.nextDouble();
		System.out.println("A soma de "+num1 +" + "+num2+ " � = " + (num1 + num2));
		System.out.println("A subra��o de "+num1 +" - "+num2+ " � = " + (num1 - num2));
		System.out.println("A muliplica��o de "+num1 +" * "+num2+ " � = " + (num1 * num2));
		if(num2== 0){
			System.out.println("N�O � POSSIVEL DIVIS�O POR 0");
		}else{
			System.out.println("A divis�o "+num1 +" + "+num2+ " � = " + (num1 / num2));	
		}
	}

}