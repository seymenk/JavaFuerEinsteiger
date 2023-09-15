package jfe10;

public class MehrdimensionaleArrays {

    /*
    * Kann man sich als Tabelle oder Matrix vorstellen
    *
    * Datentyp[][] variablenName = new Datentyp[Länge Zeilen][Länge Spalten]
    *
    * */

    public static void main(String[] args) {
        //Array deklarieren und initialisieren 1. Weg
        int[][] zahlenTabelle = new int[3][4];

        //Array deklarieren und initialisieren 2. Weg
        int[][] zahlenMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        //Zugriff
        zahlenTabelle[0][0] = 10;

        int ersteZeileErsteSpalte = zahlenTabelle[0][0];

        System.out.println(ersteZeileErsteSpalte);

        //Mit for-Schleife durchlaufen
        //äußere Schleife für die Zeilen
        for (int i = 0; i < zahlenMatrix.length; i++){

            //innere Schleife für die Spalten
            for (int j = 0; j < zahlenMatrix[i].length; j++){
                System.out.println("Zeile: " + i + " Spalte: " + j + " = " + zahlenMatrix[i][j]);
            }
        }
    }
}
