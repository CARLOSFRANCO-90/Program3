package entregables2;

public class Array1 {

		public static void main(String[] args) {
			
			int[] array = {1,2,3,4,5,6,7};
			iniciaArray(array, 0);

		}
		
		public static void iniciaArray(int []array, int indice) {
			
			if(indice == array.length){
				
			}
			else {
				System.out.println(array[indice]);
				iniciaArray(array, indice+1);
			}
			
		}

	

}
