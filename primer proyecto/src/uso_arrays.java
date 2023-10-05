
public class uso_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int [][] matriz=new int [4][5];
		
		matriz[0][0] = 15;
		matriz[0][1] = 21;
		matriz[0][2] = 18;
		matriz[0][3] = 8;
		matriz[0][4] = 15;

		matriz[1][0] = 10;
		matriz[1][1] = 52;
		matriz[1][2] = 17;
		matriz[1][3] = 19;
		matriz[1][4] = 7;

		matriz[2][0] = 19;
		matriz[2][1] = 2;
		matriz[2][2] = 19;
		matriz[2][3] = 17;
		matriz[2][4] = 7;

		matriz[3][0] = 92;
		matriz[3][1] = 13;
		matriz[3][2] = 13;
		matriz[3][3] = 32;
		matriz[3][4] = 41;*/
		
		int [][] matriz= {
				{10,20,15,2,1},
				{15,20,56,25,2},
				{12,2,55,6,7},
				{15,5,6,8,9}
		};
		
		/*for (int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}*/
		
		for(int[]fila:matriz) {
			System.out.println();
			for(int z: fila) {
				System.out.print(z + " ");
			}
		}
		
	}

}
