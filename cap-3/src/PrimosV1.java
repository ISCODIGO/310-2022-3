public class PrimosV1 {
    static int instruccion;

    public static boolean calcular(int n) {
        instruccion = 0;

        /*
            Instrucciones sencillas (fuera del for)
            ---------------------------------------
            1. return (cuenta si es dentro o no del for)
            2. n - 1
            3. asignar n - 1
            4. int i = 2
         */
        instruccion += 4;

        int limite = n - 1;  // no incluimos a n como divisor

        for (int i = 2; i <= limite; i++) {
            /*
                Intrucciones complejas (dentro del for)
                1. comparacion i <= limite
                2. incremento i++
                3. comprobar si hay divisor n % i == 0
             */
            instruccion += 3;

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