import javax.swing.*;
public class entrada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre");
			
			String edad=JOptionPane.showInputDialog("introduce tu edad");
			
			int edad_usuario=Integer.parseInt(edad);
			edad_usuario++;
			System.out.println("Hola " + Nombre_usuario + " tienes " + edad + " años, y el año que viene tendrás " + edad_usuario );
	}

}
