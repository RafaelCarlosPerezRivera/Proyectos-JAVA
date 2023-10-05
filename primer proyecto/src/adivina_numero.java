import java.util.*;
public class adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio=(int)(100*(Math.random()));
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while (numero!=aleatorio) {
			intentos++;
			System.out.println("Introduce un número: ");
			
			numero=entrada.nextInt();
			
			if (aleatorio<numero) {
				System.out.println("Más bajo que el que existe");
			}
			else if (aleatorio>numero) {
				System.out.println("Más alto que el que existe");
			}
		}
		System.out.println(aleatorio);
		System.out.println("Correcto");
		System.out.println("Lo has conseguido en " + intentos + " intentos.");
		
	}

}
