package br.com.itegoss.grok;
import java.util.Scanner;

public class CalculoTrapezio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int h,b,B;
		double area;
		System.out.print("Informe a altura do trap�zio: ");
		h = teclado.nextInt();
		System.out.print("Informe a base menor do trap�zio: ");
		b = teclado.nextInt();
		System.out.println("Informe a base maior do trap�zio: ");
		B = teclado.nextInt();
		area = (h*(b+B)) / 2;
		System.out.println("A �rea do trap�zio �: "+area);
	}
}
