package main.java.ieseuropa;

public class Strings {
  
  public static void repeticionStrings (String a, String b, int num){
    for (int i = 0; i < num; i++){
      System.out.print (a + " " + b + " ");
    }
  }
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
    char letra = 'o';
	System.out.println("La letra " + letra + " se repite " + numOcurrencias(nombre, letra) + " veces en el nombre " + nombre + ".");
  }

}
