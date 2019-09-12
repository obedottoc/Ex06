package mystack;

public interface Stack
{	
	public void push(int v)  throws StackException;
	public int pop() throws StackException;
}