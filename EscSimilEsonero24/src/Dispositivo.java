public abstract class Dispositivo {
    private String marca;
    private int annoProduzione;
    public Dispositivo(String marcaDisp, int annoDisp) {
        this.marca = marcaDisp;
        this.annoProduzione = annoDisp;
    }

    public void aggiornaAnno(int nuovoAnno) {
        if (nuovoAnno > 2010) {
            this.annoProduzione = nuovoAnno;
        }
    }

    public String getMarca() {
        return marca;
    }
    public int getAnnoProduzione() {
        return annoProduzione;
    }
    public abstract double prezzoScontato();
}