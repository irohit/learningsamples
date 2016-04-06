/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.Heap;

/**
 *
 * @ Rohit Sharma
 */
public class NODE {

    public Object o;
    private int priority;

    public NODE(Object o, int priority) {
        this.o = o;
        this.priority = priority;
    }

    public String toString() {

        return "Priority=" + priority;

    }
    public int getPriority()
    {
    return this.priority;
    }
}
