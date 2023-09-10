package jfe2;

public class Methoden {

    /*
    * Sichtbarkeit -> public, private
    * statisch -> static oder gar nichts (frei lassen)
    * Rückgabetyp -> Datentyp (bspw. int) oder void (kein Rückgabewert)
    * Methodenname -> irgendein Name bspw. sageHallo
    * () -> in diese Klammern kommen Parameter -> Parameter = Datentyp variablenName -> bei mehreren Parametern mit einem Komma trennen
    * */

    public static void main(String[] args) {
        sageHallo();

        String nameBenutzer = "Peter";

        sageHalloMitParameter(nameBenutzer);

        int ergebnis = addiere(7, 3);

        System.out.println(ergebnis);
    }

    //Methode ohne Parameter und ohne Rückgabewert
    public static void sageHallo(){
        System.out.println("Hallo Gustav!");
    }

    //Methode mit Parameter und ohne Rückgabewert
    public static void sageHalloMitParameter(String name){
        System.out.println("Hallo " + name);
    }

    //Methode mit Parameter und mit Rückgabewert
    public static int addiere(int zahl1, int zahl2){
        int summe = zahl1 + zahl2;
        return summe;
    }
}
