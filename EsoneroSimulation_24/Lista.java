import java.util.Random;
public class Lista {
    private Nodo testa;
    public Nodo getTesta(){
        return testa;
    }

    public Lista(int n) {
        this.testa = null;
        Random rand = new Random();
        for (int j = 0; j < n ; j++){
            int ripetizioni = rand.nextInt(10)+1;
            String parola = "";
            for (int i = 0; i < ripetizioni; i++){
                parola = parola +"ciao";
            }
            inserisciInTesta(parola);
        }
    }
    public void inserisciInTesta (String s){
        Nodo nuovoNodo = new Nodo(s);
        nuovoNodo.setNext(testa);
        testa = nuovoNodo;
    }

    public boolean cerca(String s){
        boolean check = false;
        Nodo current =  testa;
        while (current != null){
            if (current.getInfo().length() == s.length()){
                check = true;
            }
            current = current.getNext();
        }
        return check;
    }

    public boolean cercaR(String s, Nodo current){
        if (current == null){
            return false;
        } else if (current.getInfo().length() == s.length()){
            return true;
        }
        return cercaR(s, current.getNext());
    }


    public static void main(){
        Lista l = new Lista(100);
        System.out.println("Trvoato 'perugiano': " + l.cerca("perugino"));
        System.out.println("Trovato 'alessandrino': "+ l.cercaR("alessandrino", l.getTesta()));
    }

}