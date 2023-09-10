package jfe4;

import jfe4.Auto;

public class Main {
    public static void main(String[] args) {
        //Deklarieren
        Auto meinAuto;

        //Initialisieren
        meinAuto = new Auto("Mercedes", "Schwarz", 2023, false);

        meinAuto.hupen();
        meinAuto.eigenschaftenAnzeigen();

       meinAuto.setMarke("Ford");
        System.out.println(meinAuto.getMarke());

    }
}
