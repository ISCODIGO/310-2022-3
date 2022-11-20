package stack.linked;

public class TestLStackCustom {
    public static void main(String[] args) {
        LStackCustom<Integer> pilaEntero = new LStackCustom<>();
        try {
            pilaEntero.push(10);
            pilaEntero.push(20);
            pilaEntero.push(30);
            pilaEntero.push(40);
            pilaEntero.pop();
            pilaEntero.pop();
            //pilaEntero.pop();
            //pilaEntero.pop();  // genera  una excepcion: Pila vacia
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(pilaEntero);
    }
}
