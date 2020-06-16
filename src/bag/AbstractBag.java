package bag;

import java.util.ArrayList;

import surprise.ISurprise;

public abstract class AbstractBag implements IBag {

	protected ArrayList<ISurprise> bag;

	public AbstractBag() {
		this.bag = new ArrayList<ISurprise>();
	}

	@Override
	public void put(ISurprise newSurprise) {
		if (newSurprise != null) {
			System.out.println("Add:" + newSurprise);
			this.bag.add(newSurprise);
		}
	}

	@Override
	public void put(ISurprise[] surprises) {
		if (surprises != null) {
			for (int i = 0; i < surprises.length; i++) {
				this.put(surprises[i]);
			}
		}
	}

	@Override
	public void put(IBag bagOfSurprises) {
		System.out.println("Add all surprises from: " + bagOfSurprises);
		while (!bagOfSurprises.isEmpty()) {
			ISurprise surprise = bagOfSurprises.takeOut();
			this.bag.add(surprise);
		}
	}

	@Override
	public boolean isEmpty() {
		return this.bag.isEmpty();
	}

	@Override
	public int size() {
		return this.bag.size();
	}

}
