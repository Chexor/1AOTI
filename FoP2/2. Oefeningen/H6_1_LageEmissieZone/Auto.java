package H6_1_LageEmissieZone;

public class Auto {

    private final String nummerplaat;
    private final String merk;
    private final String kleur;
    private final int euronorm;
    private final Brandstof brandstof;

    public Auto(String nummerplaat, String merk, String kleur, int euronorm, Brandstof brandstof) {
        this.nummerplaat = nummerplaat;
        this.merk = merk;
        this.kleur = kleur;
        this.euronorm = checkEuronorm(euronorm);
        this.brandstof = brandstof;
    }

    private int checkEuronorm(int euronorm) {
        if (euronorm < 1) {
            System.out.println("Euronorm kan niet lager zijn dan 1");
            return 1;
        } else if (euronorm > 6) {
            System.out.println("Euronorm kan niet hoger zijn dan 6");
            return 6;
        } else {
            return euronorm;
        }
    }

    public enum Brandstof {
        DIESEL, BENZINE, ELEKTRISCH;
    }

//    private String checkBrandstof(String brandstof) {
//        brandstof = formatInput(brandstof);
//        if (brandstof.equalsIgnoreCase("Diesel")
//                || brandstof.equalsIgnoreCase("Benzine")
//                || brandstof.equalsIgnoreCase("Elektrisch")) {
//            return brandstof;
//        } else {
//            System.out.println("Ongeldige invoer brandstof.");
//            return null;
//        }
//    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public String getMerk() {
        return merk;
    }

    public String getKleur() {
        return kleur;
    }

    public int getEuronorm() {
        return euronorm;
    }

    public Brandstof getBrandstof() {
        return brandstof;
    }

    private static String formatInput(String input) {
        if (input == null || input.isBlank()) return "";

        input = input.trim();
        return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }


}
