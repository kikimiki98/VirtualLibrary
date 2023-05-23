package Konyvtar;

class SmallApplications extends AbstractSoftware implements ITelepitheto {
    public SmallApplications(String nev) {
        super(nev);
    }

    @Override
    public void Telepit() {
        System.out.println("A " + getNev() + " szoftver települt!");
    }
}