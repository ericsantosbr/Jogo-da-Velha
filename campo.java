public class campo{
	private String matriz[][] = new String[3][3];
	// Construtor que varre a matriz ao instanciar o objeto Campo e faz uma limpeza
	public campo(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				matriz[i][j] = "*";
			}
		}
	}
	boolean jogada(int y, int x, String peca){
		// Corrige caso jogador tenha entrado com letras minúsculas
		if(peca.equals("x")){
			peca = "X";
		}
		if(peca.equals("y")){
			peca = "Y";
		}


		if ((y >= 0 && y < 3) && (x >= 0 && x < 3)){
			// Caso local no campo já tenha sido preenchido
			if(matriz[x][y].equals("X") || matriz[x][y].equals("Y")){
				System.out.println("Erro! Jogada inválida!");
				return false;
			}
			else{
				matriz[x][y] = peca;
				System.out.println("Perfeito");
				return true;
			}
		}
		else{
			System.out.println("Jogada inválida!\n");
			return false;
		}
	}
	String getMatriz(int i, int j){
		String atual = matriz[i][j];
		return atual;
	}

	public String[][] getCampo(){
		return matriz;
	}
}
