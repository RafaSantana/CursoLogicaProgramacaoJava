package br.com.itegoss.grok;

import java.util.Scanner;

public class ParOuImpar {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe um n�mero: ");
	int num = teclado.nextInt();
	if (num % 2 == 0){
		System.out.println(num+" � PAR");
	}else{
		System.out.println(num+" � IMPAR");
	}
}
}
