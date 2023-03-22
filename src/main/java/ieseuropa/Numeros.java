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
	
	public static int counter = 2;
        static boolean isLucky(int n){
		if (counter > n)
		    return true;
		if (n % counter == 0)
		    return false;
		int next_position = n - (n / counter);
		counter++;
		return isLucky(next_position);
        }
	
  public static void main(String[] args) {
	// TODO Auto-generated method stub
	numerosPell();
	System.out.println("\n" + isArmstrong(153));
	System.out.println(isLucky(19));
  }

}
