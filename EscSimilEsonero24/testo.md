### Esercizio 1

Si definisca una gerarchia di classi per rappresentare i dispositivi elettronici in vendita in un negozio.
I dispositivi sono di due tipi: smartphone e tablet.
Per ogni dispositivo si rappresenti: la marca e l'anno di produzione.
L'anno di produzione deve essere modificabile solo utilizzando il metodo `aggiornaAnno`, disponibile a tutti, che ne modifica il valore solo se il nuovo valore è maggiore di 2010.
Inoltre per gli smartphone si rappresenti il fatto che abbiano o meno la connessione 5G, mentre per i tablet si rappresenti la dimensione dello schermo in pollici.

Per entrambe le classi si definisca un metodo che restituisce il `prezzoScontato`.
* Per gli smartphone il `prezzoScontato` è 300, più 100 se hanno il 5G, più 50 se prodotti dopo il 2022;
* Per i tablet il `prezzoScontato` è 250, più 15 per ogni pollice dello schermo, meno 50 se prodotti prima del 2020.

Si definisca una classe `Negozio` che contiene come campo un array `D` in cui è possibile inserire sia smartphone che tablet.
Si definisca un costruttore della classe `Negozio` che ha due parametri `s` e `t` e che istanzia il vettore `D` con `s` smartphone e `t` tablet.
Si definiscano i campi degli oggetti in modo casuale.

Si definisca un metodo della classe `Negozio` che, data una stringa `m` passata come parametro, restituisce la media dei prezzi scontati dei dispositivi presenti in `D` appartenenti alla marca `m`. Se non è presente nessun dispositivo di quella marca, si restituisca il valore zero.
Si definisca infine il metodo main per provare l'applicazione.

***

### Esercizio 2

Si definisca una classe `ListaElementi` che rappresenta una lista di stringhe concatenata tramite riferimenti. Nella classe `ListaElementi` si definiscano:

* Un costruttore che, dato un parametro intero `n`, costruisce una lista formata da `n` stringhe. Ogni stringa sarà costruita concatenando un numero casuale di volte la stringa "java".
* Il metodo iterativo `contaOccorrenze` che, data una stringa `s`, restituisce il numero di volte in cui una stringa di lunghezza uguale a quella di `s` compare all'interno della lista.
* La versione ricorsiva del metodo `contaOccorrenze`.

Si realizzi infine un'applicazione che:
* Crea una lista di 80 elementi.
* Verifica quante stringhe hanno la stessa lunghezza di "javajava" usando il metodo iterativo e stampa a video il risultato.
* Verifica quante stringhe hanno la stessa lunghezza di "umbria" usando il metodo ricorsivo e stampa a video il risultato.

