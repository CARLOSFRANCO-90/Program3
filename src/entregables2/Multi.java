package entregables2;

public class Multi {
	
	public static void main(String[] args) {
		int x = multiplicar(5,3);
		System.out.println("resulrado " + x);
	}
	
	public static int multiplicar(int a, int b) {
		
		//caso base
		if(b==1) {
			return a;
		}
		
		//resolver parted el problema y hacerlo mas pequeño
		return a + multiplicar(a, b-1);
	} 

}
