package Konyvtar;

abstract class AbstractSoftware {
    private String nev;

    public AbstractSoftware(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }
}