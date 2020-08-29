package entregables2;

public class Array2 {
public static void main(String[] args) {
		
		int[] array = {1,3,5,7,9};
		int numero_buscar =3;
		int numero_encontrado = posicion_numero(array, numero_buscar, 0);
		System.out.println(numero_encontrado);

	}
	
	public static int posicion_numero(int[] array, int numero_buscar, int indice) {
		
		if(indice==array.length) {
			return 0;
		
		}else if(array[indice]==numero_buscar){
			return indice;
		}else {
			return posicion_numero(array, numero_buscar, indice+1);
		
		}
	}
}
