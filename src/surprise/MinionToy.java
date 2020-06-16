package surprise;
import java.util.ArrayList;
import java.util.List;

public class MinionToy implements ISurprise {

	private String name;
	private static int counter;
	private static ArrayList<String> minionsName = new ArrayList<String>(
			List.of("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));

	private MinionToy(String name) {
		this.name = name;
	}

	public static MinionToy generate() {
		if (MinionToy.counter == MinionToy.minionsName.size()) {
			MinionToy.counter = 0;
		}
		String name = MinionToy.minionsName.get(MinionToy.counter);
		MinionToy.counter++;
		return new MinionToy(name);
	}

	@Override
	public void enjoy() {
		System.out.println("MinionToy surprise: " + this.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
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
		MinionToy other = (MinionToy) obj;
		return this.name.equals(other.name);
	}

	@Override
	public String toString() {
		return "MinionToy [name=" + this.name + "]";
	}
	
	

}
