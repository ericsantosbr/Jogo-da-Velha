import java.util.Scanner;

public class jogoDaVelha{
	public static void main(String [] args){
		// Instancia objeto de entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Instancia objeto campo
		campo Campo = new campo();

		// Instancia objeto que imprime o campo
		imprimeCampo imprime = new imprimeCampo();

		// Variáveis necessárias para o funcionamento do jogo
		/*
		Variável jogo é a que vai decidir se o jogo continua ou não dentro da função while logo abaixo
		Variáveis jogadorX e jogadorY são as que decidem de quem é a vez, através de dois laços while
		Variável vencedor guarda o nome do vencedor da partida
		*/
		boolean jogo = true;
		boolean jogadorX = true;
		boolean jogadorY = false;
		String vencedor = "null";

		// Instancia objeto que vai fazer uma checagem do sucesso
		checaSucesso checagem = new checaSucesso();

		// Laço while onde se passa o jogo
		while(jogo){
			imprime.imprime(Campo);
			// Vez do jogador X
			while(jogadorX){
				int lX1 = 0;
				int lY1 = 0;
				System.out.printf("Digite a jogada em X do jogador X: ");
				lX1 = scanner.nextInt();
				lX1 = --lX1;
				System.out.printf("Digite a jogada em Y do jogador X: ");
				lY1 = scanner.nextInt();
				lY1 = --lY1;
				// Caso jogada seja válida, inverte a vez para o Jogador Y
				if(Campo.jogada(lX1, lY1, "X") == true){
					jogadorX = false;
					jogadorY = true;
				}
				else{
					System.out.println("Ops! Algo deu errado! Tente novamente!");
					imprime.imprime(Campo);
				}
				if(checagem.sucesso(Campo) == true){
					jogadorY = false;
					jogo = false;
					vencedor = "X";
				}
			}
			imprime.imprime(Campo);
			// Vez do Jogador Y
			while(jogadorY){
				int lX2 = 0;
				int lY2 = 0;
				System.out.printf("Digite a jogada em X do jogador Y: ");
				lX2 = scanner.nextInt();
				lX2 = --lX2;
				System.out.printf("Digite a jogada em Y do jogador Y: ");
				lY2 = scanner.nextInt();
				lY2 = --lY2;
				// Caso a jogada seja válida, inverte a vez para o Jogador X
				if(Campo.jogada(lX2, lY2, "Y") == true){
					jogadorX = true;
					jogadorY = false;
				}
				else{
					System.out.println("Ops! Algo deu errado! Tente novamente!");
					imprime.imprime(Campo);
				}
				if(checagem.sucesso(Campo) == true){
					jogadorX = false;
					jogo = false;
					vencedor = "Y";
				}
			}
		}
	System.out.println("");
	imprime.imprime(Campo);
	System.out.println("Parabéns, o jogador " + vencedor + " venceu o jogo!");
	}
}
