package jfe8;

public class Schleifen {

    /*
     * for -> Sehr effizient, wenn man weiß, wie oft der Codeblock ausgeführt werden soll
     * while -> Ideal, wenn man im Voraus nicht weiß, wie oft der Codeblock ausgeführt werden soll,
     * man aber eine Bedingung zum Beenden der Schleife hat
     * do-while -> Ähnlich wie while, doch der Codeblock wird mindestens einmal ausgeführt
     * */

    public static void main(String[] args) {
        //for-Schleife
        for(int i = 0; i <= 5; i++){
            System.out.println("Aktueller Index: " + i);
            System.out.println("Test");
        }

        //while-Schleife
        int i = 20;
        while(i < 10){
            System.out.println("Aktueller Index: " + i);
            i++;
        }

        //do-while-Schleife
        do{
            System.out.println("Aktueller Index: " + i);
            i++;
        }while(i < 10);
    }
}
