package bag;
import surprise.ISurprise;

public class LifoBag extends AbstractBag {

	@Override
	public ISurprise takeOut() {
		if (!super.bag.isEmpty()) {
			ISurprise surprise = super.bag.remove(super.bag.size() - 1);
			return surprise;
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "LIFOBag";
	}


}
