public class Wartezimmer{
	
	Warteplatz erster;
	Warteplatz letzter;
	Warteplatz aktueller;
	int wartezimmer_length = 0;
	
	public Wartezimmer(){
		erster = null;
		letzter = null;
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
