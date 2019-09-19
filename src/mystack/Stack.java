package mystack;
/***
* 
* @author  D.Rohith
* arohitharohi@gmail.com
*
*/  public interface Stack {	
	  public void push(String v)  throws StackException;
	  public String pop() throws StackException;
}
