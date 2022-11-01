import java.util.ArrayList;

public class Nodo<E> {
    E dato;  // atributo

    public Nodo(E dato) {
        // this.dato -> atributo
        // dato -> argumento de la funcion
        this.dato = dato;
    }

    public E getDato() {
        return this.dato;
    }

    @Override
    public String toString() {
        return String.format("Nodo: %s", this.dato);
    }

    public static void main(String[] args) {
        Nodo<Integer> n1 = new Nodo<>(45);
        Nodo<String> n2 = new Nodo("hola");
        Nodo<Character> n3 = new Nodo<>('A');

        int x = n1.getDato();
        String s = n2.getDato();
        char c = n3.getDato();

        ArrayList<Integer> list = new ArrayList<>();
    }
}
