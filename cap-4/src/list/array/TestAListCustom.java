package list.array;

import list.List;

public class TestAListCustom {
    static void test(List ls, int esperado) {
        assert ls.getValue().equals(esperado): String.format("Esperado %d obtenido %d", esperado, ls.getValue());
    }

    public static void main(String[] args) {
        AListCustom lista = new AListCustom();
        lista.append(10);
        lista.append(20);
        lista.append(30);
        lista.append(40);

        lista.moveToStart();
        test(lista, 10);  // ir al primero

        lista.next();
        test(lista, 20);  // prueba de next

        lista.prev();
        //lista.prev();  // al quitar el comentario debe generar un AssertionError
        test(lista, 10);  // probar que no pueda retroceder mas alla del primero

        lista.moveToEnd();
        test(lista, 40);  // ir al ultimo

        lista.prev();
        test(lista, 30);  // ir al penultimo

        lista.next();
        //lista.next();  // al quitar el comentario debe generar un AssertionError
        test(lista, 40);  // probar que no puede avanzar mas alla del ultimo

        System.out.println(lista);
        lista.print();
    }
}
