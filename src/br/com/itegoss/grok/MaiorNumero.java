package br.com.itegoss.grok;

import java.util.Scanner;

public class MaiorNumero {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int num1, num2, num3;
	System.out.print("Informe o 1� n�mero: ");
	num1 = teclado.nextInt();
	System.out.print("Informe o 2� n�mero: ");
	num2 = teclado.nextInt();
	System.out.print("Informe o 3� n�mero: ");
	num3 = teclado.nextInt();
	if ((num1 > num2) && (num1 > num3)){
		System.out.println(num1+" � o maior n�mero digitado");
	}else{
		if ((num2 > num1) && (num2 > num3)){
			System.out.println(num2+" � o maior n�mero digitado");
		}else{
			if ((num3 > num1) && (num3 > num2)){
				System.out.println(num3+" � o maior n�mero digitado");
			}
		}
	}
}
}
