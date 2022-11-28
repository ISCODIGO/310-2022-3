/**
 * Source code example for "A Practical Introduction to Data
 * Structures and Algorithm Analysis, 3rd Edition (Java)"
 * by Clifford A. Shaffer
 * Copyright 2008-2011 by Clifford A. Shaffer
 * Singly linked list node
 */

/** Singly linked list node */
package list.linked.ordered;

import java.util.Comparator;

class Link<E extends Comparable<E>> implements Comparable<Link<E>> {
    private E element;            // Value for this node
    private Link<E> next;     // Pointer to next node in list

    // Constructors
    Link(E it, Link<E> nextval) {
        element = it;
        next = nextval;
    }

    Link(Link<E> nextval) {
        next = nextval;
    }

    Link<E> next() {
        return next;
    }  // Return next field

    Link<E> setNext(Link<E> nextval) // Set next field
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

    @Override
    public int compareTo(Link<E> o) {
        return this.element.compareTo(o.element);
    }

    public static void main(String[] args) {
        System.out.println("Comparar String");
        Link<String> nodoS1 = new Link<>("Hola", null);
        Link<String> nodoS2 = new Link<>("Adios", null);
        Link<String> nodoS3 = new Link<>("Hola", null);
        System.out.println(nodoS1.compareTo(nodoS2));  // Positivo es mayor S1 que S2
        System.out.println(nodoS1.compareTo(nodoS3));  // Cero son iguales
        System.out.println(nodoS2.compareTo(nodoS1));  // Negativo es menor S2 que S1

        System.out.println("Comparar Integers");
        Link<Integer> nodo10 = new Link<>(10, null);
        Link<Integer> nodo20 = new Link<>(20, null);
        Link<Integer> nodo10_2 = new Link<>(10, null);
        System.out.println(nodo10.compareTo(nodo10_2));  // Cero 10 = 10
        System.out.println(nodo10.compareTo(nodo20));  // Negativo 10 < 20
        System.out.println(nodo20.compareTo(nodo10));  // Positivo 20 > 10

    }
}
