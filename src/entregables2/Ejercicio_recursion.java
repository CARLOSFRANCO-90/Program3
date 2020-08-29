package entregables2;

public class Ejercicio_recursion {
	public static void main (String[] args) {
		int x=6;
		int resultado = sumaRecur(x);
		System.out.println(resultado);
		
	}
	
	public static int sumaRecur(int numero) {
		
		int res;
		
		if(numero==1) {
			return 1;
		}
		else {
			res = numero * sumaRecur(numero-1);
		}
		
		return res;
	}
	
}
