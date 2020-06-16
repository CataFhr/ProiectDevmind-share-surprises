package main;

import surprise.GatherSurprises;
import surprise.GiveSurpriseAndApplause;
import surprise.GiveSurpriseAndHug;
import surprise.GiveSurpriseAndSing;
import surprise.ISurprise;

public class MainTest {

	public static void main(String[] args) {

		// Creating surprises
		ISurprise surprise1 = GatherSurprises.gather();
		ISurprise surprise2 = GatherSurprises.gather();
		ISurprise surprise3 = GatherSurprises.gather();
		ISurprise surprise4 = GatherSurprises.gather();
		int surprisesNo = 3;
		ISurprise[] surprises1 = GatherSurprises.gather(surprisesNo);
		ISurprise[] surprises2 = GatherSurprises.gather(surprisesNo);

		try {
			//Creating instances of classes that give surprises, using different types of containers
			GiveSurpriseAndApplause giveAndApplause1 = new GiveSurpriseAndApplause("LIFO", 3);
			GiveSurpriseAndHug giveAndHug1 = new GiveSurpriseAndHug("fifo", 2);
			GiveSurpriseAndSing giveAndSing1 = new GiveSurpriseAndSing("Random", 3);
			GiveSurpriseAndApplause giveAndApplause2 = new GiveSurpriseAndApplause("fifo", 2);
//			GiveSurpriseAndApplause giveAndApplause3 = new GiveSurpriseAndApplause("Exception", 3);

			// Adding surprises in containers and giving surprises
			giveAndApplause1.put(surprise1);
			giveAndApplause1.put(surprise2);
			giveAndApplause1.put(surprise3);
			giveAndApplause1.put(surprise4);
			giveAndApplause1.giveAll();
			giveAndApplause1.give();
			giveAndApplause1.give();
			System.out.println(giveAndApplause1.isEmpty());
			giveAndApplause1.put(surprises1);

			giveAndHug1.put(giveAndApplause1.getBag());
			System.out.println(giveAndApplause1.isEmpty());
			giveAndHug1.give();
			giveAndHug1.give();
			System.out.println(giveAndHug1.isEmpty());
			System.out.println(giveAndHug1.getBag().size());

			giveAndSing1.put(surprises2);
			System.out.println(giveAndSing1.getBag().size());
			giveAndSing1.giveAll();

			giveAndApplause2.give();
			giveAndApplause2.put(giveAndApplause1.getBag());
			System.out.println(giveAndApplause2.isEmpty());
			giveAndApplause2.put(surprise1);
			giveAndApplause2.put(surprise2);
			giveAndApplause2.give();
			giveAndApplause2.give();
			giveAndApplause2.give();

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
