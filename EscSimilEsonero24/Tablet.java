import java.util.Random;

public class Tablet extends Dispositivo {
    private int  schermo;
    private static String marchePossibili[] = {"Samsung", "Apple", "Xiaomi","Redmi", "Sony","Google"};
    static Random rand = new Random();

    public Tablet() {
        super(marchePossibili[rand.nextInt(marchePossibili.length)], rand.nextInt(16)+2010);
        this.schermo = rand.nextInt(8)+7;
    }

    @Override
    public double prezzoScontato() {
        double prezzo = 250;
        prezzo = prezzo + (schermo * 15);
        if (getAnnoProduzione() < 2020) {
            prezzo = prezzo - 50;
        }
        return prezzo;
    }
}