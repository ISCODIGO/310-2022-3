/**
 * Source code example for "A Practical Introduction to Data
 * Structures and Algorithm Analysis, 3rd Edition (Java)"
 * by Clifford A. Shaffer
 * Copyright 2008-2011 by Clifford A. Shaffer
 * List ADT
 */

/** List ADT */
package list;

public interface List<E> {
    /** Remove all contents from the list, so it is once again
     empty. Client is responsible for reclaiming storage
     used by the list elements. */
    void clear();

    /** Insert an element at the current location. The client
     must ensure that the list's capacity is not exceeded.
     @param item The element to be inserted. */
    void insert(E item);

    /** Append an element at the end of the list. The client
     must ensure that the list's capacity is not exceeded.
     @param item The element to be appended. */
    void append(E item);

    /** Remove and return the current element.
     @return The element that was removed. */
    E remove();

    /** Set the current position to the start of the list */
    void moveToStart();

    /** Set the current position to the end of the list */
    void moveToEnd();

    /** Move the current position one step left. No change
     if already at beginning. */
    void prev();

    /** Move the current position one step right. No change
     if already at end. */
    void next();

    /** @return The number of elements in the list. */
    int length();

    /** @return The position of the current element. */
    int currPos();

    /** Set current position.
     @param pos The position to make current. */
    void moveToPos(int pos);

    /** @return The current element. */
    E getValue();
}
