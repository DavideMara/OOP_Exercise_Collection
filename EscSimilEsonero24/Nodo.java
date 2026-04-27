public class Nodo {
    private String info;
    private Nodo next;

    public Nodo(String info) {
        this.info = info;
        this.next = null;
    }

    public String getInfo() {
        return info;
    }

    public Nodo getNext() {
        return next;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}