
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vamos a hacerlo mal no podemos almacenarlo en un entero porque
		//te pide que sea un numero double.
		double raiz=Math.sqrt(9);
		double num1=5.85;
		//abajo estamos haciendo una refundición.
		int resultado=(int)Math.round(num1);
		System.out.println(raiz);
		System.out.println(resultado);
		
		
		double base=5;
		
		double exponente=3;
		//con pow averiguaremos el exponente.
		int resuelto=(int)Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es igual a " + resuelto);

	}

}
