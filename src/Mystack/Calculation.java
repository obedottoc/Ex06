package Mystack;
import java.util.*;

public class Calculation {

    public static void main(String[] args) {
        String value1;
        int option;
        Stack st;
       
        Scanner sc=new Scanner(System.in);
        st=new Mystack(5);
       
        while(true)
        {
            try
            {
                System.out.println("1. Push a String");
                System.out.println("2. Pop a String");
                System.out.println("3. Exit");
                System.out.print("Enter your choice:");
           
                option=sc.nextInt();
                switch(option)
                {
                case 1:
                    System.out.print("Enter a String:");
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

