/***
 * to create a program on Stack
 *  Created by lakshmi priya P
 *  priya@gmail.com
 */
package mystack;

public interface Stack {	
	public void push(String v)  throws StackException;
	public String pop() throws StackException;
}
