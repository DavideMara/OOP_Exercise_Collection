import java.util.Random;

public class ListaElementi {
    private Nodo testa;

    public Nodo getTesta() {
        return testa;
    }

    // Costruttore
    public ListaElementi(int n) {
        this.testa = null;
        Random rand = new Random();
        for (int j = 0; j < n; j++) {
            // Using bound 20 to avoid negative numbers and massive strings
            int x = rand.nextInt(20);
            String word = "";

            for (int i = 0; i < x; i++) {
                word = word + "java";
            }

            inserisciInTesta(word);
        }
    }

    // Metodo per inserire elementi
    public void inserisciInTesta(String s) {
        Nodo nuovoNodo = new Nodo(s);
        nuovoNodo.setNext(testa);
        testa = nuovoNodo;
    }

    // Metodo Iterativo
    public int contaOccorrenze(String s) {
        int counter = 0;
        Nodo current = testa;

        while (current != null) {
            if (current.getInfo().length() == s.length()) {
                counter++;
            }
            current = current.getNext();
        }
        return counter;
    }

    // Metodo Ricorsivo
    public int contaOccorrenzeR(String s, Nodo current) {
        int counter = 0;

        if (current == null) {
            return counter;
        }

        if (current.getInfo().length() == s.length()) {
            counter = 1;
        }

        return counter + contaOccorrenzeR(s, current.getNext());
    }

    // Test se tutto funziona
    public static void main() {
        ListaElementi l = new ListaElementi(80);
        System.out.println("Stringhe con lunghezza uguale a 'javajava' (Iterativo): " + l.contaOccorrenze("javajava"));
        System.out.println("Stringhe con lunghezza uguale a 'umbria' (Ricorsivo): " + l.contaOccorrenzeR("umbria", l.getTesta()));
    }
}