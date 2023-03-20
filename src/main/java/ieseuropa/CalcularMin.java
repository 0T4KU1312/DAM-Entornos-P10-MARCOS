package main.java.ieseuropa;

public class CalcularMin {

	public static void main(String[] args) {
		int[] numeros = {228,9, 26, 16, 87,65,47,3,56,47};
		int min = numeros[0]; 
		for (int i = 1; i < numeros.length; i++) {
		    if (numeros[i] < min) {
		        min = numeros[i]; 
		    }
		}
		System.out.println("El mínimo es: " + min);
	}

}
