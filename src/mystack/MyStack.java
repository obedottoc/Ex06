package mystack;

public class MyStack implements Stack {
	private int data[];
	private int top;

	public MyStack(int s) 
	{
		top=-1;
		data=new int[s];
	}
	
	@Override
	public void push(int v) throws StackException
	{
	
		if(top>=(data.length-1))
		{
			throw new StackException("Stack Full: It is already having "+(top+1)+" elements");
		}
		top=top+1;
		data[top]=v;

	}

	@Override
	public int pop()throws StackException 
	{
		int result;
		if(top<0)
		{
			throw new StackException("Stack is empty");
		}
		result=data[top];
		top=top-1;
		
		return result;
	}

}