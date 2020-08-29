package entregables2;

public class Ejercicio_recursion1 {
	public static void main (String[] args) {
		int[] arreglo = new int[]{3, 8,  7, 2, 5, 7, 14};
		int elemento = 4;
		boolean resultado_busqueda = busca(arreglo, elemento, 0);
		System.out.println("Encontrado? " + resultado_busqueda);
	}
	
	public static boolean busca(int[] arr, int elemento, int desde) {
			
		// Caso base
		if(desde == arr.length -1) {
			if(arr[desde]==elemento) {
				return true;
			}
			return false;
		}
		
		// resolver parte del problema 
		if(arr[desde]==elemento) {
			return true;
		}
		
		//Hacer el problema mas pequeño
		return busca(arr, elemento, desde + 1);
		
		
	}

}
