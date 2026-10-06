import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.locacao.FabricaAbstrata;
import org.locacao.Locacao;
import org.locacao.ModalidadeFactory;

public class LocacaoTest {

    @Test
    void deveEmitirSeguroBasico() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance().obterFabricaAbstrata("FabricaBasica");
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Seguro Basico", locacao.emitirSeguro());
    }

    @Test
    void deveEmitirSeguroPremium() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance().obterFabricaAbstrata("FabricaPremium");
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Seguro Premium", locacao.emitirSeguro());
    }

    @Test
    void deveEmitirServicoBasico() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance().obterFabricaAbstrata("FabricaBasica");
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Servico Basico", locacao.emitirServico());
    }

    @Test
    void deveEmitirServicoPremium() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance().obterFabricaAbstrata("FabricaPremium");
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Servico Premium", locacao.emitirServico());
    }
}
