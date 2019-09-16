/***
 * to create a program on Stack
 *  Created by Rositha V
 *  rosithav1@gmail.com
 */
package mystack;
import java.util.*;

public class Calculation {

	public static void main(String[] args) {
		String value1;
		int option;
		MyStack st;
		
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
					value1=sc.next();
					st.push(value1);
					System.out.println("Push completed.");
					break;
				case 2:
					value1=st.pop();
					System.out.printf("Stack top value=%s\n",value1);
					break;	
				default:
					System.out.print("Please enter a valid number !!!");
				}
				
				if(option==3)
				{		
					System.out.print("Thankyou for using stack application !!!");
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

