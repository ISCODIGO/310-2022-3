/*

Calcular la secuencia: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

Complejidad de tiempo:
Complejidad de espacio: S(n) es O(1)*

 */

package recursion;

public class Fibonacci {
    static int instrucciones;
    public static long calcular(int n) {
        if (n < 2) {
            Fibonacci.instrucciones++;
            return n;
        }

        Fibonacci.instrucciones++;
        return calcular(n-1) + calcular(n - 2);
    }

    public static long calcularMejorado(int n, long[] memoria) {
        // Caso base
        if (n < 2) {
            instrucciones++;
            return n;
        }

        // En caso de ser la primera recuersion
        instrucciones ++;
        if (memoria == null) {
            memoria = new long[n + 1];
            memoria[0] = 0;
            memoria[1] = 1;
        }

        // Caso recursivo
        if (memoria[n] == 0) {
            memoria[n] = calcularMejorado(n-1, memoria) + calcularMejorado(n - 2, memoria);
        }

        // En este punto es que evitamos calculos previos
        return memoria[n];
    }

    public static void main(String[] args) {
        instrucciones = 0;
        long inicio = System.currentTimeMillis();
        System.out.println(calcular(50));
        long fin = System.currentTimeMillis();

        System.out.printf("Recursiones: %d Tiempo estimado: %d ms", instrucciones, fin-inicio);

    }
}
