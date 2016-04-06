/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.NormalStack.LinkedStack;
import Stack.Stack;
import Stack.StackException.*;
/**
 *
 * @ Rohit Sharma
 */
public class LinkedStack implements Stack {

    private NODE top;

    public LinkedStack()
    {
    top=new NODE();

    }
    public void push(Object o)
    {
        NODE temp=new NODE();
        temp.o=o;
        temp.next=top;
        top=temp;
    }

    public Object pop()throws StackUnderFlowException{
    
        if(!isEmpty())
        {
                NODE temp=new NODE();
                temp=top;
                top=top.next;
                return temp.o;
        }
 else
        throw new StackUnderFlowException(top);
    }

    public Boolean isEmpty(){
    
        if(top==null)
                        return true;
        return false;
        
        
    }

    public Boolean isFull(){
    
    return false;
    }

    public Object topElement()
    {
    
    return top.o;
    }
    private class NODE {

        Object o;
        NODE next;

        NODE() {
        this.o = null;
        this.next = null;

    }
        
    }
}
