public class checaSucesso {
	public int sucesso(campo Campo){
		boolean sucesso = false;
		String[][] matriz = new String[3][3];
		matriz = Campo.getCampo();
		int somaEmpate = 0;

		if(matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")){
			return 1;
		}
		if(matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")){
				return 1;
		}
		if(matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X")){
				return 1;
		}
		if(matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X")){
				return 1;
		}
		if(matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")){
				return 1;
		}
		if(matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X")){
				return 1;
		}
		if(matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X")){
				return 1;
		}
		if(matriz[2][0].equals("X") && matriz[1][1].equals("X") && matriz[0][2].equals("X")){
				return 1;
		}
		if(matriz[0][0].equals("Y") && matriz[1][1].equals("Y") && matriz[2][2].equals("Y")){
			return 1;
		}
		if(matriz[0][0].equals("Y") && matriz[0][1].equals("Y") && matriz[0][2].equals("Y")){
				return 1;
		}
		if(matriz[0][0].equals("Y") && matriz[1][0].equals("Y") && matriz[2][0].equals("Y")){
				return 1;
		}
		if(matriz[1][0].equals("Y") && matriz[1][1].equals("Y") && matriz[1][2].equals("Y")){
				return 1;
		}
		if(matriz[2][0].equals("Y") && matriz[2][1].equals("Y") && matriz[2][2].equals("Y")){
				return 1;
		}
		if(matriz[0][1].equals("Y") && matriz[1][1].equals("Y") && matriz[2][1].equals("Y")){
				return 1;
		}
		if(matriz[0][2].equals("Y") && matriz[1][2].equals("Y") && matriz[2][2].equals("Y")){
				return 1;
		}
		if(matriz[2][0].equals("Y") && matriz[1][1].equals("Y") && matriz[0][2].equals("Y")){
				return 1;
		}
/*		if(matriz[0][0].equals("X") || matriz[0][0].equals("Y") && matriz[0][1].equals("X") || matriz[0][1].equals("Y") && matriz[0][2].equals("X") || matriz[0][2].equals("Y") && matriz[1][0].equals("X") || matriz[1][0].equals("Y") && matriz[1][1].equals("X") || matriz[1][1].equals("Y") && matriz[1][2].equals("X") || matriz[1][2].equals("Y") && matriz[2][0].equals("X") || matriz[2][0].equals("Y") && matriz[2][1].equals("X") || matriz[2][2].equals("Y") && matriz[2][2].equals("X") || matriz[2][2].equals("Y")){
			return 3;
		}*/
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(matriz[i][j].equals("X") || matriz[i][j].equals("Y")){
					somaEmpate++;
				}
			}
		}
		if(somaEmpate == 9){
			return 3;
		}
		else{
			return 2;
		}
	}
}
