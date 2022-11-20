/*

(4 + 3) + (4 - 5))
)4 + 3)


 */

package stack.array;

public class BalanceParentesis {
    public static final char APERTURA = '(';
    public static final char CIERRE = ')';

    public static boolean probar(String s) {
        AStackCustom<Character> pila = new AStackCustom<>(s.length());

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == APERTURA) {
                pila.push(s.charAt(i));
            } else if (s.charAt(i) == CIERRE) {
                if (pila.length() == 0) {
                    return false;  // hay un desbalance en el cierre
                }
                pila.pop();
            }
        }

        if (pila.length() > 0) {
            return false;  // hay un desbalance en la apertura
        }

        return true;  // balanceado
    }
    public static void main(String[] args) {
        String[] cadenas = new String[]{
                "((()))()", "()((", "(", "((())()"
        };

        for (String cadena : cadenas) {
            System.out.printf(
                    "Cadena: %s, esta balanceada? %s%n",
                    cadena,
                    probar(cadena)
            );
        }
    }
}
