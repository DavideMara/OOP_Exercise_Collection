public class Figurativo extends Quadro {
    private final boolean dipintoAdOlio;
    public Figurativo(String autore, int anno, boolean dipintoAdOlio){
        super(autore, anno); // triggers
        this.dipintoAdOlio = dipintoAdOlio;
    }

    public double costoRestauro(){
        double costo = 1000;
        if (getAnno() < 1600){
            costo += 1000;
        }
        if (!dipintoAdOlio) {
            costo += 500;
        }


        return costo;
    }

}
