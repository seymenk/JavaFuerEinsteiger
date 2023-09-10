package jfe7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Taschenrechner meinRechner = new Taschenrechner();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Taschenrechner!");
        System.out.println("Gebe die 1. Zahl ein.");
        double zahl1 = scanner.nextDouble();

        System.out.println("Gebe die 2. Zahl ein.");
        double zahl2 = scanner.nextDouble();

        System.out.println("Wähle eine Operation: +, -, * oder /");
        char operation = scanner.next().charAt(0);

        double ergebnis;

        switch (operation){
            case '+':
                ergebnis = meinRechner.addieren(zahl1, zahl2);
                break;
            case '-':
                ergebnis = meinRechner.subtrahieren(zahl1, zahl2);
                break;
            case '*':
                ergebnis = meinRechner.multiplizieren(zahl1, zahl2);
                break;
            case '/':
                ergebnis = meinRechner.dividieren(zahl1, zahl2);
                break;
            default:
                ergebnis = 0;
                System.out.println("Keine gültige Operation.");
        }

        System.out.println("Das Ergebnis ist: " + ergebnis);
    }
}
