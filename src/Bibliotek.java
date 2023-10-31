import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotek {
    private ArrayList<Bog> bogListe = new ArrayList<>();

    public Bibliotek() {
    }

    public void tilfoejBog (int nr, String t, String f) {
        Bog b = new Bog(nr, t, f, false, "");
        bogListe.add(b);
    }

    public void fjernBog (int nr){
        for (int i = 0; i < bogListe.size(); i++){
            if (bogListe.get(i).getBogId() == nr) {
                bogListe.remove(i);
            }
        }
    }
    public void udlaanBog (int nr, int lnr, String lnavn, String d){
        Laaner la = new Laaner(lnr, lnavn);
        for (int i = 0; i < bogListe.size(); i++){
            if (bogListe.get(i).getBogId() == nr){
                bogListe.get(i).udlaanBog(la, d);
            }
        }
    }
    public void afleverBog (int nr){
        for (int i = 0; i < bogListe.size(); i++){
            if (bogListe.get(i).getBogId() == nr){
                bogListe.get(i).afleverBog();
            }
        }
    }

    public void indlaesAlleBoeger () throws FileNotFoundException {
        File fil = new File("bogfil.txt");
        Scanner inputfrafil = new Scanner(fil);
        int nr;
        String t, f;
        while (inputfrafil.hasNext()){
            nr = inputfrafil.nextInt();
            t = inputfrafil.next();
            f = inputfrafil.next();
            bogListe.add(new Bog(nr, t, f, false, ""));
        }

    }

    @Override
    public String toString() {
        return "Bibliotek{" +
                "bogListe=" + bogListe +
                '}';
    }
}
