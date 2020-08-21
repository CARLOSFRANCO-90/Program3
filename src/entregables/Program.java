package entregables;

public class Program {

	public static void main(String[] args) {	

		Universidad Manizales = new Universidad();
		
		Estudiantes P1 = new Estudiantes("Carlos", 200);
		Manizales.agregarEstudiante(P1);	
		
		Estudiantes P2 = new Estudiantes("Kamila", 500);
		Manizales.agregarEstudiante(P2);
				
		Estudiantes P3 = new Estudiantes("Juan", 2000);
		Manizales.agregarEstudiante(P3);
				
		Estudiantes P4 = new Estudiantes("Jose", 3500);
		Manizales.agregarEstudiante(P4);
		
		
		float promedio = Manizales.calcularPagos();	
		System.out.println(" Promedio: " + promedio);
		
		float comparaPago = Manizales.estudianteMayorPago();
		System.out.println(" Estudiante con mayor pago fue : $ " + comparaPago);
		
	}

}
