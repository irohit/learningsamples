/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.Heap;

/**
 *
 * @author db2admin
 */
public interface Heap {

    public final String ArrayHeap = "ArrayHeap";
    public final String LinkedHeap = "LinkedHeap";

    public int heapSize();

    public void maxHeapify(int i);

   public void heapIncreaseKey(int i,NODE n);

    public void maxHeapInsert(NODE o);

    public NODE extractMax();

    public NODE heapMaximum();
}
