/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.NormalStack.ArrayStack;
import Stack.StackException.*;
/**
 *
 * @ Rohit Sharma
 */
public class FixedStack extends ArrayStack {

    public FixedStack(int size) {
        super(size);
    }

    public void push(Object o) throws StackOverFlowException {
        if (!isFull()) {
            stack[++top] = o;
        }
 else
        throw new StackOverFlowException(top);
    }

    public Object pop() throws StackUnderFlowException{
        if (!isEmpty()) {
            return stack[top--];
        }
        else 
            throw new StackUnderFlowException(top);
    }
}
