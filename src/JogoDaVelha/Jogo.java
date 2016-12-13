//Classe respons�vel por mostrar a matriz

package JogoDaVelha;

public class Jogo {

	// Declarado a matriz j� com valores. Colocada de forma privada para n�o ser
	// acessada por qualquer classe.
	private String[][] tab = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

	// M�todo indice, mostra os valores armazenados na matriz
	public String MostInd() {
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf(" |" + tab[l][c]+"| ");
			}

			// Foi ultilizado somente para quebrar a linha
			System.out.println("\n");
		}
		return null;
	}

	/* M�todo para verificar se o espa�o especifico j� est� preenchido por um
	 * dos jogadores (Verifica se a jogada � v�lida ou n�o)*/
	public boolean jogadaV(String posi) { /* Passa o parametro "posi" para testar
												e retorna VERDADEIRO ou FALSO*/

		/* Varre a linha e a coluna da matriz verificando se s�o iguais ao
		 * parametro "posi" se for retorna verdadeiro Se n�o retorna falso */
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (tab[l][c].equals(posi)) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * M�todo Jogada, pega a posi��o na matriz e coloca o simbolo correspondente
	 * ao jogador que escolheu a posi��o (X ou O)
	 */
	public void Jogada(String posi, String jogador) {
		if (posi.equals("1")) {
			tab[0][0] = jogador;
		} else if (posi.equals("2")) {
			tab[0][1] = jogador;
		} else if (posi.equals("3")) {
			tab[0][2] = jogador;
		} else if (posi.equals("4")) {
			tab[1][0] = jogador;
		} else if (posi.equals("5")) {
			tab[1][1] = jogador;
		} else if (posi.equals("6")) {
			tab[1][2] = jogador;
		} else if (posi.equals("7")) {
			tab[2][0] = jogador;
		} else if (posi.equals("8")) {
			tab[2][1] = jogador;
		} else if (posi.equals("9")) {
			tab[2][2] = jogador;
		}

	}
	
	/*M�todo ganhador. Vai verificar as 8 possibilidades de vit�ria 
	 * se ap�s a 8� jogada nenhuma das condi��es de vit�ria forem saciadas a String vencedor recebe EMPATE
	 * Caso alguma das jogadas seja satisfeita a variavel vencedor vai receber o simbolo correspondente
	 * retornando a vari�vel "vencedor" com o valor em String correspondente*/
	public String Ganhou(int jogadas){
		String[] Tot = new String[8];
		String vencedor = "";
		if (jogadas == 9 ){
			vencedor = "VELHA/EMPATE";
		}
		Tot[0] = tab[0][0]+tab[0][1]+tab[0][2];
		Tot[1] = tab[1][0]+tab[1][1]+tab[1][2];
		Tot[2] = tab[2][0]+tab[2][1]+tab[2][2];
		
		Tot[3] = tab[0][0]+tab[1][0]+tab[2][0];
		Tot[4] = tab[0][1]+tab[1][1]+tab[2][1];
		Tot[5] = tab[0][2]+tab[1][2]+tab[2][2];
		
		Tot[6] = tab[0][0]+tab[1][1]+tab[2][2];
		Tot[7] = tab[0][2]+tab[1][1]+tab[2][0];
		
		for(int aux = 0; aux < Tot.length; aux++){
			if (Tot[aux].equals("XXX")){
				vencedor = "Jogador 1 Ganhou!";
			}else if(Tot[aux].equals("OOO")){
				vencedor = "Jogador 2 Ganhou!";
			}
		}
		return vencedor;
	}

}
