import javax.swing.*;
public class Factorial_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado=1;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 10"));
		
		for (int i=numero; i>0; i--) {
			resultado=resultado*i;
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);
		
	}

}
