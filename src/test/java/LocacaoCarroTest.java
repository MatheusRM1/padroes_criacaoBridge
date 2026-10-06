import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.locacao.Carro;
import org.locacao.CarroHatch;
import org.locacao.CarroSedan;
import org.locacao.FabricaAbstrata;
import org.locacao.LocacaoDiaria;
import org.locacao.LocacaoSemanal;
import org.locacao.ModalidadeFactory;

public class LocacaoCarroTest {

    @Test
    void deveRetornarValorDaLocacaoDiariaComCarroSedan() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance().obterFabricaAbstrata("FabricaBasica");

        Carro carro = new CarroSedan();
        LocacaoDiaria locacao = new LocacaoDiaria(fabrica);
        locacao.setCarro(carro);

        assertEquals(100.0, locacao.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarValorDaLocacaoDiariaComCarroHatch() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance()
                .obterFabricaAbstrata("FabricaBasica");

        Carro carro = new CarroHatch();
        LocacaoDiaria locacao = new LocacaoDiaria(fabrica);
        locacao.setCarro(carro);

        assertEquals(80.0, locacao.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarValorDaLocacaoSemanalComCarroSedan() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance()
                .obterFabricaAbstrata("FabricaBasica");

        Carro carro = new CarroSedan();
        LocacaoSemanal locacao = new LocacaoSemanal(fabrica);
        locacao.setCarro(carro);

        assertEquals(3000.0, locacao.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarValorDaLocacaoSemanalComCarroHatch() {
        FabricaAbstrata fabrica = ModalidadeFactory.getInstance()
                .obterFabricaAbstrata("FabricaBasica");

        Carro carro = new CarroHatch();
        LocacaoSemanal locacao = new LocacaoSemanal(fabrica);
        locacao.setCarro(carro);

        assertEquals(2400.0, locacao.calcularValor(), 0.01);
    }
}