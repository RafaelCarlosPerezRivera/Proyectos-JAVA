import javax.swing.*;
public class bucle_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] paises=new String[10];
		//Con este bucle for no nos preocuparemos de cuantos indices de la matriz hay y ademas rellenaremos la matriz
		for(int i=0;i<paises.length;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce paises " + (i+1));
		}
		/*paises[0]="España";
		paises[1]="Portugal";
		paises[2]="México";
		paises[3]="Colombia";
		paises[4]="Perú";
		paises[5]="Alemania";
		paises[6]="Gran Bretaña";
		paises[7]="Francia";
		paises[8]="Rusia";
		paises[9]="Uruguay";
		
		String [] paises={"España","Portugal","México","Colombia","Perú","Alemania","Gran Bretaña","Francia","Rusia",""};
		
		for(int i=0; i<paises.length;i++) {
			System.out.println("Pais " + (i+1) + " " + paises[i]);
		}*/
		
		for(String elemento:paises) {
			System.out.println("País: " + elemento);
		}
		
	}

}
