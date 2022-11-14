package list.linked.AList;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        AList<Integer> enteros = new AList<Integer>(5);
        enteros.insert(10);  // < | 10 >
        enteros.insert(20);  // < | 20 10 >
        enteros.insert(30);  // < | 30 20 10 >
        enteros.moveToEnd();  // < 30 20 | 10 >
        enteros.insert(40);  // < 30 20 | 40 10 >
        enteros.prev();  // < 30 | 20 40 10>
        enteros.moveToStart();  // < | 30 20 40 10 >
        //enteros.insert(50);  // < | 50 30 20 40 10 >
        //enteros.moveToEnd();  // < 50 30 20 40 | 10 >
        //System.out.println(enteros.getValue());
        enteros.append(100);  // < | 30 20 40 10 100 >
        enteros.remove();  // < | 20 40 10 100 >
        enteros.moveToPos(2);  // < 20 40 | 10 100 >
        enteros.remove();  // < 20 40 | 100 >
        enteros.remove();  // < 20 40 | >

        System.out.println(enteros);
        System.out.println(Arrays.toString(enteros.listArray));
    }
}
