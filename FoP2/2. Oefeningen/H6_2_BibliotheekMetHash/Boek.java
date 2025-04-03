package H6_2_BibliotheekMetHash;

public class Boek {

    private final String titel;
    private final String auteur;
    private final String isbn;
    private final int idNummer;
    private boolean status; // true = aanwezig

    public Boek(String titel, String auteur, String isbn, int idNummer) {
        this.titel = titel;
        this.auteur = auteur;
        this.isbn = isbn;
        this.idNummer = idNummer;
        this.status = true; // beschikbaar
    }

    public int getIdNummer() {
        return idNummer;
    }

    public void wijzigStatus() {
        this.status = !this.status;
    }

    public boolean isBeschikbaar() {
        return this.status;
    }

    public String toString() {
        return idNummer + ": " + titel + " van " + auteur + " (" + isbn + ")";
    }

}