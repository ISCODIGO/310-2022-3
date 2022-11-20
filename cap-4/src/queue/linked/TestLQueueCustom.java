package queue.linked;

public class TestLQueueCustom {
    public static void main(String[] args) {
        LQueueCustom<Integer> cola = new LQueueCustom<>();
        cola.enqueue(10);  // < 10 >
        cola.enqueue(20);  // < 10 20 >
        cola.dequeue();  // < 20 >
        cola.enqueue(30);  // < 20 30 >
        cola.enqueue(40);  // < 20 30 40 >
        cola.dequeue();  // < 30 40 >
        cola.dequeue();  // < 40 >
        cola.enqueue(50);  // < 40 50 >
        cola.dequeue();  // < 50 >
        cola.enqueue(60);  // < 50 60 >
        cola.enqueue(70);
        cola.enqueue(80);
        cola.enqueue(90);
        cola.enqueue(100);
        cola.dequeue();
        System.out.println(cola);
    }
}
