package surprise;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FortuneCookie implements ISurprise {

	private  String message;
	private static Random random = new Random();
	private static ArrayList<String> messages = new ArrayList<String>(List.of("Fii bun ca să trăiești mult.",
			"Fii după cum te arată chipul.", "Fii inimă răbdătoare, ca pământul sub picioare.",
			"Fiecare cu norocul lui trăiește.", "Fii prost cuminte.", "Fii sigur, n-ai nădejde.",
			"Fii tată celor buni și bici celor răi.", "Bogatia este in idei nu in bani.",
			"Fiecare este stăpân pe capul lui.", "Firul rupt nu se mai toarce.",
			"Cere sfatul unui dusman si fa invers.", "Cea mai mare intelepciune este bunatatea.",
			"Fiecare trage acolo unde cunoaște.", "Viata este prea scurta pentru a te grabi.",
			"Foamea e cel mai bun bucătar.", "Foamea gonește pe lup din pădure.", "Fiecare pe ale lui știe.",
			"Frica totdeauna aduce primejdie.", "Fricosul se sperie de umbra sa.", "Friptura bună nu se face la fum."));

	private FortuneCookie(String message) {
		this.message = message;
	}

	public static FortuneCookie generate() {
		int index = FortuneCookie.random.nextInt(FortuneCookie.messages.size());
		String message = FortuneCookie.messages.get(index);
		return new FortuneCookie(message);
	}

	@Override
	public void enjoy() {
		System.out.println("FortuneCookie surprise: " + this.message);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.message == null) ? 0 : this.message.hashCode());
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
		FortuneCookie other = (FortuneCookie) obj;
		return this.message.equals(other.message);
	}

	@Override
	public String toString() {
		return "FortuneCookie [message=" + this.message + "]";
	}
	
	
}
