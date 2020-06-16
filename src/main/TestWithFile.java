package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import surprise.AbstractGiveSurprise;
import surprise.GatherSurprises;
import surprise.GiveSurpriseAndApplause;
import surprise.GiveSurpriseAndHug;
import surprise.GiveSurpriseAndSing;
import surprise.ISurprise;

public class TestWithFile {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("test.txt"); BufferedReader br = new BufferedReader(fr)) {

			ISurprise[] surprises = null;
			String bagType = "";
			AbstractGiveSurprise giveWith = null;

			String line;

			while ((line = br.readLine()) != null && !line.equals("quit")) {
				System.out.println("\nAsteapta comanda: (help - Afiseaza lista de comenzi disponibile)");
				switch (line.toLowerCase()) {

				case "help":
					TestWithFile.printAvailableActions();
					break;

				case "gather":
					System.out.println("Introduceti numarul de surprize pe care doriti sa le creati:");
					int surprisesNo = Integer.parseInt(br.readLine());
					surprises = GatherSurprises.gather(surprisesNo);
					break;

				case "bag":
					System.out.println("Introduceti tipul tolbei:");
					bagType = br.readLine();
					break;

				case "give":
					System.out.println("Introduceti timpul de asteptare pana la daruirea unei noi surprize:");
					int waitTime = Integer.parseInt(br.readLine());
					try {
						giveWith = giveMode(br, bagType, waitTime);
						giveWith.put(surprises);
						giveWith.giveAll();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;

				case "quit":
					System.out.println("Aplicatia se inchide…");
					break;

				default:
					System.out.println("Comanda introdusa nu este valida.");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	private static void printAvailableActions() {
		System.out.println("Press:");
		System.out.println("help - Afiseaza aceasta lista de comenzi\n" + "gather - Pentru a crea surprize\n"
				+ "bag - Pentru a preciza tipul de tolba in care vor fi puse surprizele\n"
				+ "give - Pentru a adauga surprizele in tolba si a le darui\n" + "quit - Inchide aplicatia\n");
	}

	// the method returns an instance of a class that give the surprises according to the chosen mode
	private static AbstractGiveSurprise giveMode(BufferedReader br, String bagType, int waitTime) throws IOException {
		System.out.println("Precizeaza modul in care vrei ca surprizele sa fie daruite, tastand:\n"
				+ "\"Applause\" - cu aplauze\n" + "\"Sing\" - cu un cantec\n" + "\"Hug\" - cu o imbratisare");
		String option = br.readLine();
		switch (option.toLowerCase()) {
		case "applause":
			return new GiveSurpriseAndApplause(bagType, waitTime);
		case "sing":
			return new GiveSurpriseAndSing(bagType, waitTime);
		case "hug":
			return new GiveSurpriseAndHug(bagType, waitTime);
		default:
			throw new RuntimeException("Not supported give mode.");
		}
	}

}
