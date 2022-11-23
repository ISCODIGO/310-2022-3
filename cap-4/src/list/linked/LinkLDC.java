/**
 * Source code example for "A Practical Introduction to Data
 * Structures and Algorithm Analysis, 3rd Edition (Java)"
 * by Clifford A. Shaffer
 * Copyright 2008-2011 by Clifford A. Shaffer
 * Singly linked list node
 */

/** Singly linked list node */
package list.linked;

class LinkLDC<E> {
    private E element;            // Value for this node
    private LinkLDC<E> next;     // Pointer to next node in list
    private LinkLDC<E> prev;

    // Constructors
    LinkLDC(E it, LinkLDC<E> prev, LinkLDC<E> nextval) {
        element = it;
        prev = prev;
        next = nextval;
    }

    LinkLDC(LinkLDC<E> preval, LinkLDC<E> nextval) {

        prev = preval;
        next = nextval;
    }

    LinkLDC<E> next() {
        return next;
    }  // Return next field

    LinkLDC<E> prev() { return  prev; }

    LinkLDC<E> setNext(LinkLDC<E> nextval) // Set next field
    {
        return next = nextval;
    }     // Return element field

    E element() {
        return element;
    }  // Set element field

    E setElement(E it) {
        return element = it;
    }

    @Override
    public String toString() {
        if (this.element == null) {
            return "null";
        }
        return this.element.toString();
    }
}
