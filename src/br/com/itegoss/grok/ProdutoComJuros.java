package br.com.itegoss.grok;

import java.util.Scanner;

public class ProdutoComJuros {
	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		double valProd,valAume=0; String por="0";
		System.out.print("Informe o valor do produto: R$ ");
		valProd = teclado.nextDouble();
		System.out.println("---------------------------------------\n 1-'10%' | 3-'25%' | 4-'30%' | 8-'50%' \n---------------------------------------");
		System.out.print("Informe a porcentagem de acréscimo: ");
		int op = teclado.nextInt();
		switch (op) {
		case 1:
			valAume = valProd+(valProd*10/100);
			por = ("10%");
			break;
		case 3:
			valAume = valProd+(valProd*25/100);
			por = ("25%");
			break;
		case 4:
			valAume = valProd+(valProd*30/100);
			por = ("30%");
			break;
		case 8:
			valAume = valProd+(valProd*50/100);
			por = ("50%");
			break;
		default:
			System.out.println("ERRO! Valor invalido!");
		}
		if ((op == 1) || (op == 3) || (op == 4) || (op == 8)){
			System.out.println("********************");
			System.out.println("Val. Produto: "+valProd);
			System.out.println("Acréscimo: "+por);
			System.out.println("Valor final: R$ "+valAume);
			System.out.println("********************");
		}
	}

}
