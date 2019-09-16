/***
 * pavan kalyan reddy
 * npkr.nvrr@outlook.com
 */
package StringStack;
import java.util.*;

public class Calculation {

	public static void main(String[] args) {
		String str;
		int option;
		Stack st;
		
		Scanner sc=new Scanner(System.in);
		st=new MyStack(5);
		
		while(true)
		{
			try
			{
				System.out.println("1. Push a string");
				System.out.println("2. Pop a string");
				System.out.println("3. Exit");
				System.out.print("Enter your choice:");
			
				option=sc.nextInt();
				switch(option)
				{
				case 1:
					System.out.print("Enter a string:");
					str=sc.next();
					st.push(str);
					System.out.println("Push completed.");
					break;
				case 2:
					str=st.pop();
					System.out.printf("Stack top String is=%s\n",str);
					break;	
				default:
					System.out.print("Please enter a valid number !!!");
				}
				
				if(option==3)
				{		
					System.out.print("Thankyou for using stringstack application !!!");
					break;
				}
			
			}catch(StackException e1)
			{
				System.out.println("Error:"+e1.getMessage());
			}catch(NumberFormatException e2)
			{
				System.out.println("Error:"+e2.getMessage());
			}
			}
		}		
}