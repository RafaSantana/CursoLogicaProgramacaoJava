package br.com.itegoss.grok;

import java.util.Scanner;

public class CalculadoraCase {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2, resu=0;
		String eq;
		System.out.println("***************************");
		System.out.println("* Calculadora de Equações *");
		System.out.println("***************************");
		System.out.println("'*' Multiplicação \n'/' Divisão \n'+' Soma \n'-' Subtração");
		System.out.println("***************************");
		System.out.println("Informe o tipo da equação");
		eq = teclado.next();
		System.out.print("Informe 1º valor: ");
		num1 = teclado.nextDouble();
		System.out.print("Informe 2º valor: ");
		num2 = teclado.nextDouble();
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
		System.out.println("A equação "+"'"+num1+" "+eq+" "+num2+"'"+" é = "+resu);
	}

}
