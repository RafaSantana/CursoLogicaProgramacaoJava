package br.com.itegoss.grok;

import java.util.Scanner;

public class CalculoOperacoes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2;
		System.out.print("Informe o 1º número: ");
		num1 = teclado.nextDouble();
		System.out.print("Informe o 2º número: ");
		num2 = teclado.nextDouble();
		System.out.println("A soma de "+num1 +" + "+num2+ " é = " + (num1 + num2));
		System.out.println("A subração de "+num1 +" - "+num2+ " é = " + (num1 - num2));
		System.out.println("A muliplicação de "+num1 +" * "+num2+ " é = " + (num1 * num2));
		if(num2== 0){
			System.out.println("NÃO É POSSIVEL DIVISÃO POR 0");
		}else{
			System.out.println("A divisão "+num1 +" + "+num2+ " é = " + (num1 / num2));	
		}
	}

}