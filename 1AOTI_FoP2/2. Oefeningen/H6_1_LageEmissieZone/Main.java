package H6_1_LageEmissieZone;

public class Main {
    public static void main(String[] args) {
        LezChecker checker = new LezChecker();

        Auto a1 = new Auto("1ABC123", "Volvo", "Zwart", 6, Auto.Brandstof.DIESEL);
        Auto a2 = new Auto("2DEF456", "BMW", "Grijs", 4, Auto.Brandstof.DIESEL);
        Auto a3 = new Auto("3GHI789", "Audi", "Blauw", 2, Auto.Brandstof.DIESEL);
        Auto a4 = new Auto("4JKL012", "Toyota", "Rood", 3, Auto.Brandstof.BENZINE);
        Auto a5 = new Auto("5MNO345", "Honda", "Groen", 2, Auto.Brandstof.BENZINE);
        Auto a6 = new Auto("6PQR678", "Tesla", "Wit", 6, Auto.Brandstof.ELEKTRISCH);
        Auto a7 = new Auto("7STU901", "Renault", "Zilver", 5, Auto.Brandstof.DIESEL);

        checker.inschrijvenAuto(a1);
        checker.inschrijvenAuto(a2);
        checker.inschrijvenAuto(a3);
        checker.inschrijvenAuto(a4);
        checker.inschrijvenAuto(a5);
        checker.inschrijvenAuto(a6);
        checker.inschrijvenAuto(a7);

        System.out.println("LEZ check Antwerpen:");
        System.out.println(a1.getNummerplaat() + ": " + checker.controleerLezAntwerpen(a1.getNummerplaat()));
        System.out.println(a2.getNummerplaat() + ": " + checker.controleerLezAntwerpen(a2.getNummerplaat()));
        System.out.println(a3.getNummerplaat() + ": " + checker.controleerLezAntwerpen(a3.getNummerplaat()));
        System.out.println(a4.getNummerplaat() + ": " + checker.controleerLezAntwerpen(a4.getNummerplaat()));
        System.out.println(a5.getNummerplaat() + ": " + checker.controleerLezAntwerpen(a5.getNummerplaat()));
        System.out.println(a6.getNummerplaat() + ": " + checker.controleerLezAntwerpen(a6.getNummerplaat()));
        System.out.println(a7.getNummerplaat() + ": " + checker.controleerLezAntwerpen(a7.getNummerplaat()));

        System.out.println("\nUitschrijven auto: " + a5.getNummerplaat());
        checker.uitschrijvenAuto(a5.getNummerplaat());

        System.out.println("Opnieuw controleren:");
        System.out.println(a5.getNummerplaat() + ": " + checker.controleerLezAntwerpen(a5.getNummerplaat()));
    }
}
