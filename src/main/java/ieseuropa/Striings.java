package main.java.ieseuropa;

public class Striings {
  
  public static void repeticionStrings (String a, String b, int num){
    for (int i = 0; i < num; i++){
      System.out.print (a + " " + b + " ");
    }
  }

	
  public static void borrarAparicion (String a, String b) {
	System.out.println(a.toLowerCase().replace(b.toLowerCase(), ""));
  }


	
  public static String repeticionLetras (String a){
	String b = "";
	for (int i = 0; i < a.length(); i++) {
		b += a.charAt(i);
		b += a.charAt(i);
	}
	return b;
  }
	


  private static int longitud(String nombre) {
		return nombre.length();
  }

  private static String mayus(String nombre) {
		return nombre.toUpperCase();
	}
	private static String minus(String nombre) {
		return nombre.toLowerCase();
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

    borrarAparicion("Hola que tal estas?", "estas");


    System.out.println("\n" + repeticionLetras("NBA"));


    String nombre = "Jorge";
	System.out.println("El nombre " + nombre + " tiene " + longitud(nombre) + " letras.");


    System.out.println("El nombre " + nombre + " con todo letras mayúsculas " + mayus(nombre) + " y  con todo letras minúsculas " + minus(nombre) + ".");

    char letra = 'o';
	System.out.println("La letra " + letra + " se repite " + numOcurrencias(nombre, letra) + " veces en el nombre " + nombre + ".");




  }

}
