package queue.linked;

import queue.Queue;
import list.linked.LListCustom;

public class LQueueCustom<E>  implements Queue<E> {
    private LListCustom lista;

    public LQueueCustom() {
        lista = new LListCustom();
    }

    @Override
    public void clear() {
        lista.clear();
    }

    @Override
    public void enqueue(E it) {
        lista.append(it);
    }

    @Override
    public E dequeue() {
        lista.moveToStart();
        return (E)lista.remove();
    }

    @Override
    public E frontValue() {
        lista.moveToEnd();
        return (E) lista.getValue();
    }

    @Override
    public int length() {
        return lista.length();
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
