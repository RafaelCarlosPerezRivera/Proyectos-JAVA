import java.util.*;
public class evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		if(edad<18) {
			
			System.out.println("Es menor de edad");
		}else if(edad<40){
			
			System.out.println("Es mayor de edad");
		
		}else if(edad<65) {
			System.out.println("Aun no eres un jubilado");
		}else {
			System.out.println("Eres un jubilado");
		}

	}

}
