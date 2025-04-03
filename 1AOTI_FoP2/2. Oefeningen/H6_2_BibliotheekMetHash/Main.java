package H6_2_BibliotheekMetHash;

public class Main {
    public static void main(String[] args) {
        // Maak een nieuwe balie
        Balie balie1 = new Balie();

        // Voeg 8 leden toe
        Lid lid1 = new Lid("Emma Janssens", "Korenmarkt 12", "Gent");
        Lid lid2 = new Lid("Lucas Peeters", "Stationsstraat 45", "Brugge");
        Lid lid3 = new Lid("Marie De Smet", "Meir 3", "Antwerpen");
        Lid lid4 = new Lid("Noah Van den Broeck", "Nieuwstraat 88", "Brussel");
        Lid lid5 = new Lid("Lotte Vermeulen", "Zonnestraat 5", "Leuven");
        Lid lid6 = new Lid("Milan Claes", "Grote Markt 7", "Mechelen");
        Lid lid7 = new Lid("Julie Maes", "Dorpstraat 22", "Hasselt");
        Lid lid8 = new Lid("Finn Willems", "Kerkstraat 10", "Kortrijk");

        balie1.toevoegenLid(lid1);
        balie1.toevoegenLid(lid2);
        balie1.toevoegenLid(lid3);
        balie1.toevoegenLid(lid4);
        balie1.toevoegenLid(lid5);
        balie1.toevoegenLid(lid6);
        balie1.toevoegenLid(lid7);
        balie1.toevoegenLid(lid8);

        // Voeg 10 boeken toe
        Boek boek1 = new Boek("De meeste mensen deugen", "Rutger Bregman", "9789082942187", 1001);
        Boek boek2 = new Boek("Sapiens", "Yuval Noah Harari", "9789400503887", 1002);
        Boek boek3 = new Boek("Het achtste leven", "Nino Haratischwili", "9789044538506", 1003);
        Boek boek4 = new Boek("De jongen, de mol, de vos en het paard", "Charlie Mackesy", "9789026623846", 1004);
        Boek boek5 = new Boek("Otmars zonen", "Peter Buwalda", "9789041426318", 1005);
        Boek boek6 = new Boek("Het lied van ooievaar en dromedaris", "Anjet Daanje", "9789025473268", 1006);
        Boek boek7 = new Boek("De Alchemist", "Paulo Coelho", "9789029510358", 1007);
        Boek boek8 = new Boek("De donkere kamer van Damokles", "Willem Frederik Hermans", "9789028203473", 1008);
        Boek boek9 = new Boek("De ontdekking van de hemel", "Harry Mulisch", "9789023412818", 1009);
        Boek boek10 = new Boek("Joe Speedboot", "Tommy Wieringa", "9789023419756", 1010);

        balie1.toevoegenBoek(boek1);
        balie1.toevoegenBoek(boek2);
        balie1.toevoegenBoek(boek3);
        balie1.toevoegenBoek(boek4);
        balie1.toevoegenBoek(boek5);
        balie1.toevoegenBoek(boek6);
        balie1.toevoegenBoek(boek7);
        balie1.toevoegenBoek(boek8);
        balie1.toevoegenBoek(boek9);
        balie1.toevoegenBoek(boek10);

        // Ontleningen
        balie1.ontleen(lid1, boek1);
        balie1.ontleen(lid1, boek2);
        balie1.ontleen(lid2, boek3);
        balie1.ontleen(lid3, boek4);
        balie1.ontleen(lid4, boek5);
        balie1.ontleen(lid5, boek6);
        balie1.ontleen(lid6, boek7);
        balie1.ontleen(lid7, boek8);
        balie1.ontleen(lid8, boek9);
        balie1.ontleen(lid8, boek10);

        System.out.println("\n--- OVERZICHT NA ONTLENING ---");
        balie1.printOverzichtGeleendeBoeken();
        System.out.println(" ");
        balie1.printOverzichtAanwezigeBoeken();
        System.out.println(" ");

        // Terugbrengen van enkele boeken
        balie1.brengTerug(1002); // boek2
        balie1.brengTerug(1005); // boek5
        balie1.brengTerug(1007); // boek7

        System.out.println("\n--- OVERZICHT NA TERUGBRENGEN ---");
        balie1.printOverzichtGeleendeBoeken();
        System.out.println(" ");
        balie1.printOverzichtAanwezigeBoeken();
        System.out.println(" ");

        // Overzicht van boeken van specifieke leden
        balie1.printOntleendeBoekenVanPersoon("Emma Janssens");
        System.out.println(" ");
        balie1.printOntleendeBoekenVanPersoon("Finn Willems");
        System.out.println(" ");
        balie1.printOntleendeBoekenVanPersoon("Lotte Vermeulen");
    }
}
