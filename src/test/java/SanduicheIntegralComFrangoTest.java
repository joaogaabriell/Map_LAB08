import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SanduicheIntegralComFrangoTest {

    private final SanduicheIntegralComFrango sanduiche = new SanduicheIntegralComFrango();

    @Test
    public void testIngredientes() {
        assertEquals("Pão Integral", sanduiche.criarPao().tipoPao());
        assertEquals("Queijo Prato", sanduiche.criarQueijo().tipoQueijo());
        assertEquals("Presunto de Frango", sanduiche.criarPresunto().tipoPresunto());
        assertEquals("Ovo de Granja", sanduiche.criarOvo().tipoOvo());
    }

    @Test
    public void testMontarSanduiche() {
        assertDoesNotThrow(sanduiche::montarSanduiche);
    }
}
