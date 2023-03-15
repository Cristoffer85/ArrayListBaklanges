/*
Termer
    Array - En samling av värden som har samma typ.
    for loop - En loop som körs ett visst antal gånger.
-------------------------
Instruktioner
    Skapa en array med namn.
    Skriv ut alla namn i arrayen i bakvänd ordning.
------------------

        Denna array är public + privat, till skillnad ifrån W3schools-Arrays
        Möjlighet gömma viss data i privata methoden istället, för det man inte vill visa publikt.
*/

import java.util.*;

public class ReverseArrayList {

        public static void main(String[] args) {
        List<String> Färger = new ArrayList<String>();
        Färger.add("Svart");
        Färger.add("Vit");
        Färger.add("Blå");
        Färger.add("Röd");
        Färger.add("Gul");
        Färger.add("Grön");
        Färger.add("Orange");
        Färger.add("Rosa");
        Färger.add("Lila");
        Färger.add("Turkos");

        System.out.println("Lista med hjälp av ArrayList; Framlänges! : ");
        System.out.println(Färger.toString());
        Collections.reverse(Färger);
        System.out.println("Baklänges! : ");
        System.out.println(Färger);
        }
}

