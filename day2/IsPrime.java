package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int n=13;
		boolean prime=true;
		 for(int i=2;i<n;i++) {
			 if(n%i==0) {
				 System.out.println("non prime number");
				 prime=false;
				 break;
				
			 }
			 else {
				 System.out.println("prime number");
				 prime=true;
				 break;
			 }
			
			 
		 }
		 
	
		 
		
	}
	
    

      }

