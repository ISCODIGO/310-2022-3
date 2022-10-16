package cap3;

public class Bucles {
    public static void main(String[] args) {
        int x = 1_000_000;

        for (int i = 1; i <= x; i ++) {
            for (int j = 1; j <= x; j++) {
                //System.out.println("" + i + ", " + j);  // <----
            }
        }



        // T(n) = T1 * T2 = 3n * 3n + 2 = 9n^2 + 2
    }
}
// i = 1
// j = 1, 2, 3, 4, 5

// i = 2
// j = 1, 2, 3, 4, 5

// Muy eficientes: constantes, logaritmica, raiz cuadrada
// Aceptable: lineal
// Menos aceptable: n-logaritmica
// Deficiente: polinomicas ( == 2),
// Muy deficientes: polinomicas ( > 2), exponenciales (2^n), factoriales (n!)

