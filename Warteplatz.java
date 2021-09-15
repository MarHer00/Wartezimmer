public class Warteplatz {

    private Patient daten = null;

    private Warteplatz naechster = null;

    public Warteplatz(Patient daten) {

      this.daten = daten;

      naechster = null;

    }

    public Patient getDaten() {

      return daten;

    }

    public void setDaten(Patient daten) {

      this.daten = daten;

    }

    public Warteplatz getNaechsterWarteplatz() {

      return this.naechster;

    }

    public void setNaechsterWarteplatz(Warteplatz naechster) {

        this.naechster = naechster;

    }
}