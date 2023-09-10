package jfe5;

public class Bedingungen {


    /*
    * if-Bedingung -> Wenn eine Bedingung erfüllt ist, wird der folgende Codeblock ausgeführt
    * else-if-Bedingung -> Wenn die vorherige Bedingung falsch ist, prüfe eine weitere Bedingung.
    * else-Anweisung -> Wenn keine der vorherigen Bedingungen erfüllt ist, so wird dieser Codeblock ausgeführt
    *
    * Ternäre Operator -> variable = (Bedingung) ? Wert wenn wahr : Wert wenn falsch;
    * */

    public static void main(String[] args) {
        int alter = 12;

        //if-Bedingung
        if(alter >= 18){
            System.out.println("Du bist volljährig.");
        }

        //else-if Bedingung
        if(alter >= 18){
            System.out.println("Du bist volljährig.");
        }
        else if(alter < 18){
            System.out.println("Du bist minderjährig.");
        }

        String geschlecht = "männlich";

        //else-Anweisung
        if(geschlecht.equals("männlich") && alter >= 18){
            System.out.println("Du bist ein erwachsener junger Mann.");
        } else if (geschlecht.equals("weiblich") && alter >= 18) {
            System.out.println("Du bist eine erwachsene junge Dame.");
        }
        else {
            System.out.println("Du bist minderjährig.");
        }

        //Ternäre Operator
        String begruessung = (geschlecht.equals("männlich")) ? "Herr" : "Frau";
        System.out.println("Guten Tag, " + begruessung);
    }
}
