public class Patient {
	private String name;
	private String kasse;
	
	public Patient(){
		
	}
	
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
	
	public String get_name() {
		return name;
	}
	
	public String get_kasse() {
		return kasse;
	}
}