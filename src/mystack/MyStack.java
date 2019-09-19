/****
 *Developed By Avinash Raja
 *Reg n0:212217105009
 *exp n0:6
 *EEE-A
 */
package mystack;

public class MyStack implements stack {
    private String data[];
    private int top;

    public MyStack(int s)
    {
        top=-1;
        data=new String[s];
    }
   
    @Override
    public void push(String v) throws StackException
    {
   
        if(top>=(data.length-1))
        {
            throw new StackException("Stack Full: It is already having "+(top+1)+" elements");
        }
        top=top+1;
        data[top]=v;

    }

    @Override
    public String pop()throws StackException
    {
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