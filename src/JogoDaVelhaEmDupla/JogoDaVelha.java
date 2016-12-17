package JogoDaVelhaEmDupla;

import java.util.Scanner;

public class JogoDaVelha {
	Scanner leitora = new Scanner(System.in);

	String Tabuleiro[][] = new String[3][3];
	boolean JogadorX = true;
	boolean FimJogo = false;
	boolean JogoVencido = true;
	int linha = 0, coluna = 0;
	int rodada = 0;
	int aux = 1;
	int verificador;

	public static void main(String[] args) {
		System.out.println("\t \t \t =====Jogo da velha===== ");
		new JogoDaVelha();
	}

	public JogoDaVelha() {
		IniciaJogo();
		AtualizaTabuleiro();
		Jogo();

		for (int l = 0; l < Tabuleiro.length; l++) {
			for (int c = 0; c < Tabuleiro.length; c++) {
				System.out.print(Tabuleiro[l][c]);
				if (c < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}

	}

	public void Jogo() {
		int loop = 1;
		do {
			do {
				rodada++;
				System.out.println("Rodada: " + (rodada));
				String jogador = (JogadorX ? "X" : "O");
				System.out.println("É a vez do jogador: " + jogador);
				InformePosicao(jogador);
				AtualizaTabuleiro();
				JogadorX = !JogadorX;
				VerificaVencedor();

			} while (!FimJogo);
			 
			System.out.println("Deseja jogar outra partida? \n 1 - JOGAR 0- SAIR");
			loop = leitora.nextInt();
			if (loop != 1 && loop != 0) {
				System.out.println("VALOR INVALIDO!");
				System.out.println("Deseja jogar outra partida? \n 1 - JOGAR 0- SAIR");
				loop = leitora.nextInt();
			}
			if (loop == 1) {
				new JogoDaVelha();
			}
		} while (loop == 1);
	}

	public void InformePosicao(String jogada) { //Verifica se jogada inserida é valida. Se sim, recebe simbolo correspondente a jogador.
		

		System.out.print("Informe o número correspondente a posição desejada: ");
		int op = leitora.nextInt();
		int Aux = 0;
		while (Aux == 0) {
			switch (op) {
			case 1:
				if (Tabuleiro[0][0].equals("1")) {
					Tabuleiro[0][0] = jogada;
					Aux = 1;
				} else {
					System.out.println("Jogada invalida \n" + "Informe um valor válido: ");
					op = leitora.nextInt();
				}
				break;
			case 2:
				if (Tabuleiro[0][1].equals("2")) {
					Tabuleiro[0][1] = jogada;
					Aux = 1;
				} else {
					System.out.println("Jogada invalida \n" + "Informe um valor válido: ");
					op = leitora.nextInt();
				}
				break;
			case 3:
				if (Tabuleiro[0][2].equals("3")) {
					Tabuleiro[0][2] = jogada;
					Aux = 1;
				} else {
					System.out.println("Jogada invalida \n" + "Informe um valor válido: ");
					op = leitora.nextInt();
				}
				break;
			case 4:
				if (Tabuleiro[1][0].equals("4")) {
					Tabuleiro[1][0] = jogada;
					Aux = 1;
				} else {
					System.out.println("Jogada invalida \n" + "Informe um valor válido: ");
					op = leitora.nextInt();
				}
				break;
			case 5:
				if (Tabuleiro[1][1].equals("5")) {
					Tabuleiro[1][1] = jogada;
					Aux = 1;
				} else {
					System.out.println("Jogada invalida \n" + "Informe um valor válido: ");
					op = leitora.nextInt();
				}
				break;
			case 6:
				if (Tabuleiro[1][2].equals("6")) {
					Tabuleiro[1][2] = jogada;
					Aux = 1;
				} else {
					System.out.println("Jogada invalida \n" + "Informe um valor válido: ");
					op = leitora.nextInt();
				}
				break;
			case 7:
				if (Tabuleiro[2][0].equals("7")) {
					Tabuleiro[2][0] = jogada;
					Aux = 1;
				} else {
					System.out.println("Jogada invalida \n" + "Informe um valor válido: ");
					op = leitora.nextInt();
				}
				break;
			case 8:
				if (Tabuleiro[2][1].equals("8")) {
					Tabuleiro[2][1] = jogada;
					Aux = 1;
				} else {
					System.out.println("Jogada invalida \n" + "Informe um valor válido: ");
					op = leitora.nextInt();
				}
				break;
			case 9:
				if (Tabuleiro[2][2].equals("9")) {
					Tabuleiro[2][2] = jogada;
					Aux = 1;
				} else {
					System.out.println("Jogada invalida \n" + "Informe um valor válido: ");
					op = leitora.nextInt();
				}
				break;
			default:
				System.out.println("ERRO! Jogada invalida \n" + "Informe um valor válido: ");
				op = leitora.nextInt();
				break;
			}
		}

	}

	public void IniciaJogo() { //Primeira tabela. Aux para aparecer númeração
		for (int l = 0; l < Tabuleiro.length; l++) {
			for (int c = 0; c < Tabuleiro.length; c++) {
				Tabuleiro[l][c] = "" + aux;
				aux++;
			}
		}

	}

	public void AtualizaTabuleiro() { //Método para atualizar posições de jogadas

		for (int l = 0; l < Tabuleiro.length; l++) {
			for (int c = 0; c < Tabuleiro.length; c++) {
				System.out.print(Tabuleiro[l][c]);
				if (c < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
	}

	public void VerificaVencedor() {
		// Vencedor X
		if ((Tabuleiro[0][0] == "X" && Tabuleiro[0][1] == "X" && Tabuleiro[0][2] == "X")
				|| (Tabuleiro[1][0] == "X" && Tabuleiro[1][1] == "X" && Tabuleiro[1][2] == "X")
				|| (Tabuleiro[2][0] == "X" && Tabuleiro[2][1] == "X" && Tabuleiro[2][2] == "X")
				|| (Tabuleiro[0][0] == "X" && Tabuleiro[1][0] == "X" && Tabuleiro[2][0] == "X")
				|| (Tabuleiro[0][1] == "X" && Tabuleiro[1][1] == "X" && Tabuleiro[2][1] == "X")
				|| (Tabuleiro[0][2] == "X" && Tabuleiro[1][2] == "X" && Tabuleiro[2][2] == "X")
				|| (Tabuleiro[0][0] == "X" && Tabuleiro[1][1] == "X" && Tabuleiro[2][2] == "X")
				|| (Tabuleiro[0][2] == "X" && Tabuleiro[1][1] == "X" && Tabuleiro[2][0] == "X")) {
			FimJogo = true;
			JogoVencido = true;
			System.out.println("Jogador 'x' é vencedor");
			// Vencedor O
		} else if ((Tabuleiro[0][0] == "O" && Tabuleiro[0][1] == "O" && Tabuleiro[0][2] == "O")
				|| (Tabuleiro[1][0] == "O" && Tabuleiro[1][1] == "O" && Tabuleiro[1][2] == "O")
				|| (Tabuleiro[2][0] == "O" && Tabuleiro[2][1] == "O" && Tabuleiro[2][2] == "O")
				|| (Tabuleiro[0][0] == "O" && Tabuleiro[1][0] == "O" && Tabuleiro[2][0] == "O")
				|| (Tabuleiro[0][1] == "O" && Tabuleiro[1][1] == "O" && Tabuleiro[2][1] == "O")
				|| (Tabuleiro[0][2] == "O" && Tabuleiro[1][2] == "O" && Tabuleiro[2][2] == "O")
				|| (Tabuleiro[0][0] == "O" && Tabuleiro[1][1] == "O" && Tabuleiro[2][2] == "O")
				|| (Tabuleiro[0][2] == "O" && Tabuleiro[1][1] == "O" && Tabuleiro[2][0] == "O")) {
			FimJogo = true;
			JogoVencido = true;
		}

		// Verificando Empate
		if (!FimJogo && rodada == 9) {
			System.out.println("VELHA");
			FimJogo = true;
		}
	}
}
