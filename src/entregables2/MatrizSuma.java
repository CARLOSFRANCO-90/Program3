package entregables2;

public class MatrizSuma {
	
public static void main(String[] args) {
		
		int[][] m =   {
			
			          {1,3,4},
				      {3,5,1},
				      {6,8,1}
				      
		            };
		
        recorrerMatriz(m, 0,0);
         
	}
       
	public static void recorrerMatriz(int[][] m, int 1, int k) {
		
		System.out.println(m[i][k]+ " ");
			
			if(i!=m.length-1 || k!=m[i].length-1) {
			
				if(k==m[i].length-1) {
					i++;
					k=0;
					System.out.println("");
				}else {
					k++;
			}
				
			   recorreMatriz(m, i, k);
			}
	   }	
	}	

}
