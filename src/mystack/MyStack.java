/*****
 * Developed by
 * D. Sarathi Raj
 * 212217105054
 * sarathiraj852000@gmail.com
 */
package mystack;

public class MyStack implements Stack {
	private String data[];
	private int top;

	public MyStack(int s) 
	{
		top=-1;
		data=new String[s];
	}
	@Override
	public void push(String v) throws StackException {
		// TODO Auto-generated method stub
		if(top>=(data.length-1))
		{
			throw new StackException("Stack Full: It is already having "+(top+1)+" elements");
		}
		top=top+1;
		data[top]=v;
	}

	@Override
	public String pop() throws StackException {
		// TODO Auto-generated method stub
		String result;
		if(top<0)
		{
			throw new StackException("Stack is empty");
		}
		result=data[top];
		top=top-1;
		
		return result;
	}

}
