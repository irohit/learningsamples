/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.NormalStack.ArrayStack;
import Stack.Stack;
import Stack.StackException.*;
/**
 *
 * @ Rohit Sharma
 */
public abstract class ArrayStack implements Stack {

   Object stack[];
   int top;

    public ArrayStack(int size) {
        stack = new Object[size];
        top = -1;

    }

    public abstract void push(Object o)throws StackOverFlowException;

    public abstract Object pop() throws StackUnderFlowException;

    public Object topElement() {
        return stack[top];
    }

    public Boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public Boolean isFull() {
        if (top == stack.length - 1) {
            return true;
        }
        return false;
    }
}
