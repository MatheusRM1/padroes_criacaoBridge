package org.locacao;

public class LocacaoDiaria extends Locacao {

    public LocacaoDiaria(FabricaAbstrata fabrica, double preco) {
        super(fabrica, preco);
    }

    @Override
    public double calcularValor() {
        return this.preco * (1 + this.carro.percentualPreco());
    }
}