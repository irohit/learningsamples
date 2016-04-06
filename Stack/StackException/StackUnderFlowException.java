/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack.StackException;

/**
 *
 * @ Rohit Sharma
 */
public class StackUnderFlowException extends StackException{

    public StackUnderFlowException(Object top) {

    System.out.println("Sorry Unable to pop !!! Stack is Empty");
    }



}
