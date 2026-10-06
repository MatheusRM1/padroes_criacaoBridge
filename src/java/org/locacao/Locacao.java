package org.locacao;

public abstract class Locacao {

    protected double preco;
    protected Carro carro;
    protected Seguro seguro;
    protected Servico servico;

    public Locacao(FabricaAbstrata fabrica, double preco){

        this.preco = preco;
        this.seguro = fabrica.createSeguro();
        this.servico = fabrica.createServico();
    }

    public String emitirSeguro(){return seguro.emitirNota();}

    public String emitirServico(){ return  servico.emitirNota();}

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract double calcularValor();
}
