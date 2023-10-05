import javax.swing.*;
public class representacion_saldo_banca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double acumulado;
		
		double interes=0.10;
		
		double [][] saldo=new double[6][5];
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		
		for(int i=0; i<6; i++) {
			
			 saldo[i][0]=numero;
			 
			 acumulado=numero;
			
			 for(int j=1; j<5; j++) {
				 acumulado=acumulado+(acumulado*interes);
				 
				 saldo[i][j]=acumulado;
			 }
			 
			 interes=interes+0.01;
			
		}
		
		for(int z=0; z<6; z++) {
			System.out.println();
			
			for(int h=0; h<5; h++) {
				System.out.printf("%1.2f", saldo[z][h]);
				System.out.print(" | ");
			}
		}
		
	}

}

