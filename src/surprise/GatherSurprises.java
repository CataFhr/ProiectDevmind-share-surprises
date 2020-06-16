package surprise;
import java.util.Random;

public final class GatherSurprises {

	private static Random random = new Random();
	private static String[] surprisesType = { "FortuneCookie", "Candies", "MinionToy" };

	private GatherSurprises() {

	}

	public static ISurprise gather() {
		int index = GatherSurprises.random.nextInt(GatherSurprises.surprisesType.length);
		if (index == 0) {
			return FortuneCookie.generate();
		} else if (index == 1) {
			return Candies.generate();
		} else {
			return MinionToy.generate();
		}
	}

	public static ISurprise[] gather(int n) {
		ISurprise[] surprises = new ISurprise[n];
		for (int i = 0; i < n; i++) {
			surprises[i] = GatherSurprises.gather();
		}
		return surprises;
	}

}
