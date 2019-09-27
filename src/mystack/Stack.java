/*****
 * Developed by
 * D. Sarathi Raj
 * 212217105054
 * sarathiraj852000@gmail.com
 */
package mystack;

public interface Stack {
	public void push(String value1)  throws StackException;
	public String pop() throws StackException;
}
