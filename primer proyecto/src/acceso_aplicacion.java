import java.util.*;
import javax.swing.*;

public class acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner contrase=new Scanner(System.in);
		System.out.println("Crea una contraseña: ");
		String clave=contrase.nextLine();
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña:");
			
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			}
			
		}
		
		System.out.println("Contraseña correcta, acceso permitido");
	}

}
