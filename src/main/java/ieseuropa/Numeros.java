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
  public static boolean isArmstrong(int n) {   
	int temp, digits=0, last=0, sum=0;
	temp=n;
	while(temp>0){   
		temp = temp/10;   
		digits++;   
	}   
	temp = n;   
	while(temp>0){    
		last = temp % 10; 
		sum += (Math.pow(last, digits)); 
		temp = temp/10;   
	} 
	if(n==sum)
		return true;
		else return false;   
	}   
  private static boolean esPrimo(int num) {
      if (num < 2) return false;
      for (int i = 2; i <= Math.sqrt(num); i++) {
          if (num % i == 0) {
          	return false;
          }
      }
      return true;
  }

  private static int factorial(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}


  public static void main(String[] args) {
	// TODO Auto-generated method stub
	numerosPell();
	System.out.println("\n" + isArmstrong(153));
	int num = 4;
	if(esPrimo(num)) System.out.println("El número " + num + " es primo.");
	else System.out.println("El número " + num + " no es pirmo.");

	System.out.println("El factorial del número " + num + " es: " + factorial(num));


  }

}
