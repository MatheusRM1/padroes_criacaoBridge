package org.locacao;

public abstract class Locacao {

    protected Carro carro;
    protected Seguro seguro;
    protected Servico servico;

    public Locacao(FabricaAbstrata fabrica){

        this.seguro = fabrica.createSeguro();
        this.servico = fabrica.createServico();
    }

    public String emitirSeguro(){return seguro.emitirNota();}

    public String emitirServico(){ return  servico.emitirNota();}

    public String getCarro() {
        return carro.getDescricao();
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public double calcularValor() {
        return carro.calcularValor();
    }

}
