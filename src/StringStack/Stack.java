/***
 * pavan kalyan reddy
 * npkr.nvrr@outlook.com
 */
package StringStack;

import StringStack.StackException;

public interface Stack {	
	public void push(String v)  throws StackException;
	public String pop() throws StackException;
}