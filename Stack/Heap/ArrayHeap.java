/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.Heap;

/**
 *
 * @ Rohit Sharma
 */
public class ArrayHeap implements Heap {

    private NODE stack[] = new NODE[50];
    private int heapsize = 0;

    public ArrayHeap(int Length) {

        heapsize = Length - 1;

    }

    public int heapSize() {


        return heapsize;
    }

    public void maxHeapify(int i) {

        int l = left(i), large;
        int r = right(i);
        if (l <= heapSize() && stack[l].getPriority() > stack[i].getPriority()) {
            large = l;

        } else {
            large = r;

        }
        if (r <= heapSize() && stack[r].getPriority() > stack[large].getPriority()) {
            large = r;

        }
        if (large != i) {
            NODE temp = stack[i];
            stack[i] = stack[large];
            stack[large] = temp;
            maxHeapify(large);
        }

    }

    public void heapIncreaseKey(int i, NODE n) {
        if (n.getPriority() < stack[i].getPriority()) {
            System.out.println("new key is smaller");
        }
        stack[i] = n;
        while (i > 0 && stack[parent(i)].getPriority() < stack[i].getPriority()) {

            NODE temp = stack[i];
            stack[i] = stack[parent(i)];
            stack[parent(i)] = temp;
            i = parent(i);
        }

    }

    public void maxHeapInsert(NODE o) {

        heapsize = heapSize() + 1;


        stack[heapSize()] = new NODE(null, -1);
        heapIncreaseKey(heapSize(), o);

    }

    public NODE extractMax() {
        if (heapSize() < 1) {

            System.out.println("Underflow");
            return null;//TODO heapunderflow
        }
        NODE max = stack[0];
        stack[0] = stack[heapSize()];
        heapsize = heapSize() - 1;
        maxHeapify(0);
        return max;
    }

    public NODE heapMaximum() {

        return stack[0];

    }

    int parent(int i) {

        return (int) i / 2;
    }

    int left(int i) {
        return 2 * i;
    }

    int right(int i) {
        return 2 * i + 1;
    }
}
