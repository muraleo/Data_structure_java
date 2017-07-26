/**
* A collection of objects that are inserted and removed according to the last-in
* first-out principle. Although similar in purpose, this interface differs from
* java.util.Stack.
*
* @author Michael T. Goodrich
* @author Roberto Tamassia
* @author Michael H. Goldwasser
*/

public interface Stack<E>{

/**
*Return number of the elements in stack
*@return number of the elements in stack
*/
int size();

/**
*Test whether stack is empty
*@return true when stack is empty, false otherwise
*/
boolean isEmpty();

/**
*Insert a element at the top of stack
*@param e the element insert into stack
*/
void push();

/**
*Returns, but not delete, the top element of the stack
*@return top element
*/
E top();

/**
*Return and remove the top element of stack
*@return top element of stack( return null if stack is empty)
*/
E pop();
}