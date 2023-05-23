package Konyvtar;

import java.util.ArrayList;
import java.util.List;

public class VirtualLibrary {
    public List<AbstractSoftware> softwareList;

    public VirtualLibrary() {
        softwareList = new ArrayList<>();
    }

    public void addSoftware(AbstractSoftware software) {
        softwareList.add(software);
        System.out.println("A " + software.getNev() + " szoftver hozzáadásra került!");
    }

    public void removeSoftware(AbstractSoftware software) {
        softwareList.remove(software);
        System.out.println("A " + software.getNev() + " szoftver törlésre került!");
    }

    public void showSoftwareList() {
        System.out.println("Elérhető szoftverek:");
        for (AbstractSoftware software : softwareList) {
            System.out.println("- " + software.getNev());
        }
    }

    public void installSoftware(AbstractSoftware software) {
        if (software instanceof ITelepitheto) {
            ((ITelepitheto) software).Telepit();
        } else {
            System.out.println("A " + software.getNev() + " szoftver nem telepíthető!");
        }
    }
}
