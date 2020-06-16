package bag;
import java.util.Random;

import surprise.ISurprise;

public class RandomBag extends AbstractBag {

	private static Random random = new Random();

	@Override
	public ISurprise takeOut() {
		if (!super.bag.isEmpty()) {
			int index = RandomBag.random.nextInt(super.bag.size());
			ISurprise surprise = super.bag.remove(index);
			return surprise;
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "RandomBag";
	}

}
