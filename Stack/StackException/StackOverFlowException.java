/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack.StackException;

/**
 *
 * @ Rohit Sharma
 */
public class StackOverFlowException extends StackException{

      public StackOverFlowException(Object top) {

        System.out.println("Stack is Full !! Unable to push");

    }

}
