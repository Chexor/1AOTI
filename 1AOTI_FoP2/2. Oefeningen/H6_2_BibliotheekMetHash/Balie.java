package H6_2_BibliotheekMetHash;

import java.util.ArrayList;
import java.util.Iterator;

public class Balie {

    private final ArrayList<Boek> boeken;
    private final ArrayList<Lid> leden;
    private final ArrayList<Ontlening> ontleningen;

    public Balie () {
        this.boeken = new ArrayList<>();
        this.leden = new ArrayList<>();
        this.ontleningen = new ArrayList<>();
    }

    public void toevoegenBoek(Boek boek) {
        boeken.add(boek);
    }

    public void toevoegenLid(Lid lid) {
        leden.add(lid);
    }

    public void ontleen(Lid lid, Boek boek) {
        if (boek.isBeschikbaar()) {
            ontleningen.add(new Ontlening(lid, boek));
            boek.wijzigStatus();
        } else {
            System.out.println("Boek is niet beschikbaar");
        }
    }

    public void brengTerug(int idNummer) {
        Iterator<Ontlening> it = ontleningen.iterator();
        while (it.hasNext()) {
            Ontlening ontlening = it.next();
            if(ontlening.getBoek().getIdNummer() == idNummer) {
                it.remove();
                ontlening.getBoek().wijzigStatus();
            }
        }
    }

    public void printOverzichtGeleendeBoeken() {
        System.out.println("Uitgeleende boeken:");
        boolean isGevonden = false;

        for (Ontlening ontlening : ontleningen ) {
            if (!ontlening.getBoek().isBeschikbaar()) {
                System.out.println("- " + ontlening.toString());
                isGevonden = true;
            }
        }
        if (!isGevonden) {
            System.out.println("(Geen)");
        }
    }

    public void printOverzichtAanwezigeBoeken() {
        System.out.println("Beschikbare boeken:");
        boolean isGevonden = false;

        for (Boek boek : boeken ) {
            if (boek.isBeschikbaar()) {
                System.out.println("- " + boek.toString());
                isGevonden = true;
            }
        }
        if (!isGevonden) {
            System.out.println("(Geen)");
        }
    }

    public void printOntleendeBoekenVanPersoon(String lidNaam) {
        System.out.println("Boeken uitgeleend aan " + lidNaam + ":");
        boolean isGevonden = false;

        for (Ontlening ontlening : ontleningen ) {
            Lid lid = ontlening.getLid();
            Boek boek = ontlening.getBoek();
            if (lid.getNaam().equals(lidNaam) && !boek.isBeschikbaar()) {
                System.out.println("- " + boek.toString());
                isGevonden = true;
            }
        }
        if (!isGevonden) {
            System.out.println("(Geen)");
        }
    }
}