/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.NormalStack.ArrayStack;

/**
 *
 * @ Rohit Sharma
 */
public class DynamicStack extends ArrayStack {

    public DynamicStack(int size) {
        super(size);
    }

    public void push(Object o) {
        if (isFull()) {
            Object temp[] = new Object[stack.length * 2];
            System.out.println("Stack grown with length" + stack.length);
            for (int i = 0; i < stack.length; i++) 
                temp[i] = stack[i];
            
            stack = temp;
            stack[++top] = o;
        }
        else {
            stack[++top] = o;
        }

    }

    public Object pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return null;
    }
}
