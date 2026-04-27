import java.util.Random;

// --- BASE CLASS ---
abstract class Dinosauro {
    private String specie;
    private int ossa;

    public Dinosauro(String specie, int ossa) {
        this.specie = specie;
        this.ossa = ossa;
    }

    public String getSpecie() {
        return specie;
    }

    public int getOssa() {
        return ossa;
    }

    // Modifies the value only if the new value is greater
    public void ritrovamento(int nuoveOssa) {
        if (nuoveOssa > this.ossa) {
            this.ossa = nuoveOssa;
        }
    }

    public abstract double costoRestauro();
}