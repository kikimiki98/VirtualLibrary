package Konyvtar;

class VideoGame extends AbstractSoftware {
    public VideoGame(String nev) {
        super(nev);
    }
    public void Telepit() {
        System.out.println("A " + getNev() + " szoftver települt!");
    }
}