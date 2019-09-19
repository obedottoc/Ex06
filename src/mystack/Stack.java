/*created by: G. Sanjai Kumar
 * email: gsanjaik@gmail.com
 */
package mystack;

public interface Stack {	
	public void push(String v)  throws StackException;
	public String pop() throws StackException;
}
