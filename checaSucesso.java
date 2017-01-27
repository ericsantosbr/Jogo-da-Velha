public class checaSucesso {
	public boolean sucesso(campo Campo){
		boolean sucesso = false;
		String[][] matriz = new String[3][3];
		matriz = Campo.getCampo();

		if(matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")){
			return true;
		}
		if(matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")){
				return true;
		}
		if(matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X")){
				return true;
		}
		if(matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X")){
				return true;
		}
		if(matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")){
				return true;
		}
		if(matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X")){
				return true;
		}
		if(matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X")){
				return true;
		}
		if(matriz[2][0].equals("X") && matriz[1][1].equals("X") && matriz[0][2].equals("X")){
				return true;
		}
		if(matriz[0][0].equals("Y") && matriz[1][1].equals("Y") && matriz[2][2].equals("Y")){
			return true;
		}
		if(matriz[0][0].equals("Y") && matriz[0][1].equals("Y") && matriz[0][2].equals("Y")){
				return true;
		}
		if(matriz[0][0].equals("Y") && matriz[1][0].equals("Y") && matriz[2][0].equals("Y")){
				return true;
		}
		if(matriz[1][0].equals("Y") && matriz[1][1].equals("Y") && matriz[1][2].equals("Y")){
				return true;
		}
		if(matriz[2][0].equals("Y") && matriz[2][1].equals("Y") && matriz[2][2].equals("Y")){
				return true;
		}
		if(matriz[0][1].equals("Y") && matriz[1][1].equals("Y") && matriz[2][1].equals("Y")){
				return true;
		}
		if(matriz[0][2].equals("Y") && matriz[1][2].equals("Y") && matriz[2][2].equals("Y")){
				return true;
		}
		if(matriz[2][0].equals("Y") && matriz[1][1].equals("Y") && matriz[0][2].equals("Y")){
				return true;
		}
		else{
			return false;
		}
	}
}
