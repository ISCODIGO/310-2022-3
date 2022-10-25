package recursion;

public class TestFibo {
    public static void main(String[] args) {
        Fibonacci.instrucciones = 0;
        int n = 0;
        assert Fibonacci.calcular(n) == 0;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 1;
        assert Fibonacci.calcular(n) == 1;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 2;
        assert Fibonacci.calcular(n) == 1;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 5;
        assert Fibonacci.calcular(n) == 5;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 9;
        assert Fibonacci.calcular(n) == 34;
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 12;
        Fibonacci.calcular(n);
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 20;
        Fibonacci.calcular(n);
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);

        Fibonacci.instrucciones = 0;
        n = 30;
        Fibonacci.calcular(n);
        System.out.printf("N -> %10d Rec: %10d%n", n, Fibonacci.instrucciones);
    }
}
