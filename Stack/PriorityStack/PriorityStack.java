/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.PriorityStack;

import Stack.Heap.ArrayHeap;
import Stack.Heap.Heap;
import Stack.Heap.LinkedHeap;
import Stack.Heap.NODE;
import Stack.Stack;
import Stack.StackException.StackUnderFlowException;

/**
 *
 * @ Rohit Sharma
 */
public class PriorityStack implements Stack {

    Heap h;
    NODE n;

    public PriorityStack(int size) {


        h = new ArrayHeap(size);

    }

    public PriorityStack() {


        h = new LinkedHeap();

    }

    public void push(Object o, int priority) //throws StackOverFlowException
    {
        n = new NODE(o, priority);
        h.maxHeapInsert(n);


    }

    public Object pop() throws StackUnderFlowException {

        if (!isEmpty()) {
            n = (NODE) h.extractMax();
            return n.o;
        } else {
            throw new StackUnderFlowException(n);
        }


    }

    public Boolean isEmpty() {

        if (h.heapSize() == 0) {
            return true;
        }
        return false;
    }

    public Object topElement() {

        return ((NODE) h.heapMaximum()).o;
    }

    public void push(Object o) //throws StackOverFlowException
    {
    }

    public Boolean isFull() {

        return false;
    }
}
