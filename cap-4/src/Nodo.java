public class Nodo<E> {
    E dato;  // atributo
    Nodo siguiente;

    public Nodo(E dato) {
        // this.dato -> atributo
        // dato -> argumento de la funcion
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(Nodo n) {
        this.dato = (E)n.dato;
        this.siguiente = n.siguiente;
    }

    public E getDato() {
        return this.dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }
    public void setSiguiente(Nodo n) {
        this.siguiente = n;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    @Override
    public String toString() {
        return String.format("Nodo: %s", this.dato);
    }

    public static void main(String[] args) {
        Nodo<Integer> n1 = new Nodo<>(45);
        Nodo<String> n2 = new Nodo("hola");
        Nodo<Character> n3 = new Nodo<>('A');

        int x = 10;

        // Referencia / copia superficial
        Nodo copia = n1;
        //copia.setDato(50);

        Nodo clon = new Nodo(n1);
        clon.setDato(60);
        //System.out.println(n1);

        n1.setSiguiente(n2);  // n1 -> n2 ->
        n1.getSiguiente().setDato(123);

        n2.setSiguiente(n3); // n1 > n2 > n3 >
        //System.out.println(n2);

        for(Nodo i = n1; i != null; i = i.getSiguiente()) {
            System.out.println(i);
        }
    }
}
