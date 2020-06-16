package bag;

import surprise.ISurprise;

public interface IBag {

	void put(ISurprise newSurprise);
	
	public void put(ISurprise[] surprises);

	void put(IBag bagOfSurprises);

	ISurprise takeOut();

	boolean isEmpty();

	int size();

}
