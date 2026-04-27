public class Astratto extends Quadro {
    private final double area;
    public Astratto (String autore, int anno, double area){
        super (autore, anno);
        this.area = area;
    }

    public double costoRestauro(){
        double costo = 500;
        if (getAnno() < 1800){
            costo += 100;
        }
        costo = costo + (area * 0.5);
        return costo;
    }

}
