package stack.linked;

import stack.Stack;
import list.linked.LListCustom;

public class LStackCustom<E> implements Stack<E> {
    LListCustom<E> data;

    public LStackCustom() {
        data = new LListCustom<>();
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public void push(E it) {
        data.moveToStart();
        data.insert(it);
    }

    @Override
    public E pop() {
        if (data.length() == 0) {
            throw new RuntimeException("Pila vacia");
        }
        data.moveToStart();
        return data.removeFirst();  // Esta funcion es O(1)
    }

    @Override
    public E topValue() {
        if (data.length() == 0) {
            throw new RuntimeException("Pila vacia");
        }
        data.moveToStart();
        return data.getValue();
    }

    @Override
    public int length() {
        return data.length();
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    public void print() {
        this.data.print();
    }
}
