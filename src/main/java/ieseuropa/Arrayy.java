package main.java.ieseuropa;

import java.util.Arrays;

public class Arrayy {
	

	public static void ordenar(int[] a) {
		Arrays.sort(a);
	}


	public static double mediana (int [] a) {
		Arrays.sort(a);
		double mediana = 0;
		if (a.length % 2 != 0) {
			mediana = a[(a.length/2)];
		}else {
			int n = a[a.length / 2 - 1];
			int m = a[a.length / 2];
			mediana = (n+m) / 2;
		}
		return mediana;
	}
	private static int mayor(int[] numeros) {
		int num = Integer.MIN_VALUE;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i]>num) num = numeros[i];
		}
		return num;
	}
	
	private static int calcularMedia(int [] numeros) {
		int suma = 0;
		for(int i=0;i<numeros.length;i++) {
			
			suma += numeros[i];
			
		}return suma/numeros.length;
		
	}
	
	private static int calcularMin(int [] numeros) {
		int min = numeros[0]; 
		for (int i = 1; i < numeros.length; i++) {
		    if (numeros[i] < min) {
		        min = numeros[i]; 
		       
		    }
		} return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int [] a = {3, 6, 2, 7, 4, 8};
		System.out.println(mediana(a));
		System.out.println("El número mayor del array es: " + mayor(a));
		System.out.println("La media es: " + calcularMedia(a));
		System.out.println("El mínimo es: " + calcularMin(a));
	}


}
