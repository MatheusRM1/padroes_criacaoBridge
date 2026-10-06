package org.locacao;

public abstract class Locacao {

    protected Carro carro;
    protected Seguro seguro;
    protected Servico servico;

    public Locacao(Carro carro, FabricaAbstrata fabrica){

        this.carro = carro;
        this.seguro = fabrica.createSeguro();
        this.servico = fabrica.createServico();
    }

    public String emitirSeguro(){return seguro.emitirNota();}

    public String emitirServico(){ return  servico.emitirNota();}

    public String getCarro() {
        return carro.getDescricao();
    }

    public double calcularValor() {
        return carro.calcularValor();
    }

}
