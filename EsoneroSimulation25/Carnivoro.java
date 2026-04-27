import java.util.Random;

class Carnivoro extends Dinosauro {

    private int numeroDenti;
    private static final String[] SPECIE = {"T-Rex", "Velociraptor", "Spinosauro", "Allosauro"};
    private static final Random rand = new Random();

    public Carnivoro() {
        super(SPECIE[rand.nextInt(SPECIE.length)], rand.nextInt(50) + 1);
        this.numeroDenti = rand.nextInt(30) + 1;
    }

    public int getNumeroDenti() {
        return numeroDenti;
    }

    @Override
    public double costoRestauro() {
        return 700 + (getOssa() * 150) + (getNumeroDenti() * 30);
    }
}
