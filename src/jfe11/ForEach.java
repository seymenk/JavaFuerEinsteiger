package jfe11;

public class ForEach {

    /*
    *
    * vereinfachte Form der for-Schleife
    * dient dazu, alle Elemente eines Arrays zu durchlaufen
    *
    * for(Datentyp variablenName : arrayName)
    *
    * */

    public static void main(String[] args) {
        int[] zahlen = {1,4,5,2};

        for(int zahl : zahlen){
            System.out.println(zahl);
        }

        String[] worte = {"Hallo", "Welt", "Java", "for-each"};

        for(String wort : worte) {
            System.out.println(wort);
        }
    }
}
