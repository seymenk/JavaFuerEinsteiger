package jfe3;

public class OperatorenUndAusdruecke {

    /*
    * Arithmetische Operatoren -> +, -, *, /, % Modulo ist so viel wie ein Rest
    * Vergleichsoperatoren -> ==, !=, <, >
    * Logische Operatoren -> &&, ||, !
    * Zuweisungsoperatoren -> +=, -=, *=, /=
    * Inkrement- und Dekrementoperator -> ++, --
    * */

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int summe = a + b;

        System.out.println(summe);
        // 8 % 4 = Rest 0
        System.out.println(8 % 4);

        // 16 % 5 = Rest 1
        System.out.println(16 % 5);

        System.out.println(a > b);

        System.out.println(!(a > b) && 10 == 10);

        int zahl1 = 100;

        System.out.println(zahl1);

        zahl1 += 20;

        System.out.println(zahl1);

        int inkrement = 5;

        System.out.println(inkrement);

        inkrement++;

        System.out.println(inkrement);

        int dekrement = 5;

        System.out.println(dekrement);

        dekrement--;

        System.out.println(dekrement);
    }
}
