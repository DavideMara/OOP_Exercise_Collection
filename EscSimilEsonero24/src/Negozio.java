import java.util.Random;

public class Negozio {
    private Dispositivo[] D;

    public Negozio (int s, int t){
        Random rand = new Random();
        String[] marca = {"Samsung", "Apple", "Xiaomi","Redmi", "Sony","Google"};
        D = new Dispositivo[s+t];
        for (int i=0; i<s; i++){
            D[i] = new Smartphone(marca[rand.nextInt(marca.length)], rand.nextInt(16)+2010, rand.nextBoolean());
        }
        for (int i = s; i< s + t; i++){
            D[i] = new Tablet(marca[rand.nextInt(marca.length)], rand.nextInt(16)+2010, 7.0 +(14.0 - 7.0) * rand.nextDouble());
        }
    }
    public double mediaPrezzo(String m){
        double somma = 0;
        int contatore = 0;
        for (Dispositivo dispositivo : D){
            if (dispositivo.getMarca().equals(m)){
                somma += dispositivo.prezzoScontato();
                contatore++;
            }
        }
        if (contatore > 0){
            return somma /contatore;
        } else {
            return 0;
        }

    }
    // Function to test that everything works
    public static void main(String[] args) {
        Negozio test = new Negozio(6, 4);
        double media = test.mediaPrezzo("Samsung");
        System.out.println("La media dei costi per è : " + media);
    }



}
