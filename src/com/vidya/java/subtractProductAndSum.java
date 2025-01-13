// 1281. Subtract the Product and Sum of Digits of an Integer
// A very beginner friendly question wherein, i have implemented two logic and merged em', to bring the desired output. In this i have made a small small mistakes like missed declaring the variables, function access scope i kept as public initally and without static keyword. I have got more than 20 errors after complilation but i understood all the error and convert my pseudo code to proper java code and hence soln got accepted. 

/*
class Solution {
    public int subtractProductAndSum(int n) {

        int result=subtractOfProdAndSum(n);
        System.out.println("aagayaaa---------:" + result);
        return result;
    }
    	private static int sumOfN(int n){
	    int sum=0;
	    while(n!=0){
	        int digit=n%10;
	        sum+=digit;
	        n=n/10;
	      
	    }
	      return sum;
	}
	
	private static int prodOfN(int n){
	     int productVal=1;
	     while(n!=0){
    	     int digit=n%10;
    	     productVal*=digit;
    	     n=n/10;
	    
	}
	 return productVal;

}
   private static int subtractOfProdAndSum(int n){
           int sum= sumOfN(n);
           int productVal=prodOfN(n);
            int result=productVal-sum;
            return result;
        }
}
*/






/*
The one i wrote in online complier:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        
        int result=subtractOfProdAndSum(n);
        System.out.println("aagayaaa---------" + result);
     
	}
	
	private static int sumOfN(int n){
	    int sum=0;
	    while(n!=0){
	        int digit=n%10;
	        sum+=digit;
	        n=n/10;
	      
	    }
	      return sum;
	}
	
	private static int prodOfN(int n){
	     int productVal=1;
	     while(n!=0){
    	     int digit=n%10;
    	     productVal*=digit;
    	     n=n/10;    
	}
	 return productVal;

}
   private static int subtractOfProdAndSum(int n){
           int sum= sumOfN(n);
           int productVal=prodOfN(n);
            int result=productVal-sum;
            return result;
        }
      
}

*/

