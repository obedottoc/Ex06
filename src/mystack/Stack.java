/****
 * Program for stackexception


 * @author RAJAMANICKAM A
 *  rajapandidevi1997@gmail.com
 */
package mystack;

public interface Stack {	
	public void push(String v)  throws StackException;
	public String pop() throws StackException;
}
