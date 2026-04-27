import java.util.Random;

public class Museo {
    private final Quadro[] V;

    public Museo (int n, int m){
        Random rand = new Random();
        String[] autori = {"Van Gogh", "Da Vinci","Michelangelo", "Pollok"};
        V = new Quadro[n + m];
        for (int i = 0; i < n; i++){
            V[i] = new Figurativo( autori[rand.nextInt(autori.length)], rand.nextInt(2024), rand.nextBoolean());
        }
        for (int i = n; i < n + m; i++){
            V[i]= new Astratto( autori[rand.nextInt(autori.length)],rand.nextInt(2024),rand.nextInt(100));
        }

    }
    public double mediaCostiAutore(String nomeAutore) {
        double sommaCosti = 0;
        int contatore = 0;
        for (Quadro quadro : V) {
            if (quadro.getAutore().equals(nomeAutore)) {
                contatore++;
                sommaCosti = sommaCosti + quadro.costoRestauro();
            }
        }
        if (contatore > 0) {
            return sommaCosti / contatore;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // test : Building a new Museo and then calculating the average Price for the Author
        Museo ilMioMuseo = new Museo(3, 2);
        double mediaDaVinci = ilMioMuseo.mediaCostiAutore("Da Vinci");
        System.out.println("La media dei costi di restauro per Da Vinci è: €" + mediaDaVinci);
    }


}
