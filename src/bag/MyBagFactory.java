package bag;

public class MyBagFactory implements IBagFactory {

	private static MyBagFactory SINGLETON;

	private MyBagFactory() {

	}

	public static MyBagFactory getInstance() {
		if (MyBagFactory.SINGLETON == null) {
			MyBagFactory.SINGLETON = new MyBagFactory();
		}
		return MyBagFactory.SINGLETON;
	}

	@Override
	public IBag makeBag(String type) {
		switch (type.toLowerCase()) {
		case "random":
			System.out.println("Create RANDOMBag");
			return new RandomBag();
		case "fifo":
			System.out.println("Create FIFOBag");
			return new FifoBag();
		case "lifo":
			System.out.println("Create LIFOBag");
			return new LifoBag();
		default:
			throw new IllegalArgumentException("Error: Not supported bag.");
		}
	}

}
