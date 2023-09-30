
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte edad;
		/*
		 * La variable pi es una constante y no se le puede modificar el
		 * valor
		 */
		final double pi;
		String Palabra;
		//declaramos la variable
		edad=32;
		Palabra="Rafael";
		pi=3.14;
		//para imprimir la variable lo hacemos asi
		/*
		 * La siguiente instrucción imprime en la conola (System.out)
		 *  el valor 
		 * de la variable edad y Palabra.
		 */
		System.out.println(edad);
		System.out.println(Palabra+pi);
		System.out.println(pi);
		
		if (edad >= 30) {
			System.out.println("Aun eres joven adulto");
		}else if(edad <= 18) {
			System.out.println("Eres menor de edad");
		}else if(edad >= 50) {
			System.out.println("eres un viejo");
		}
		
	}

}
