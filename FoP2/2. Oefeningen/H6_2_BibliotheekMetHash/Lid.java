package H6_2_BibliotheekMetHash;

public class Lid {

    private final String naam;
    private String adres;
    private String gemeente;

    public Lid(String naam, String adres, String gemeente) {
        this.naam = naam;
        this.adres = adres;
        this.gemeente = gemeente;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return naam + ", " + adres + " " + gemeente;
    }
}
