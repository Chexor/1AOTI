package H6_2_BibliotheekMetHash;

public class Ontlening {

    private final Lid lid;
    private final Boek boek;

    public Ontlening(Lid lid, Boek boek) {
        this.lid = lid;
        this.boek = boek;
    }

    public Boek getBoek() {
        return boek;
    }

    public Lid getLid() {
        return lid;
    }

    public String toString() {
        return boek.toString() + " is uitgeleend aan " + lid.toString();
    }
}
