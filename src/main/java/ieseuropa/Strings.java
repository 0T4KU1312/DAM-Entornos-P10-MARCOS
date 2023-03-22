package main.java.ieseuropa;

public class Strings {
  
  public static void repeticionStrings (String a, String b, int num){
    for (int i = 0; i < num; i++){
      System.out.print (a + " " + b + " ");
    }
  }
  private static String mayus(String nombre) {
		return nombre.toUpperCase();
	}
	private static String minus(String nombre) {
		return nombre.toLowerCase();
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
    repeticionStrings("hola", "caracola", 3);
    System.out.println("El nombre " + nombre + " con todo letras mayúsculas " + mayus(nombre) + " y  con todo letras minúsculas " + minus(nombre) + ".");
  }

}
