import java.util.ArrayList;

public class Utente {
    
    private ArrayList<Notifica> notifiche; //questo è private

    void addNotifica(Notifica notifica) {

        notifiche.add(notifica);
    }

    void visualizzaNotifica(Notifica notifica) {

        //bisogna trovare un metodo per risalire all'oggetto Notifica presente nella lista di notifiche
        //indicizzare un elemento nell'ArrayList non è facile, dobbiamo trovare un modo di farlo attraverso il parametro passato
    }
}