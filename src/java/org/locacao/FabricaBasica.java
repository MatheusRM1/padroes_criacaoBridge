package org.locacao;

public class FabricaBasica implements FabricaAbstrata{

    @Override
    public Servico createServico() { return new ServicoBasico(); }

    @Override
    public Seguro createSeguro() { return new SeguroBasico(); }

}
