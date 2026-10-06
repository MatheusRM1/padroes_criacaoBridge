package org.locacao;

public class LocacaoSemanal extends Locacao {

    public LocacaoSemanal(FabricaAbstrata fabrica, double preco) {
        super(fabrica, preco);
    }

    @Override
    public double calcularValor() {
        return this.preco * (1 + this.carro.percentualPreco());
    }
}