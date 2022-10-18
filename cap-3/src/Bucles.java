public class Bucles {
    public static void main(String[] args) {
        int[] ns = new int[] {
                10, 100, 1000//, 10_000, 100_000//, 1_000_000
        };

        System.out.println("n         f(n)");
        for (int n: ns) {
            int instrucciones = 0;
            // Aqui va el codigo a revisar [bucle sencillo]
            /////////////////////////////////
            for (int j = 1; j <= Math.pow(2, n); j++) {
                instrucciones++;
            }
            /////////////////////////////////
            System.out.printf("%-10d%-10d%n", n, instrucciones);
        }






    }
}
/*
    f(n) = n/2 => 1/2 * n es O(n)

    c(n) = n => c(n) es O(n)

    O(n)
    for (int i = 1; i <= n; i++) {
        instrucciones++;
    }

    O(n)
    for (int i = 1; i <= n; i += 2) {
        instrucciones++;
    }

    O(log n)
    for (int i = 1; i <= n; i *= 2) {
        instrucciones++;
    }

    O(log n)
    for (int i = N; i >= 1; i /= 2) {
        instrucciones++;
    }

    O(n)
    for (int i = 1; i <= n; i++) {
        instrucciones++;
    }

    for (int j = 1; j <= n; j++) {
        instrucciones++;
    }

    O(n^2)
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            instrucciones++;
        }
    }

    O(n^3)
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n; k++) {
                instrucciones++;
            }
        }
    }

    O(2^n)
    for (int j = 1; j <= Math.pow(2, n); j++) {
        instrucciones++;
    }

    O(n*m) ~ O(n^2)
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            instrucciones++;
        }
    }


    linear search O(n)
    bilinear search O(n) <- ejecuta menos iteraciones pero tiene las mismas instrucciones
    binary search O(log n) <- [requiere que los datos esten ordenados]

    primos v1 es O(n); v7 es O(n^1/2)


 */

// Muy eficientes: constantes, logaritmica, raiz cuadrada
// Aceptable: lineal
// Menos aceptable: n-logaritmica
// Deficiente: polinomicas ( == 2),
// Muy deficientes: polinomicas ( > 2), exponenciales (2^n), factoriales (n!)

