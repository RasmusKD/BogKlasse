import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fil = new File("bogfil.txt");
        File fil1 = new File("laanerfil.txt");
        Scanner frafilinput = new Scanner(fil);
        Scanner fralaanerfilinput = new Scanner(fil1);
        Scanner fratastetur = new Scanner(System.in);
        Bibliotek bib = new Bibliotek();
        Laanere lListe = new Laanere();
        System.out.println("1. Opret bog");
        System.out.println("2. Opret Låner");
        System.out.println("3. Udlån bog");
        System.out.println("4. Aflever bog");
        System.out.println("5. Fjern bog");
        System.out.println("6. Fjern låner");
        System.out.println("7. Stop programmet");
        System.out.println("8. Indlæs alle bøger fra filen");

        int valg = 0;
        String forfatter;
        String titel;
        String dato;
        int lnr;
        String lnavn;
        int bogId;

        while (valg != 7){
            System.out.println("Indtast valg");
            valg = fratastetur.nextInt();
            switch (valg){
                case 1:
                    System.out.println("Indtast bognr, titel & forfatter:");
                    bogId = frafilinput.nextInt();
                    titel = frafilinput.next();
                    forfatter = frafilinput.next();
                    bib.tilfoejBog(bogId, titel, forfatter);
                    System.out.println(bib);
                    break;
                case 2:
                    System.out.println("Indtast låner nr og låner navn");
                    lnr = fralaanerfilinput.nextInt();
                    lnavn = fralaanerfilinput.next();
                    System.out.println(lListe);
                    lListe.tilfoejLaaner(lnr, lnavn);
                    System.out.println(lListe);
                case 3:
                    System.out.println("Indtast bognr og dato");
                    bogId = fratastetur.nextInt();
                    lnr = fralaanerfilinput.nextInt();
                    lnavn = fralaanerfilinput.next();
                    dato = fratastetur.next();
                    System.out.println(bib);

                    bib.udlaanBog(bogId, lnr, lnavn, dato);
                    System.out.println(bib);
                    break;
                case 4:
                    System.out.println("Indtast bognr");
                    bogId = fratastetur.nextInt();
                    bib.afleverBog(bogId);
                    System.out.println(bib);
                    break;
                case 5:
                    System.out.println("Indtast bognr");
                    bogId = fratastetur.nextInt();
                    bib.fjernBog(bogId);
                    System.out.println(bib);
                    break;
                case 8:
                    bib.indlaesAlleBoeger();
                    System.out.println(bib);
                    break;
            }

        }

        /*bib.tilfoejBog(1,"Titel1", "Forfatter1", false, "");
        bib.tilfoejBog(2,"Titel2", "Forfatter2", false, "");
        System.out.println(bib);
        bib.udlaanBog(1,1,"Rasmus", "30/10/2023");
        System.out.println(bib);*/

    }

        /*Bog bog1 = new Bog(1, "Software Solutions", "Lewis and Loftus", false, "", null);
        Bog bog2 = new Bog(2, "Core Java", "Horstman Cornell", false, "", null);
        Bog bog3 = new Bog(3, "Test", "forfatter", false, "", null);
        Laaner laaner1 = new Laaner(1, "Mikkel", "pellevænget 3", "");
        System.out.println(bog1);
        bog1.udlaanBog(laaner1, "11-11-2023");
        System.out.println(bog1);
        bog1.afleverBog();
        System.out.println(bog1);

        ArrayList<Bog> bogliste = new ArrayList<>();

        bogliste.add(bog1);
        udskrivBoeger(bogliste);
        bogliste.add(bog2);
        udskrivBoeger(bogliste);
        System.out.println(antalBoeger(bogliste));
        tilfoejBog(bogliste, bog3);
        udskrivBoeger(bogliste);
        System.out.println(antalBoeger(bogliste));
        fjernBog(bogliste, bog3);
        udskrivBoeger(bogliste);
        System.out.println(erIbogListen(bogliste, bog2));
        System.out.println(erIbogListen(bogliste, bog3));
        tilfoejBog(bogliste,4,"Harry Potter", "J.K Rowling", true, "31/9/2023", laaner1);
        ,

    }

    public static void udskrivBoeger(ArrayList<Bog> liste){
        System.out.println(liste);
    }

    public static void tilfoejBog(ArrayList<Bog> liste, Bog b){
        liste.add(b);
    }
    public static int antalBoeger(ArrayList<Bog> liste){
        return liste.size();
    }
    public static void fjernBog(ArrayList<Bog> liste,Bog b){
        liste.remove(b);
    }
    public static boolean erIbogListen(ArrayList<Bog> liste,Bog b){
        return liste.contains(b);
    }
    public static void tilfoejBog(ArrayList<Bog> liste,int nr, String t,String f,boolean u, String d,Laaner l) {
        liste.add(new Bog(nr, t, f, u, d, l));
    }*/
}