public class Wartezimmer<Patient>{// in <> ggf. was anderes schreiben, da ich mir über die Richtigkeit von Patient hier nicht sicher bin
	
	Warteplatz erster;
	Warteplatz letzter;
	Warteplatz aktueller;
	int wartezimmer_length = 0;
	
	private class Warteplatz{
		 
	}
	
	public void einfuegen_anErsterStelle(Patient neuerPatient){
		wartezimmer_length++;
	}
	
	public void einfuegen_anLetzterStelle(Patient neuerPatient){
		wartezimmer_length++;
	}
	
	public void entfernen(){
		wartezimmer_length--;
	}
	
	
}
