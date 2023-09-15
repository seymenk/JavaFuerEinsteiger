package jfe9;

public class Arrays {
    /*
    * Eine Art von endlicher Liste
    *
    * Datentyp[] variableName = new Datentyp[Anzahl];
    * oder
    * Datentyp variableName[] = new Datentyp[Anzahl];
    * */

    public static void main(String[] args) {
        //Array deklarieren und initialisieren 1. Weg
        // 0 1 2 3 4
        int[] zahlen = new int[5];

        //Array deklarieren und initialisieren 2. Weg
        int[] zahlen2 = {1, 4, 8, 2, 5};

        //Zugriff auf Elemente des Arrays
        System.out.println(zahlen2[4]);

        //Ändern eines Array-Elements
        zahlen[0] = 10;
        zahlen[1] = 20;
        zahlen[2] = 30;
        zahlen[3] = 40;
        zahlen[4] = 50;

        //Durchlaufen des Arrays mit einer for-Schleife
        for(int i = 0; i < zahlen.length; i++){
            zahlen[i] = i+10;
            System.out.println(zahlen[i]);
        }

    }
}
