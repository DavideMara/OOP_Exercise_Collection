import java.util.Random;
// --- MUSEO ---
public class Museo {
    private Dinosauro[] V;

    public Museo(int n, int m) {
        V = new Dinosauro[n + m];
        for (int i = 0; i < n; i++) {
            V[i] = new Erbivoro();
        }
        for (int i = 0; i < m; i++) {
            V[n + i] = new Carnivoro();
        }
    }

    public double mediaCosti(String specie) {
        double somma = 0;
        int contatore = 0;

        for (int i = 0; i < V.length; i++) {
            if (V[i].getSpecie().equals(specie)) {
                somma += V[i].costoRestauro();
                contatore++;
            }
        }

        if (contatore > 0) {
            return somma / contatore;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Museo museo = new Museo(10, 10);

        String specieTest = "Brontosauro";
        double media = museo.mediaCosti(specieTest);

        System.out.println("Risultati del Museo:");
        System.out.println("Specie cercata: " + specieTest);

        if (media > 0) {
            System.out.println("La media dei costi di restauro è: €" + media);
        } else {
            System.out.println("Nessun dinosauro di questa specie trovato nel museo. Costo: €" + media);
        }
    }
}