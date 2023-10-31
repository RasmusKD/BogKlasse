import java.util.ArrayList;

public class Laanere {
    private ArrayList<Laaner> laanerListe = new ArrayList<>();

    public Laanere() {
    }

    public void tilfoejLaaner (int lnr, String lnavn) {
        Laaner l = new Laaner(lnr, lnavn);
        laanerListe.add(l);
    }

    @Override
    public String toString() {
        return "Laanere{" +
                "laanerListe=" + laanerListe +
                '}';
    }
}
