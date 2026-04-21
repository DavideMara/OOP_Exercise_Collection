**Compito di esonero Programmazione Orientata agli Oggetti 28 aprile 2025**

**Esercizio 1**

Si definisca una gerarchia di classi per rappresentare i gli scheletri di dinosauro posseduti da un museo.

I dinosauri sono di due tipi: erbivori e carnivori.
Per ogni dinosauro si rappresenti: il nome della specie ed il numero di ossa dello scheletro.

Il numero di ossa deve essere modificabile solo utilizzando il metodo *ritrovamento*, disponibile a tutti, che ne modifica il valore solo se il nuovo valore è maggiore del precedente.

Inoltre per i dinosauri erbivori si rappresenti il fatto che sia stato ritrovato anche un uovo o no, mentre per i dinosauri carnivori si rappresenti il numero di denti dello scheletro.

Per entrambe le classi si definisca un metodo che restituisce il *costoRestauro*.
Per i dinosauri erbivori il *costoRestauro* è 500, più 100 per il numero di ossa, più 500 se è stato ritrovato anche un uovo;
per i dinosauri carnivori il *costoRestauro* è 700, più 150 per il numero di ossa, più 30 per il numero di denti.

Si definisca una classe *Museo* che contiene come campo un array *V* in cui è possibile inserire sia dinosauri erbivori che carnivori.

Si definisca un costruttore della classe *Museo* che ha due parametri *n* e *m* e che istanzia il vettore *V* con *n* dinosauri erbivori ed *m* dinosauri carnivori.
Si definiscano i campi degli oggetti in modo casuale.

Si definisca un metodo della classe *Museo* che, dato il nome di una specie, restituisce la media dei costi di restauro dei dinosauri presenti in *V* di quella specie.
Se non è presente nessun dinosauro di quella specie si restituisca il valore zero.

Si definisca infine il metodo main per provare l'applicazione.

**Esercizio 2**

Si definisca una classe *Lista* che rappresenta una lista di interi concatenata tramite riferimenti.
Nella classe *Lista* si definiscano:
* un costruttore che, dati due parametri interi *n* e *m*, costruisce una lista di *n* interi compresi fra 0 e *m*.
* il metodo iterativo *massimo* che, dato un intero *q*, restituisce il massimo valore presente nella lista che è divisibile per *q*. Se nella lista non è presente nessun valore divisibile per *q* si restituirà il valore *Integer.MIN_VALUE*
* la versione ricorsiva del metodo *massimo*.

Si realizzi infine una applicazione che:
* crea una lista di 1000 elementi compresi fra 0 e 500
* scrive a video il massimo valore presente nella lista divisibile per 2 calcolato usando il metodo iterativo.
* scrive a video il massimo valore presente nella lista divisibile per 8 calcolato usando il metodo ~~iterativo~~ ricorsivo.