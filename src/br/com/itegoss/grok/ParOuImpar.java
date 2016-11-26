package br.com.itegoss.grok;

import java.util.Scanner;

public class ParOuImpar {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe um número: ");
	int num = teclado.nextInt();
	if (num % 2 == 0){
		System.out.println(num+" é PAR");
	}else{
		System.out.println(num+" é IMPAR");
	}
}
}
