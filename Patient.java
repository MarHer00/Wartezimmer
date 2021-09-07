public class Patient {
	private String name; // Name der Person
	private String kasse; // Kuerzel Krankenkasse der Person
	
	// ab hier setter
	public void set_name(String newName) {
		name = newName;
	}
	
	public void set_kasse(String newKasse) {
		kasse = newKasse;
	}
	
	public void set_nk(String newName, String newKasse) {
		kasse = newKasse;
		name = newName;
	}
	// Ende der setter, Anfang der getter
	public String get_name() {
		return name;
	}
	
	public String get_kasse() {
		return kasse;
	}
}
