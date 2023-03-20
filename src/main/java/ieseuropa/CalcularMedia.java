package main.java.ieseuropa;

public class CalcularMedia {

	public static void main(String[] args) {
	int[] numeros = {57,20,89,55,23,69};
		
		int mayor = 0;
		int suma = 0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] > mayor) {
				mayor = numeros[i];
			}
			suma += numeros[i];
		}
		System.out.println("La media es " + suma/numeros.length);
	}
}