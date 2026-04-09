public class Nodo {
    private String info;
    private Nodo next;

    // Constructor
    public Nodo(String info){
        this.info = info;
        this.next = null;
    }

    // Get and set functions
    public String getInfo(){
        return info;
    }

    public void setInfo (String info){
        this.info = info;
    }

    public Nodo getNext(){
        return next;
    }

    public void setNext(Nodo next){
        this.next = next;
    }

}
