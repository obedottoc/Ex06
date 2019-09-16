package mystack;

public interface Stack {
	public void push(String value1)  throws StackException;
	public String pop() throws StackException;
}
