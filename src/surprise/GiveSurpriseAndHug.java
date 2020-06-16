package surprise;
public class GiveSurpriseAndHug extends AbstractGiveSurprise {

	public GiveSurpriseAndHug(String bagType, int waitTime) {
		super(bagType, waitTime);
	}

	@Override
	protected void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
	}

}
