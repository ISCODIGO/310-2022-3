package list.linked;

import list.List;

public class TestLListCustom {

    static void test(List ls, int esperado) {
        assert ls.getValue().equals(esperado): String.format("Esperado %d obtenido %d", esperado, ls.getValue());
    }

    public static void main(String[] args) {
        LListCustom linked = new LListCustom();
        linked.append(10);
        linked.append(20);
        linked.append(30);
        linked.append(40);

        linked.moveToStart();
        test(linked, 10);  // ir al primero

        linked.next();
        test(linked, 20);  // prueba de next

        linked.prev();
        //linked.prev();  // probar que no pueda retroceder mas alla del primero
        test(linked, 10);

        linked.moveToEnd();
        test(linked, 40);  // ir al ultimo

        linked.prev();
        test(linked, 30);  // ir al penultimo

        linked.next();
        //linked.next();  // probar que no puede avanzar mas alla del ultimo
        test(linked, 40);

        System.out.println(linked);
        linked.print();
    }
}
