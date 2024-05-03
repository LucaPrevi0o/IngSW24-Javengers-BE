# COME SINCRONIZZARE VISUAL STUDIO CODE CON GIT
## Breve tutorial sull'utilizzo di Git attraverso VS-Code / from "il vostro supermitico arch :)"

* **Fase 1**: creare profilo su GitHub (se non si fa già parte dei due repository, dovrebbero esserci delle notifiche riguardanti l'aggiungersi al progetto). *IMPORTANTE: creare il profilo attraverso la mail Unife, altrimenti l'invito non sarà presente e non sarà possibile lavorare contribuendo al progetto*

* **Fase 2**: Installare VS-Code (se non già fatto) e aprire l'applicazione (dovrebbe essere disponibile, e funzionante allo stesso modo, su Linux/Mac e su Windows - questo tutorial è stato pensato attraverso l'uso dell'applicazione da Linux/Mac, se ci saranno degli aggiornamenti rispetto a Windows perchè alcune cose funzionano diversamente ve lo farò sapere)

* **Fase 3**: nel menu a sinistra, l'icona in alto permette di navigare nel file system a partire dalla cartella corrente, quella inferiore con la lente d'ingrandimento permette di cercare molte cose (per me è quasi inutile, se a qualcuno torna comoda tanto meglio), quella inferiore è quella fondamentale perchè permetterà di 

* **Fase 3.5**: se, avendo usato precedentemente VS-Code, avete ancora dei progetti aperti (vedete un albero di file, cartelle e sottocartelle aperto, ed eventualmente anche dei file co cui stavate lavorando in precedenza), dal menu di navigazione del file system (prima icona) fare clic destro all'interno dell'albero di navigazione e cliccare su "Rimuovi cartella dall'area di lavoro" per chiudere qualsiasi progetto (se VS-Code vi chiedesse di salvare il progetto in qualche file, non salvatelo: questo file vi salverebbe solamente un'impostazione dell'applicazione per aprire velocemente la cartella in cui stavate lavorando, ma secondo me è più semplice aprire nuovaente la cartella dall'applicazione in un secondo momento - a meno che abbiate veramente necessità di salvare questo progetto... allora fatelo tranquillamente XD)

* **Fase 4**: dopo aver chiuso qualsiasi progetto aperto (il menu della prima icona dovrebbe essere vuoto, con un tasto "Apri cartella" e un tasto più in basso "Clona repository"), cliccare sul tasto "Clona repository" nel menu relativo alla prima icona (dovrebbe comparire lo stesso tasto anche dal terzo menu, e funzionare esattamente allo stesso modo) e, successivamente, sul menu "Clona da GitHub" che dovrebbe comparire in alto, al centro dello schermo (se non compare chiamatemi perchè c'è un problema che non conosco e magari proviamo a risolverlo lol)

* **Fase 4.5**: cliccando su questo tasto per la prima volta, dovrebbe comparirvi una richiesta di convalida dell'accesso a GitHub da parte di VS-Code, che vi rimanderà ad una finestra di login attraverso il browser; eseguendo eventualmente il login (con l'account creato attraverso la mail Unife), e autorizzando VS-Code a lavorare attraverso Git, dovreste poter tornare su VS-Code avendo attivato le estensioni di Git su VS-Code

* **Fase 5**: il menu in alto a destra dovrebbe ora mostrare una lista di tutte le possibili repository di Git su cui potete lavorare attraverso GitHub (se non avete mai utilizzato Git in vita vostra prima di ora, dovrebbero comparirvi solamente le 2 repo del progetto di IngSW - in caso contrario vi troverete anche qualsiasi altro progetto privato e/o appartenente ad altri progetti di gruppo)

* **Fase 6**: selezionare una delle due repository (front-end o back-end) per crearne una copia locale: quello che state creando in questo momento sarà il vostro punto di accesso al progetto quando lavorerete

* **Fase 6.5**: VS-Code vi chiederà di selezionare una posizione sul vostro PC in cui clonare la repository, scegliete una cartella da cui avete facile accesso e confermate - in questo modo, ogni volta che aprirete quella cartella tramite VS-Code potrete vedere gli aggiornamenti relativi ai file del progetto. IMPORTANTE: questa cartella NON si aggiorna in automatico (all'interno del vostro file system, finchè non andrete ad aggiornare la repository di GitHub attraverso VS-Code, non vedrete file nuovi, vecchi o aggiornati, ma solamente quello che avevate PRIMA dell'ultimo aggiornamento effettuato in locale), pertanto ogni volta che dovrete lavorarci PRIMA DI TUTTO sarà ESSENZIALE effettuare un aggiornamento dello stato corrente della repository, oppure effettuare un nuovo branch (poi vi spiego come)

* **Fase 7**: aprendo ora la cartella di lavoro su VS-Code (il programma dovrebbe chiedervelo in automatico, al che voi dovreste rispondere con "Sì"), dovreste poter vedere tutti gli aggiornamenti recenti al progetto che GitHub ha registrato - siamo pronti ad iniziare a lavorare

<hr>

# CONSIGLI SU COME LAVORARE CON GIT
## Lista di know-how che può tornare utile in qualsiasi momento si decida di lavorare con Git, e che valgono anche se si lavora su Git non attraverso VS-Code

* **Aggiornamento del "main"**: come ci ha spiegato Lazzarini, ogni progetto Git ha un albero "main" (lo stato principale ed effettivo di lavoro) e tanti "branch" paralleli che rappresentano una parte delle modifiche apportate pian piano lungo il percorso di lavoro. Quando siamo sicuri di aver fatto qualcosa di buono, tramite un'operazione di "merge" il ramo parallelo e quello principale vengono unificati, in un nuovo tassello dell'albero principale, che rappresenta il nuovo ultimo stato di lavoro ben fatto del progetto. Questo permette di lavorare su nuove funzioni del progetto, senza disturbare il lavoro corrente già finito (che potrebbe non funzionare più aggiungendo modifiche a raffica), e mantenendo intatto tutto lo storico del lavoro svolto (se, ad un certo punto, ci si accorge che qualcosa non sta più funzionando correttamente, Git si ricorda tutto lo storico di lavoro e permette di tracciare indietro il percorso, ad una versione di lavoro più vecchia in cui il "main" funziona ancora bene, e i progressi fatti sono su un ramo parallelo, e possono essere sistemati senza intaccare quello principale). Tuttavia, se prima di iniziare un lavoro ci sono degli aggiornamenti approvati e finiti sul "main", ma il nostro file system locale ancora non li ha ricevuti, rischiamo di fare delle modifiche che vanno a creare dei conflitti, tra le modifiche che abbiamo sul PC in locale e la versione di lavoro effettiva. Pertanto, è sempre bene scaricare l'ultima versione del progetto da Git prima di fare QUALSIASI COSA, attraverso un'operazione di "pull" che copia tutto lo stato di lavoro corrente sul file system locale (VS-Code vi riempie di notifiche ovunque, una delle quali dovrebbe trovarsi in un tasto nel terzo menu a sinistra - cliccandolo l'operazione di aggiornamento dovrebbe effettuarsi manualmente, e ovviamente insieme all'aggiornamento dei file del "main" Git si aggiorna con tutti i possibili rami e sottorami secondari che chiunque ha creato nel progetto, in modo che, in qualsiasi momento, chiunque abbia sempre accesso costante ad ogni singolo piccolo aggiornamento di ogni singola piccola cosa fatta)

* **Utilizzo frequente dei "branch"**: per permettere alle persone di lavorare in parallelo, si può sempre creare un piccolo branch dal ramo principale, modificare quel branch, e poi aggiungerlo al main con un merge delle informazioni. Talvolta, in realtà, può essere conveniente anche fare più progressi su un branch secondario, e poi fare un merge unico alla fine. Sono metodi di lavoro diversi, parimenti funzionali. Quello che consiglio sempre, tuttavia, è di fare una cosa di questo tipo, per avere pieno controllo di ogni modifica effettuata:

    * aprire l'ultima versione del "main" e tutti i relativi branch secondari

    * selezionare da quale "branch" iniziare la modifica (sempre nel menu a sinistra, scorrendo verso il basso dovreste trovare un'icona per il profilo, che a noi non credo serva, e una per le impostazioni di VS-Code, che non ci serve nemmeno; più in basso c'è una barra che, se tutto va bene, dovrebbe avere un piccolo menu rappresentante lo stato di lavoro corrente di Git, indicato dalla stessa icona che identifica il terzo menu della barra principale sulla sinistra: cliccandoci sopra dovreste vedere, innanzitutto, il nome del ramo in cui vi trovate al momento, che molto probabilmente sarà il main, e dovrebbe comparirvi in alto al centro una lista di tutti i branch, sottobranch e versioni modificate di tutto l'albero di Git; a quel punto potete semplicemente selezionare a quale branch agganciarvi, e se tutto va come dovrebbe andare, quello che vi troverete ora nel file system non è più la lista di tutti i file dell'ultima versione del "main", ma la lista di tutti i file che ci sono in quella specifica versione di quello specifico branch)

    * creare un nuovo branch (cliccando sullo stesso tasto in basso a sinistra, il menu che vi compare dovrebbe mostrare anche una voce "Crea nuovo branch": cliccandoci sopra, e inserendo il nome del nuovo branch che andrete a creare, potete creare un nuovo elemento di versione nell'albero di Git in cui modificare i file senza il rischio di compromettere la versione che avete appena scaricato)

    * effettuare tutte le modifiche che dovete fare (nuovi file, modifiche di file, rimozione di file, eccetera) - IMPORTANTE: potete anche effettuare le modifiche un po' alla volta, andando ogni tanto a effettuare dei "commit" attraverso il solito terzo menu a sinistra (i "commit" non sono altro che delle piccole richieste di salvataggio dello stato corrente, senza effettivamente andare a creare una nuova versione - un po' come mettere in archivio una parte dei file, pronti per spedirli, facendolo un po' alla volta; quando si hanno tutti i file pronti per la spedizione, si effettua il push finale e si crea la nuova versione, spedendo tutti i file in ogni piccola commit delle modifiche in una volta sola - anche se non sembra, Git dovrebbe poter recuperare anche le modifiche di una singola commit all'interno di una versione in un branch, e quindi si ha un controllo ancora migliore del recupero delle singole piccole modifiche - per come funziona Git, è consigliabile fare una commit diversa per ogni volta che modificate un file, perchè in questo caso Git vi permette di inserire anche una breve descrizione delle modifiche che avete inserito a fianco del nome del file modificato, ma a quanto pare non sembra funzionare perfettamente se inserite le modifiche di più file nella stessa commit, o almeno se lo fate attraverso VS-Code)

        * quando effettuate una commit attraverso VS-Code, vi si aprirà un file di testo con tante righe precedute da cancelletti (#); cancellando il carattere # davanti alla linea che rappresenta le modifiche al file in questione, state di fatto togliendo una riga di commento da un file che Git comprende come codice eseguibile, e che può interpretare come aggiornamento del file rispetto alla repository remota (non facendolo sarebbe come dire a Git di non aggiornare nulla); dopo averlo fatto, per confermare la commit, in alto a destra dovrebbe comparire un segno di spunta, che una volta cliccato vi chiederà di salvare la commit effettuata e, alla vostra risposta "Sì", procederà ad effettuare la commit sul sistema di Git

    * effettuare il "push" delle modifiche effettuate (finchè non lo dite a Git, le modifiche rimangono solo sul vostro PC, e non si aggiornano in automatico - quando avete finito tutte le modifiche di lavoro, dal terzo menu effettuate la commit finale delle ultime modifiche e poi cliccate sul tasto "Sincronizza modifiche" per confermare il push)

Con questo procedimento di lavoro, dovremmo essere tutti in grado di lavorare senza problemi su Git, tenendo ogni progresso e versione da conto senza dimenticarci nulla e senza sovrascrivere in maniera pericolosa i vecchi progressi

--- --- ---

Se ci sono ancora dubbi, problemi, o qualsiasi altro, chiedetemi pure senza alcun tipo di problemi - tenete conto del fatto che è la prima volta anche per me in cui utilizzo Git seriamente, quindi quello che vi ho descritto è un metodo completamente autodidattico che ho appreso questa mattina :) direi a questo punto buon lavoro a todos, spero che questa piccola guida vi sia stata d'aiuto (considerate che non è facile spiegare un sistema di icone con un file di testo XD)