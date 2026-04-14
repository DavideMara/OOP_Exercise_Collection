public class Smartphone extends Dispositivo {
    private boolean is5G;
    public Smartphone(String marca, int annoProduzione, boolean is5G) {
        super(marca, annoProduzione);
        this.is5G = is5G;
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