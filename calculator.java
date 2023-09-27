import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int operator ,n1, n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		n2 = sc.nextInt();
		System.out.println(" 1 - Add \n 2 - Substract \n 3 - Multiply \n 4 - Divide ");
		System.out.println("Choose Operator: ");
		operator = sc.nextInt();
		
		
		int Result=0;
		switch (operator) {
		      case 1:
		    	 Result = n1 + n2;
		    	 break;
		    	 
		      case 2:
		    	 Result = n1 - n2;
		    	 break; 
		    	 
		      case 3:
		    	 Result = n1 * n2;
		    	 break;
		    	 
		      case 4:
		    	 Result = n1 / n2;
		    	 break;	
		    	 
		      default:
		      System.out.println("Enter the valid operator: ");
		         break;
		}
		System.out.println("Result is: " +Result);	     
	}	
}


