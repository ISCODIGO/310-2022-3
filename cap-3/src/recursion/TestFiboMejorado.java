package recursion;

public class TestFiboMejorado {
    public static void main(String[] args) {
        Fibonacci.instrucciones = 0;
        int n = 0;
        assert Fibonacci.calcularMejorado(n, null) == 0;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 1;
        assert Fibonacci.calcularMejorado(n, null) == 1;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 2;
        assert Fibonacci.calcularMejorado(n, null) == 1;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 5;
        assert Fibonacci.calcularMejorado(n, null) == 5;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 9;
        assert Fibonacci.calcularMejorado(n, null) == 34;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 12;
        Fibonacci.calcularMejorado(n, null);
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 20;
        Fibonacci.calcularMejorado(n, null);
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 30;
        Fibonacci.calcularMejorado(n, null);
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);
    }
}
