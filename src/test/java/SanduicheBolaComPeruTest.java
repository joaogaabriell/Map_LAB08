import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SanduicheBolaComPeruTest {

    private final SanduicheBolaComPeru sanduiche = new SanduicheBolaComPeru();

    @Test
    public void testIngredientes() {
        assertEquals("Pão Bola", sanduiche.criarPao().tipoPao());
        assertEquals("Queijo Cheddar", sanduiche.criarQueijo().tipoQueijo());
        assertEquals("Presunto de Peru", sanduiche.criarPresunto().tipoPresunto());
        assertEquals("Ovo de Granja", sanduiche.criarOvo().tipoOvo());
    }

    @Test
    public void testMontarSanduiche() {
        assertDoesNotThrow(sanduiche::montarSanduiche);
    }
}
