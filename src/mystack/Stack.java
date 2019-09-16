/***
 * to create a program on Stack
 *  Created by Rositha V
 *  rosithav1@gmail.com
 */
package mystack;

public interface Stack {	
	public void push(String v)  throws StackException;
	public String pop() throws StackException;
}
