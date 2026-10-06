import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.locacao.Carro;
import org.locacao.CarroSedan;
import org.locacao.FabricaAbstrata;
import org.locacao.FabricaBasica;
import org.locacao.Locacao;
import org.locacao.LocacaoDiaria;
import org.locacao.ModalidadeFactory;

public class LocacaoTest {

    @Test
    void deveEmitirSeguroBasico() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance().obterFabricaAbstrata("FabricaBasica");
        Carro carro = new CarroSedan();
        Locacao locacao = new LocacaoDiaria(fabrica, 100.0);
        locacao.setCarro(carro);

        assertEquals("Seguro Basico", locacao.emitirSeguro());
    }

    @Test
    void deveEmitirSeguroPremium() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance().obterFabricaAbstrata("FabricaPremium");

        Carro carro = new CarroSedan();
        Locacao locacao = new LocacaoDiaria(fabrica, 100.0);
        locacao.setCarro(carro);

        assertEquals("Seguro Premium", locacao.emitirSeguro());
    }

    @Test
    void deveEmitirServicoBasico() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance().obterFabricaAbstrata("FabricaBasica");
        Carro carro = new CarroSedan();
        Locacao locacao = new LocacaoDiaria(fabrica, 100.0);
        locacao.setCarro(carro);

        assertEquals("Servico Basico", locacao.emitirServico());
    }

    @Test
    void deveEmitirServicoPremium() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance().obterFabricaAbstrata("FabricaPremium");
        Carro carro = new CarroSedan();
        Locacao locacao = new LocacaoDiaria(fabrica, 100.0);
        locacao.setCarro(carro);

        assertEquals("Servico Premium", locacao.emitirServico());
    }
}