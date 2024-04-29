package tp01;

import java.util.Stack;

public class TestBalanceo {
    public static boolean estaBalanceado(String s) {
        Stack<Character> pila = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }
                char top = pila.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String ejemplo1 = "{( ) [ ( ) ] }";
        String ejemplo2 = "( [ ) ]";

        System.out.println("¿Está balanceado el ejemplo 1? " + estaBalanceado(ejemplo1));
        System.out.println("¿Está balanceado el ejemplo 2? " + estaBalanceado(ejemplo2));
    }
}