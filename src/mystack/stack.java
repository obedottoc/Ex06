package mystack;

public interface stack {   
    public void push(String v)  throws StackException;
    public String pop() throws StackException;
}