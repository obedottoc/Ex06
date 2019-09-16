/*
 * program for Design a Java interface for ADT Stack
 * created @ N.pavithra
 * npavithra1405@gmail.com
 */

package mystack;

public interface Stack {	
	public void push(String v)  throws StackException;
	public String pop() throws StackException;
}
