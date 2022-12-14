/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
*/
package stack.array;

import stack.Stack;

/** Array-based stack implementation */
class AStackCustom<E> implements Stack<E> {

  private static final int defaultSize = 10;

  private int maxSize;            // Maximum size of stack
  private int top;                // Index for top Object
  E [] listArray;         // Array holding stack

  /** Constructors */
  AStackCustom() { this(defaultSize); }
  @SuppressWarnings("unchecked") // Generic array allocation
  AStackCustom(int size) {
    maxSize = size;
    top = -1;
    listArray = (E[])new Object[size];   // Create listArray
  }

  /** Reinitialize stack */
  public void clear() { top = -1; }

  /** Push "it" onto stack */
  public void push(E it) {
    assert top != maxSize : "Stack is full";
    listArray[++top] = it;
  }

  /** Remove and top element */
  public E pop() {
    assert top != -1 : "Stack is empty";
    return listArray[top--];
  }

  /** @return Top element */
  public E topValue() {
    assert top != -1 : "Stack is empty";
    return listArray[top];
  }

  /** @return Stack size */
  public int length() { return top + 1; }

// Extra stuff not printed in the book.

  /**
   * Generate a human-readable representation of this stack's contents
   * that looks something like this: < 1 2 3 >.
   * This method uses toString() on the individual elements.
   * @return The string representation of this stack
   */
  public String toString()
  {
    StringBuffer out = new StringBuffer((length() + 1) * 4);
    out.append("< ");
    for (int i = top; i >= 0; i--) {
      out.append(listArray[i]);
      out.append(" ");
    }
    out.append(">");
    return out.toString();
  }
}
