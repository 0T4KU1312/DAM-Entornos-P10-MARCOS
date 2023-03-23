package main.java.ieseuropa;

public class CalcularMin {
	

	private static int calcularMin(int [] numeros) {
		int min = numeros[0]; 
		for (int i = 1; i < numeros.length; i++) {
		    if (numeros[i] < min) {
		        min = numeros[i]; 
		       
		    }
		} return min;
	}

	public static void main(String[] args) {
		int[] numeros = {228,9, 26, 16, 87,65,47,3,56,108};
		
		System.out.println("El mínimo es: " + calcularMin(numeros));
	
	}
}
