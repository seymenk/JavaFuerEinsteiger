package jfe12;

public class Bubblesort {
    public static void main(String[] args) {
        int[] zahlen = {32, 5, 3, -1, 111, 39, 324, 45};

        for(int i = 0; i < zahlen.length; i++){
            for(int j = 0; j < zahlen.length-1; j++){
                if(zahlen[j] > zahlen[j+1]){
                    int tmp = zahlen[j];
                    zahlen[j] = zahlen[j+1];
                    zahlen[j+1] = tmp;
                }
            }
        }

        for(int zahl : zahlen){
            System.out.println(zahl);
        }
    }
}
