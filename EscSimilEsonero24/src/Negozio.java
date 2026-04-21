public class Negozio {
    private Dispositivo[] D;
    public Negozio (int s, int t){
        D = new Dispositivo[s+t];
        for (int i=0; i<s; i++){
            D[i] = new Smartphone();
        }
        for (int i = s; i< s + t; i++){
            D[i] = new Tablet();
        }
    }
    public double mediaPrezzo(String m){
        double somma = 0;
        int contatore = 0;
        for (Dispositivo dispositivo : D){
            if (dispositivo.getMarca().equals(m)){
                somma += dispositivo.prezzoScontato();
                contatore++;
            }
        }
        if (contatore > 0){
            return somma /contatore;
        } else {
            return 0;
        }
    }
    // Function to test that everything works
    public static void main(String[] args) {
        Negozio test = new Negozio(6, 4);
        double media = test.mediaPrezzo("Samsung");
        System.out.println("La media dei costi per è : " + media);
    }
}
