package org.locacao;

public class LocacaoDiaria extends Locacao {

    public LocacaoDiaria(Carro carro, FabricaAbstrata fabrica) {
        super(carro, fabrica);
    }

    @Override
    public double calcularValor() {
        return carro.calcularValor();
    }
}