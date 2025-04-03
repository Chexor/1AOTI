package H6_1_LageEmissieZone;

import java.util.HashMap;

public class LezChecker {

    private final HashMap<String, Auto> autos = new HashMap<>();

    public void inschrijvenAuto(Auto auto) {
        autos.put(auto.getNummerplaat(), auto);
    }

    public void uitschrijvenAuto(String nummerplaat) {
        autos.remove(nummerplaat);
    }

    public String controleerLezAntwerpen(String nummerplaat) {

        Auto auto = autos.get(nummerplaat);

        if (auto == null) {
            return "Nummerplaat onbekend.";
        }

        Auto.Brandstof brandstof = auto.getBrandstof();
        int euronorm = auto.getEuronorm();

        switch (brandstof) {
            case ELEKTRISCH -> {
                return "Toegang";
            }
            case DIESEL -> {
                if (euronorm >= 5) return "Toegang";
                if (euronorm == 4) return "Toegang na betaling";
                return "Toegang met LEZ-dagpas";
            }
            case BENZINE -> {
                if (euronorm >= 3) return "Toegang";
                return "Toegang met LEZ-dagpas";
            }
            default -> {
                return "Nummerplaat onbekend"; //fallback, zou niet mogen gebeuren met enums
            }
        }
    }
}
