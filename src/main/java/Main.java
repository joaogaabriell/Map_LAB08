public class Main {
    public static void main(String[] args) {
        Sanduiche[] sanduiches = {
                new SanduicheFrancesComPeru(),
                new SanduicheIntegralComFrango(),
                new SanduicheBolaComPeru()
        };

        for (Sanduiche sanduiche : sanduiches) {
            sanduiche.montarSanduiche();
        }
    }
}
