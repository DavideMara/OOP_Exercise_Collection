package src;
import java.util.Random;

class Erbivoro extends Dinosauro {
    private boolean uovoRitrovato;
    private static final String[] SPECIE = {"Brontosauro", "Triceratopo", "Stegosauro", "Diplodoco"};
    private static final Random rand = new Random();

    public Erbivoro() {
        super(SPECIE[rand.nextInt(SPECIE.length)], rand.nextInt());
        this.uovoRitrovato = rand.nextBoolean();
    }
    @Override
    public double costoRestauro() {
        double costo = 500 + (getOssa() * 100);
        if (uovoRitrovato) {
            costo += 500;
        }
        return costo;
    }
}