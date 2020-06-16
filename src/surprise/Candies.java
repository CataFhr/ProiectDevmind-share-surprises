package surprise;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Candies implements ISurprise {

	private int number;
	private String type;
	private static Random random = new Random();
	private static ArrayList<String> candiesType = new ArrayList<String>(
			List.of("chocolate", "jelly", "fruits", "vanilla"));

	private Candies(int number, String type) {
		this.number = number;
		this.type = type;
	}

	public static Candies generate() {
		int candiesNo = Candies.random.nextInt(20) + 1;
		int index = Candies.random.nextInt(Candies.candiesType.size());
		String type = Candies.candiesType.get(index);
		return new Candies(candiesNo, type);
	}

	@Override
	public void enjoy() {
		System.out.println("Candies surprise: " + this.number + " " + this.type + " candies");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.number;
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Candies other = (Candies) obj;
		return this.number == other.number && this.type.equals(other.type);
	}

	@Override
	public String toString() {
		return "Candies [number=" + this.number + ", type=" + this.type + "]";
	}
	
	

}
