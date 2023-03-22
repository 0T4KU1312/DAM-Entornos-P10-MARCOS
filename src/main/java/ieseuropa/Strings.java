package main.java.ieseuropa;

public class Strings {
  
  public static void repeticionStrings (String a, String b, int num){
    for (int i = 0; i < num; i++){
      System.out.print (a + " " + b + " ");
    }
  }

  private static int longitud(String nombre) {
		return nombre.length();


  private static String mayus(String nombre) {
		return nombre.toUpperCase();
	}
	private static String minus(String nombre) {
		return nombre.toLowerCase();

  private static int numOcurrencias(String nombre, char letra) {
		int num = 0;
		for (int i = 0; i < nombre.length(); i++) {
			if(nombre.charAt(i) == letra) num++;
		}
		return num;


	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
    repeticionStrings("hola", "caracola", 3);

    String nombre = "Jorge";
	System.out.println("El nombre " + nombre + " tiene " + longitud(nombre) + " letras.");


    System.out.println("El nombre " + nombre + " con todo letras mayúsculas " + mayus(nombre) + " y  con todo letras minúsculas " + minus(nombre) + ".");

    char letra = 'o';
	System.out.println("La letra " + letra + " se repite " + numOcurrencias(nombre, letra) + " veces en el nombre " + nombre + ".");


  }

}
