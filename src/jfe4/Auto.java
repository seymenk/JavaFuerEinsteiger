package jfe4;

public class Auto {

    private String marke;
    private String farbe;
    private int baujahr;
    private boolean schaltgetrieben;

    public Auto(String autoMarke, String autoFarbe, int baujahr, boolean schaltgetrieben){
        this.marke = autoMarke;
        this.farbe = autoFarbe;
        this.baujahr = baujahr;
        this.schaltgetrieben = schaltgetrieben;
    }

    public void hupen(){
        System.out.println("Hup, hup!");
    }

    public void eigenschaftenAnzeigen(){
        System.out.println("Marke: " + marke);
        System.out.println("Farbe: " + farbe);
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Schaltgetrieben: " + schaltgetrieben);
    }

    public void setMarke(String marke){
        this.marke = marke;
    }

    public String getMarke(){
        return this.marke;
    }

}
