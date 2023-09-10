package jfe7;

public class Taschenrechner {

    public double addieren(double a, double b) {
        return a + b;
    }

    public double subtrahieren(double a, double b) {
        return a - b;
    }

    public double multiplizieren(double a, double b) {
        return a * b;
    }

    public double dividieren(double a, double b) {
        if(b != 0){
            return a / b;
        }else{
            System.out.println("Division durch 0 ist nicht erlaubt!");
            return 0;
        }
    }
}
