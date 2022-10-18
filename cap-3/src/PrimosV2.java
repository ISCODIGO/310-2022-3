public class PrimosV2 {
    static int instruccion;

    public static boolean calcular(int n) {
        instruccion = 0;

        /*
            Instrucciones sencillas (fuera del for)
            ---------------------------------------
            1. return (cuenta si es dentro o no del for)
            2. n % 2
            3. comparar si es igual a cero
            4. Math.sqrt
            5. (int)
            6. declarar limite
            7. asignar limite
            8. declarar i
            9. asignar i
         */
        instruccion += 9;

        if (n % 2 == 0) {
            return (n == 2);  // 2 es primo, otro par no lo es
        }

        int limite = (int) Math.sqrt(n);  // sqrt(n) <= a n/2

        for (int i = 3; i <= limite; i += 2) {
            instruccion += 4;
            /*
                Intrucciones complejas (dentro del for)
                1. i <= limite
                2. i += 2
                3. n % i
                4. comparar si es igual a cero
             */

            if (n % i == 0) {
                return false;
            }
        }

        return true;  // si no hay un divisor, es primo
    }

    public static void main(String[] args) {
        assert calcular(2) : "2 es primo";
        System.out.printf("Para n=2 instruc: %d%n", instruccion);
        assert !calcular(4) : "4 no es primo";
        System.out.printf("Para n=4 instruc: %d%n", instruccion);
        assert !calcular(48) : "48 no es primo";
        System.out.printf("Para n=48 instruc: %d%n", instruccion);
        assert calcular(101) : "101 es primo";
        System.out.printf("Para n=101 instruc: %d%n", instruccion);
        assert calcular(73389461) : "73389461 es primo";
        System.out.printf("Para n=73389461 instruc: %d%n", instruccion);
    }
}