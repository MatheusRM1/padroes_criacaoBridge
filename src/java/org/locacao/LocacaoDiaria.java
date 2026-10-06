package org.locacao;

public class LocacaoDiaria extends Locacao {

    public LocacaoDiaria(FabricaAbstrata fabrica) {
        super(fabrica);
    }

    @Override
    public double calcularValor() {
        return carro.calcularValor();
    }
}