package jfe6;

public class SwitchCase {
    /*
    * switch(variable){
    *   case wert1:
    *       //Anweisung für wert1
    *       break;
    *   case wert2:
    *       //Anweisung für wert2
    *       break;
    *   default:
    *       //Anweisungen, wenn keine der vorherigen Bedingungen zutrifft
    * }
    * */

    public static void main(String[] args) {
        int tag = 1;
        String wochentag = "";

        switch (tag) {
            case 1 -> wochentag = "Montag";
            case 2 -> wochentag = "Dienstag";
            case 3 -> wochentag = "Mittwoch";
            case 4 -> wochentag = "Donnerstag";
            case 5 -> wochentag = "Freitag";
            case 6 -> wochentag = "Samstag";
            case 7 -> wochentag = "Sonntag";
            default -> System.out.println("Kein gültiger Wochentag.");
        }

        System.out.println("Wochentag an Tag " + tag + " ist ein " + wochentag);
    }
}
