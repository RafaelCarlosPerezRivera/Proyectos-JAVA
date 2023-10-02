import java.util.*;
public class Entrada1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entra_primera=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entra_primera.nextLine();
		
		System.out.println("Introdiduce tu edad");
		
		int edad=entra_primera.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ", el año que viene tendras " + (edad+1) + " años");

	}

}
