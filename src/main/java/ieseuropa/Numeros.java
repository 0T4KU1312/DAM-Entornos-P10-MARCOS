package main.java.ieseuropa;

public class Numeros {
  
  public static void numerosPell (){
		int n1=1, n2=0, pell;
        for (int i=0; i<15; i++) {
            pell = n1 + 2 * n2;
            System.out.print(pell + "-");
            n1 = n2;
            n2 = pell;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numerosPell();

	}

}
