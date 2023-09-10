package jfe1;

public class DatentypenUndVariablen {

    /*
    * int -> Ganzzahl -> 2
    * double -> Dezimalzahl -> 2.22
    * char -> Zeichen -> 'c'
    * String -> Zeichenkette -> "Hello World!"
    * boolean -> Wahrheitswert -> true oder false
    * */

    public static void main(String[] args) {
        //Deklaration
        int punktzahl;

        //Initialisierung
        punktzahl = 100;

        System.out.println("Punktzahl: " + punktzahl);

        punktzahl = 150;

        System.out.println("Punktzahl: " + punktzahl);

        String begruessung = "Hello World!";

        System.out.println("Begrüßung: " + begruessung);

        double dezimalzahl = 2.2;

        System.out.println("Double: " + dezimalzahl);

        dezimalzahl = 2.5;

        System.out.println("Double: " + dezimalzahl);

        char zeichen = 'c';

        System.out.println("Char: " + zeichen);

        boolean wahr = true;
        boolean falsch = false;

        System.out.println("Wahr: " + wahr);
        System.out.println("Falsch: " + falsch);

        boolean operator = 0 != 0;
        System.out.println("Operator: " + operator);
    }
}
