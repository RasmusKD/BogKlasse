import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bibliotek bib = new Bibliotek();
        bib.tilfoejBog(1,"Titel1", "Forfatter1", false, "");
        bib.tilfoejBog(2,"Titel2", "Forfatter2", false, "");
        System.out.println(bib);
        bib.udlaanBog(1,1,"Rasmus", "30/10/2023");
        System.out.println(bib);

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