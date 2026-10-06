package org.locacao;

public class LocacaoSemanal extends Locacao {

    public LocacaoSemanal(FabricaAbstrata fabrica) {
        super(fabrica);
    }

    @Override
    public double calcularValor() {
        return carro.calcularValor() * 30;
    }
}