/*
 * Program to represent interface stack
 * By Faizul
 * faizulsmart10@gmail.com
*/

package mystack;

public interface Stack {    
    public void push(String v)  throws StackException;
    public String pop() throws StackException;
}