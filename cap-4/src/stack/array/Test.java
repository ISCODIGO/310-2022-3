package stack.array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        AStack<Integer> pilaEnteros = new AStack<>(5);
        int[] numeros = new int[]{10, 20, 30, 40, 50};

        System.out.println("Orden de push...");
        for(int num : numeros) {
            System.out.println(num);
            pilaEnteros.push(num);
        }

        System.out.println("Orden de pop...");
        while (pilaEnteros.length() > 0) {
            System.out.println(pilaEnteros.pop());
        }
        System.out.println(pilaEnteros);
        System.out.println("Arreglo interno: " + Arrays.toString(pilaEnteros.listArray));
    }
}
