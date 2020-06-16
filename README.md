ProiectDev(Java Class Hierarchy) - Aplicatie 'Imparte surprize'

*Aplicatia e menita sa gestioneze un set de surprize. 
    -sa utilizeze mai multe tipuri de surprize (i.e. ce implementeaza o interfata comuna)
    -sa implementeze diversi algoritmi de stocare si daruire a surprizelor
    -sa foloseasca un mecanism aleator de generare a unui set (nou) de surprize

*Scopul final al aplicatiei estesa putem:
   -defini cu usurinta noi tipuri de dorinte, care pot fi usor integrate cu cele deja existente
   -crea noi algoritmi de gestiune a unei colectii de surprize, care ulterior sa poata inlocui sau extinde setul existent fara modificari majore in codul existent
   -lucra in mod comun cu orice tipuri de surprize
   -gestiona surprizele intr-un mod generic, indiferent de tipul (actual) de container

*Tipurile de surprize sunt urmatoarele: 
-FortuneCookie
-Candies
-MinionToy 
*Fiecare clasa-surpriza va contine si o metoda statica generate(), care va crea o surpriza de tipul respectiv 

*Toate surprizele vor fi depozitate in diverse tipuri de containere, care vor dicta modul de stocare si mai ales ordinea in care surprizele vor fi impartite
    -o tolba care va da cadourile din interior intr-o ordine aleatoare
    -o tolba care va da cadourile in ordinea in care acestea au fost introduse (FIFO)
    -o tolba care va da cadourile in ordinea inversa introducerii (LIFO)

*Pentru a genera un set de surprize aleatoare, se implementeaza clasa GatherSurprises

*Deoarece exista mai multe tipuri de containere, ne dorim implementarea unui mecanism unic prin care sa generam un nou container (gol)

*Impartirea surprizelor folosind clasele:
-GiveSurpriseAndApplause
-GiveSurpriseAndSing 
-GiveSurpriseAndHug
