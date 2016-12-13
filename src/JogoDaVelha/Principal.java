//Classe principal do jogo da velha
package JogoDaVelha;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner leitora = new Scanner(System.in);// Criado Scanner para ler dados informados pelo usuário.
		Jogo veia = new Jogo();//Instanciado o objeto da classe "Jogo".
		String posicao;
		int valida = 0, jogadas = 0;
		
		while(true){
			System.out.println("=======JOGO DA VELHA=======");
			veia.MostInd();
			
			do{ //inicio jogador 1
				System.out.println("Jogador 1, informe uma posição: ");
				posicao = leitora.next();
				while (!veia.jogadaV(posicao)){
					System.out.println("Jogada invalida tente novamente!");
					System.out.println("Jogador 1, informe uma posição: ");
					posicao = leitora.next();
					valida = 0;
				}
				veia.Jogada(posicao, "X");
				valida = 1;
				
			}while(valida == 0);// fim jogador 1
			
			jogadas++;
			valida = 0;
			veia.MostInd();
			if (!veia.Ganhou(jogadas).equals("")){
				break;
			}
			
			do{ //inicio jogador 2
				System.out.println("Jogador 2, informe uma posição: ");
				posicao = leitora.next();
				while (!veia.jogadaV(posicao)){
					System.out.println("Jogada invalida tente novamente!");
					System.out.println("Jogador 2, informe uma posição: ");
					posicao = leitora.next();
					valida = 0;
				}
				veia.Jogada(posicao, "O");
				valida = 1;
				
			}while(valida == 0);// fim jogador 2
			
			jogadas++;
			valida = 0;
			veia.MostInd();
			if (!veia.Ganhou(jogadas).equals("")){
				break;
			}
		}
		System.out.println("O "+ veia.Ganhou(jogadas));
		
	}
}
