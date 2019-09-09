// Uma class SomaMatriz que soma duas
// matrizes de tamanho 3x3 inteiras
public class SomaMatriz {

	public static void main(String[] args) {
		int[][] mat1 = new int[3][3];
		mat1[0][0] = 1;
		mat1[0][1] = 2;
		mat1[0][2] = 3;

		mat1[1][0] = 10;
		mat1[1][1] = 20;
		mat1[1][2] = 30;

		mat1[2][0] = 5;
		mat1[2][1] = 10;
		mat1[2][2] = 15;
		
		int[][] mat2 = { 
			{2, 3, 4}, 
			{9, 10, 11}, 
			{7, 5, 2}
		};

		int[][] mat3 = new int[3][3];

		for (int linha = 0; linha <= 2; linha++) {
			for (int coluna = 0; coluna <=2; coluna++) {
				mat3[linha][coluna] = 	
					mat1[linha][coluna] +
					mat2[linha][coluna];
				System.out.
					print(mat3[linha][coluna]+ " ");

			}
			System.out.println();
		}

	}
}
