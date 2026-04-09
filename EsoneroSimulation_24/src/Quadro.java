import java.util.Scanner;

public class Quadro {
    private final String autore;
    private int annoRealizzazione;

    public Quadro(String autorePresunto, int annoPresunto) {
        autore = autorePresunto;
        annoRealizzazione = annoPresunto;
    }

    public String getAutore(){
        return autore;
    }

    public int getAnno(){
        return annoRealizzazione;
    }

    public static void main (String[] args){
        // declaration and instance
        Quadro q = new Quadro("Picasso", 1937);
        System.out.println("This is by "+ q.getAutore() + " , made in the year " + q.getAnno());

    }

    public double costoRestauro(){
        return 0;
    }

    public void attribuzione(int annoRealizzazione){
        if (annoRealizzazione > 0 ){
            this.annoRealizzazione = annoRealizzazione;
        }
    }
}
