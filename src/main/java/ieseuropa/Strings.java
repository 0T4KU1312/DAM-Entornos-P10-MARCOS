package main.java.ieseuropa;

public class Strings {
  
  public static void repeticionStrings (String a, String b, int num){
    for (int i = 0; i < num; i++){
      System.out.print (a + " " + b + " ");
    }
  }
	
  public static String repeticionLetras (String a){
	String b = "";
	for (int i = 0; i < a.length(); i++) {
		b += a.charAt(i);
		b += a.charAt(i);
	}
	return b;
  }
	
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    repeticionStrings("hola", "caracola", 3);
    System.out.println("\n" + repeticionLetras("NBA"));
  }

}
