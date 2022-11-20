/**
 * Source code example for "A Practical Introduction to Data
 * Structures and Algorithm Analysis, 3rd Edition (Java)"
 * by Clifford A. Shaffer
 * Copyright 2008-2011 by Clifford A. Shaffer
 * Linked list implementation
 * Linked list implementation
 */

/** Linked list implementation */
package list.linked;

import list.EmptyListException;
import list.List;

public class LListCustom<E> implements List<E> {
    protected Link<E> curr;       // Access to current element
    private int cnt;              // Size of list
    Link<E> head;         // Pointer to list header
    Link<E> tail;         // Pointer to last element

    /**
     * Constructors
     */
    LListCustom(int size) {
        this();
    }   // Constructor -- Ignore size

    public LListCustom() {
        curr = tail = head = null;
        cnt = 0;
    }

    /**
     * Remove all elements
     */
    public void clear() {
        head.setNext(null);         // Drop access to links
        curr = tail = head = null;
        cnt = 0;
    }

    /**
     * Insert "it" at current position
     */
    public void insert(E it) {
        Link<E> newNodo = new Link<E>(it, null);

        if (this.isEmpty()) {
            head = tail = newNodo;  // Primer elemento
        } else {
            newNodo.setNext(curr);

            if (head == curr) {
                head = newNodo;  // Nuevo head
            }
        }
        curr = newNodo;  // Cambiar el [curr] actual
        cnt++;
    }

    /**
     * Append "it" to list
     */
    public void append(E it) {
        tail = tail.setNext(new Link<E>(it, null));
        cnt++;
    }

    /**
     * Remove and return next to current element
     */
    public E removeNext() {
        if (curr.next() == null) throw new EmptyListException();

        E it = curr.next().element();         // Remember value

        if (tail == curr.next()) {
            tail = curr; // Removed last
        }

        curr.setNext(curr.next().next());  // Remueve [curr.next()] de la lista
        cnt--;
        return it;
    }

    /**
     * Remove the first element on the list
     **/
    public E removeFirst() {
        if (isEmpty()) throw new EmptyListException();

        E it = head.element();

        if (length() == 1) {
            clear();  // Remover el unico elemento
        } else {
            head = head.next();  // Remueve el primer elemento
        }

        return it;
    }

    /**
     * Remove and return current element
     **/
    public E remove() {
        if (isEmpty()) throw new EmptyListException();

        if (curr == head) {
            return removeFirst();
        }

        prev();
        return removeNext();
    }

    /** Set curr at list start */
    public void moveToStart() {
        curr = head;
    }

    /** Set curr at list end */
    public void moveToEnd() {
        curr = tail;
    }

    /** Move curr one step left; no change if now at front */
    public void prev() {
        if (isEmpty() || curr == head) return;  // No hay elemento previo

        Link<E> temp = head;
        // March down list until we find the previous element
        while (temp.next() != curr) {
            temp = temp.next();
        }
        curr = temp;
    }

    /** Move curr one step right; no change if now at end */
    public void next() {
        if (isEmpty() || curr == tail) return;  // No hay siguiente elemento
        curr = curr.next();
    }

    /** @return List length */
    public int length() {
        return cnt;
    }

    /** @return The position of the current element */
    public int currPos() {
        Link<E> temp = head;
        int i = 0;
        while (temp != curr) {
            temp = temp.next();
            i++;
        }
        return i;
    }

    /** Move down list to "pos" position */
    public void moveToPos(int pos) {
        if (pos < 0 || pos > cnt) throw new IndexOutOfBoundsException();
        curr = head;
        for (int i = 0; i < pos; i++) {
            curr = curr.next();
        }
    }

    /** @return Current element value */
    public E getValue() {
        if (curr == null) return null;
        return curr.element();
    }
// Extra stuff not printed in the book.

    /**
     * Aux functions
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Generate a human-readable representation of this list's contents
     * that looks something like this: < 1 2 3 | 4 5 6 >.  The vertical
     * bar represents the current location of the fence.  This method
     * uses toString() on the individual elements.
     * @return The string representation of this list
     */
    public String toString() {
        StringBuffer out = new StringBuffer((length() + 1) * 4);
        out.append("< ");

        // Save the current position of the list
        Link<E> temp = this.head;

        while (temp != null) {
            if (temp == curr) {
                out.append("| ");
            }
            out.append(temp.element());
            out.append(" ");
            temp = temp.next();
        }
        out.append(">");
        return out.toString();
    }

    public void print() {
        Link<E> aux = head;
        while(aux != null) {
            System.out.print(aux);
            System.out.print(" ");
            aux = aux.next();
        }
        System.out.println();
    }
}
