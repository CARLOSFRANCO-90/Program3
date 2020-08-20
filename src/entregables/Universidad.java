package entregables;

public class Universidad {

	private int CAPACIDAD_MAXIMA = 500;
	private int cantidad = 0;
	Estudiantes[] arrEstudiantes = new Estudiantes[CAPACIDAD_MAXIMA];
	
	
	
	public void agregarEstudiante(Estudiantes estudiante) {
		if(cantidad > CAPACIDAD_MAXIMA - 1) {
			System.out.println("ERROR");
		}
		else {
			arrEstudiantes[cantidad] = estudiante;
			cantidad++;
		}
	}
	
	public float calcularPagos() {
		float totalPromedio=0;
		for (int i=0; i<cantidad; i++) {
			totalPromedio = totalPromedio + arrEstudiantes[i].ctaXPagar;
		}
		totalPromedio = totalPromedio / cantidad;
		return totalPromedio;
	}
	
	public float estudianteMayorPago() {
		float mayorPago=0;
		for (int i=0; i<cantidad; i++) {
			for(int e=i+1; e<cantidad; e++) {
				if(arrEstudiantes[i].ctaXPagar > arrEstudiantes[e].ctaXPagar) {
					mayorPago = arrEstudiantes[i].ctaXPagar;
				}
				else {
					mayorPago=arrEstudiantes[e].ctaXPagar;
				}
			}
		}
		return mayorPago;
		
	}
	
	
}
