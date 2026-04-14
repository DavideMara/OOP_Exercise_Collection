public class Tablet extends Dispositivo {
    private double schermo;

    public Tablet(String marca, int annoProduzione, double schermo) {
        super(marca, annoProduzione);
        this.schermo = schermo;
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