/*
 * The interface that gives the information about the 
 * type of method.
 * 
 * author@bhaskar karthik
 * 
 * karthikbhaskar2000@gmail.com
 */
package mystack;

public interface Stack {	
	public void push(String v)  throws StackException;
	public String pop() throws StackException;
}
