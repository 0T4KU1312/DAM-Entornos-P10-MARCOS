package main.java.ieseuropa;

public class Strings {
  
  public static void repeticionStrings (String a, String b, int num){
    for (int i = 0; i < num; i++){
      System.out.print (a + " " + b + " ");
    }
  }
  private static int longitud(String nombre) {
		return nombre.length();
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
    repeticionStrings("hola", "caracola", 3);
    String nombre = "Jorge";
	System.out.println("El nombre " + nombre + " tiene " + longitud(nombre) + " letras.");
  }

}
