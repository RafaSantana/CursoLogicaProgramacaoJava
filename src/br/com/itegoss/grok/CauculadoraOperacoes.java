package br.com.itegoss.grok;

import java.util.Scanner;

public class CauculadoraOperacoes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2, resu=0;
		String eq;
		System.out.println("***************************");
		System.out.println("* Calculadora de Equa��es *");
		System.out.println("***************************");
		System.out.println("'*' Multiplica��o \n'/' Divis�o \n'+' Soma \n'-' Subtra��o");
		System.out.println("***************************");
		System.out.print("Informe 1� valor: ");
		num1 = teclado.nextDouble();
		System.out.print("Informe 2� valor: ");
		num2 = teclado.nextDouble();
		System.out.println("Informe o tipo da equa��o");
		System.out.println("EX: * / + -");
		eq = teclado.next();
		if (eq.equals("*")) {
			resu = num1 * num2;
		}
		if (eq.equals("/")) {
			resu = num1 / num2;
		}
		if (eq.equals("+")) {
			resu = num1 + num2;
		}
		if (eq.equals("-")) {
			resu = num1 - num2;
		}
		System.out.println("A equa��o "+"'"+num1+" "+eq+" "+num2+"'"+" � = "+resu);
	}
}
