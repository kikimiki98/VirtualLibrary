package Konyvtar;

class UtilitySoftware extends AbstractSoftware implements ITelepitheto {
    public UtilitySoftware(String nev) {
        super(nev);
    }

    @Override
    public void Telepit() {
        System.out.println("A " + getNev() + " szoftver települt!");
    }
}
