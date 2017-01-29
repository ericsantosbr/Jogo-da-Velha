// O método recebe um objeto do tipo campo e faz o processo de imprimir de modo arcaico um campo na tela fazendo uso de System.out.println

/*
O campo deve se parecer mais ou menos com isso:

X | 1 | 2 | 3 |
- - - - - - - -
1 | * | * | * |
- - - - - - - -
2 | * | * | * |
- - - - - - - -
3 | * | * | * |

*/


public class imprimeCampo{
	public void imprime(campo Campo){
		String teste[][] = new String[3][3];
		teste = Campo.getCampo();
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(i == 0 && j == 0){
					System.out.println("X | 1 | 2 | 3 |");
					System.out.println("- - - - - - - -");
					System.out.printf("1 | ");
				}
				if(i == 1 && j == 0){
					System.out.printf("2 | ");
				}
				if(i == 2 && j == 0){
					System.out.printf("3 | ");
				}
				System.out.printf(teste[i][j] + " | ");
				if(j == 2){
					System.out.println("");
					if(i != 2){
						System.out.println("- - - - - - - -");
					}
				}
			}
		}
	}
}
