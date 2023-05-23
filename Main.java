package Konyvtar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		VirtualLibrary library = new VirtualLibrary();

        UtilitySoftware utilitySoftware = new UtilitySoftware("UtilitySoftware");
        VideoGame videoGame = new VideoGame("VideoGame");
        SmallApplications smallApplications = new SmallApplications("SmallApplications");

        library.addSoftware(utilitySoftware);
        library.addSoftware(videoGame);
        library.addSoftware(smallApplications);

        library.showSoftwareList();

        Scanner scanner = new Scanner(System.in);
			System.out.print("Válassz egy szoftvert a telepítéshez: ");
			String chosenSoftware = scanner.nextLine();

			for (AbstractSoftware software : library.softwareList) {
			    if (software.getNev().equals(chosenSoftware)) {
			        library.installSoftware(software);
			        break;
			    }
			}
		
        
    }
}
