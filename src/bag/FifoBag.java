package bag;
import surprise.ISurprise;

public class FifoBag extends AbstractBag {

	@Override
	public ISurprise takeOut() {
		if (!super.bag.isEmpty()) {
			ISurprise surprise = super.bag.remove(0);
			return surprise;
		}
		return null;
	}

	@Override
	public String toString() {
		return "FIFOBag";
	}

}
