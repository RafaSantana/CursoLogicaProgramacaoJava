package br.com.itegoss.grok;

import java.util.Scanner;

public class VerificarViagem {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String ferias;
	double valorConta;
	System.out.print("Didite  S se tem férias e N se não tem férias: ");
	ferias = teclado.next();
	System.out.print("Informe o valor da conta: ");
	valorConta = teclado.nextDouble();
	if((ferias.equals("S") || ferias.equals("s")) && (valorConta >= 4000)){
		System.out.println("Parabéns, bora para Las Vegas!");
	}else{
		System.out.println("Vai trabalhar rapáh!");
	}
}
}
