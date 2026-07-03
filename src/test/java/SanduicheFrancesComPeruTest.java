import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SanduicheFrancesComPeruTest {

    private final SanduicheFrancesComPeru sanduiche = new SanduicheFrancesComPeru();

    @Test
    public void testIngredientes() {
        assertEquals("Pão Francês", sanduiche.criarPao().tipoPao());
        assertEquals("Queijo Mussarela", sanduiche.criarQueijo().tipoQueijo());
        assertEquals("Presunto de Peru", sanduiche.criarPresunto().tipoPresunto());
        assertEquals("Ovo de Capoeira", sanduiche.criarOvo().tipoOvo());
    }

    @Test
    public void testMontarSanduiche() {
        assertDoesNotThrow(sanduiche::montarSanduiche);
    }
}
