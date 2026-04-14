import java.util.Random;

public class Negozio {
    private Dispositivo[] D;

    public Negozio (int s, int t){
        Random rand = new Random();
        String[] marca = {"Samsung", "Apple", "Xiaomi","Redmi", "Sony","Google"};
        D = new Dispositivo[s+t];
        for (int i=0; i<s; i++){
            D[i] = new Smartphone(marca[rand.nextInt(marca.length)], rand.nextInt(2026 - 2009), rand.nextBoolean());
        }
        for (int i = s; i< s + t; i++){
            D[i] = new Tablet(marca[rand.nextInt(marca.length)], rand.nextInt(2026 - 2009), rand.nextDouble(1-15));
        }

    }

    public double mediaPrezzo
}
