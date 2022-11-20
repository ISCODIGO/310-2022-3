/**
 * Source code example for "A Practical Introduction to Data
 * Structures and Algorithm Analysis, 3rd Edition (Java)"
 * by Clifford A. Shaffer
 * Copyright 2008-2011 by Clifford A. Shaffer
 */
package queue.array;

import queue.Queue;

/** Array-based queue implementation */
class AQueueCustom<E> implements Queue<E> {

    private static final int defaultSize = 10;
    private final int maxSize;         // Maximum size of queue
    private int front;           // Index of front element
    private int rear;            // Index of rear element
    final E[] listArray;       // Array holding queue elements

    /** Constructors */
    AQueueCustom() {
        this(defaultSize);
    }

    @SuppressWarnings("unchecked")
        // For generic array
    AQueueCustom(int size) {
        maxSize = size + 1;          // One extra space is allocated
        rear = 0;
        front = 1;
        listArray = (E[]) new Object[maxSize];  // Create listArray
    }

    /** Reinitialize */
    public void clear() {
        rear = 0;
        front = 1;
    }

    private int nextPos(int pos) {
        return (pos + 1) % maxSize;
    }

    /** Put "it" in queue */
    public void enqueue(E it) {
        assert nextPos(nextPos(rear)) != front : "queue.Queue is full";
        rear = nextPos(rear);  // Circular increment
        listArray[rear] = it;
    }

    /** Remove and return front value */
    public E dequeue() {
        assert length() != 0 : "queue.Queue is empty";
        E it = listArray[front];
        front = nextPos(front); // Circular increment
        return it;
    }

    /** @return Front value */
    public E frontValue() {
        assert length() != 0 : "queue.Queue is empty";
        return listArray[front];
    }

    /** @return queue.Queue size */
    public int length() {
        return ((rear + maxSize) - front + 1) % maxSize;
    }

// Extra stuff not printed in the book.

    /**
     * Generate a human-readable representation of this queue's contents
     * that looks something like this: < 1 2 3 >.
     * This method uses toString() on the individual elements.
     * @return The string representation of this queue
     */
    public String toString() {
        StringBuffer out = new StringBuffer((length() + 1) * 4);
        out.append("< ");

        int pos = front;
        while (pos != nextPos(rear)) {
            out.append(listArray[pos]);
            out.append(" ");
            pos = nextPos(pos);
        }
        out.append(">");
        return out.toString();
    }
}
