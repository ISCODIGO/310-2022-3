package list.linked;

public class Test {
    public static void main(String[] args) {
        LList linked = new LList();
        linked.insert(30);
        linked.insert(40);
        linked.next();
        System.out.println(linked);
        linked.print();
    }
}
