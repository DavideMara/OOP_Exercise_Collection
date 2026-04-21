package src;

import java.util.Random;

public class Lista {

    Nodo testa = null;

    // Constructor
    public Lista(int n, int m) {
        Random r = new Random();
        testa = null;
        for (int i = 0; i < n; i++) {
            testa = new Nodo(r.nextInt(m + 1), testa);
        }
    }

    // Iterative Method
    public int massimo(int q) {
        int max = Integer.MIN_VALUE;

        for (Nodo e = testa; e != null; e = e.next) {
            if (e.n % q == 0 && e.n > max) {
                max = e.n;
            }
        }
        return max;
    }

    // Recursive Method (Wrapper)
    public int massimoR(int q) {
        return massimoR(testa, q);
    }

    // Recursive Method (Core)
    private int massimoR(Nodo e, int q) {
        if (e == null) {
            return Integer.MIN_VALUE;
        } else {
            int max = massimoR(e.next, q);
            if (e.n % q == 0 && e.n > max) {
                return e.n;
            } else {
                return max;
            }
        }
    }

    public static void main(String[] args) {
        Lista L = new Lista(100, 500);
        System.out.println("Massimo iterativo (divisibile per 2): " + L.massimo(2));
        System.out.println("Massimo ricorsivo (divisibile per 8): " + L.massimoR(8));
    }
}