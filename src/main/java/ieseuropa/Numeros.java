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

	
	
        static boolean isLucky(int n){
		if (counter > n)
		    return true;
		if (n % counter == 0)
		    return false;
		int next_position = n - (n / counter);
		counter++;
		return isLucky(next_position);
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

  private static String calcularTiempo(int segundos) {
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int segundosRestantes = segundos % 60;
		return segundos + " segundos son: " + horas + " horas, " + minutos + " minutos, " + segundosRestantes + " segundos.";
	}





  public static void main(String[] args) {
	// TODO Auto-generated method stub
	numerosPell();
	System.out.println("\n" + isArmstrong(153));

	System.out.println(isLucky(19));


	int num = 4, segundos = 3680;
	if(esPrimo(num)) System.out.println("El número " + num + " es primo.");
	else System.out.println("El número " + num + " no es pirmo.");
	System.out.println("El factorial del número " + num + " es: " + factorial(num));
	System.out.println(calcularTiempo(segundos));

	int num = 4;
	if(esPrimo(num)) System.out.println("El número " + num + " es primo.");
	else System.out.println("El número " + num + " no es pirmo.");

	System.out.println("El factorial del número " + num + " es: " + factorial(num));




  }

}
