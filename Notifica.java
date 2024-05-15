public class Notifica<T> { //rivedere parametro generico perchè forse c'è un problema
    
    private T tipoNotifica;
    private String testoNotifica;
    private boolean visualizzato;
    private boolean cancellato;
    private Utente mittente;

    public Notifica(String testo, Utente mittente) {

        this.testoNotifica=testo;
        this.mittente=mittente;
    }

    public void send(String testo, Utente destinatario, Utente mittente) {

        this.testoNotifica=testo;
        destinatario.addNotifica(this);
    }

    public void setVisualizzato(boolean view) { this.visualizzato=view; }
}
