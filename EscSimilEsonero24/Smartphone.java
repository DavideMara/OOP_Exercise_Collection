import java.util.Random;
public class Smartphone extends Dispositivo {
    private static String marchePossibili[] = {"Samsung", "Apple", "Xiaomi","Redmi", "Sony","Google"};
    static Random rand = new Random();
    private boolean is5G ;
    public Smartphone() {
        super(marchePossibili[rand.nextInt(marchePossibili.length)], rand.nextInt(16)+2010);
        this.is5G = rand.nextBoolean();
    }
    @Override
    public double prezzoScontato() {
        double prezzo = 300;
        if (is5G) {
            prezzo = prezzo + 100;
        }
        if (getAnnoProduzione() > 2022) {
            prezzo = prezzo + 50;
        }
        return prezzo;
    }
}