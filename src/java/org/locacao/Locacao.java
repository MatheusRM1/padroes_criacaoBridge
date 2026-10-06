package org.locacao;

public class Locacao {

    private static Locacao instance;

    private Seguro seguro;
    private Servico servico;

    public Locacao(FabricaAbstrata fabrica){
        this.seguro = fabrica.createSeguro();
        this.servico = fabrica.createServico();
    }

    public String emitirSeguro(){return this.seguro.emitirNota();}

    public String emitirServico(){ return  this.servico.emitirNota();}

}
