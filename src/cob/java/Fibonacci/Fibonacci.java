package cob.java.Fibonacci;

public class Fibonacci {

	
	 static void getFibonacci(int range)
	   {
	           
	              int f1=0;
	              int f2=1;
	              System.out.print(f1 +" "+f2+" " );
	          
	          for(int i=1;i<=range;i++)
	         {
	            int f3 = f1 + f2;
	          System.out.print(f3+ " ");
	           f1 = f2;
	           f2 = f3;
	           
	         }

	   }

	
	          public static void main(String[] args) {
	       System.out.println("Welcome to Fibonacci Series Program!!");
	        	    getFibonacci(10); 
	           
	          }
                        } 
	
	
	
	
	


