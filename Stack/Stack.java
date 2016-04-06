/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import Stack.StackException.*;

/**
 *
 * @author db2admin
 */
 
 /* This change is done to test git sync*/
 
public interface Stack {

    void push(Object o) throws StackOverFlowException;

    Object pop() throws StackUnderFlowException;
    

    Boolean isEmpty();

    Boolean isFull();

    Object topElement();
}
