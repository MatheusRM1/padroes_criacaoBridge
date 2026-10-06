package org.locacao;

public class FabricaPremium implements FabricaAbstrata{

    @Override
    public Servico createServico() { return new ServicoPremium(); }

    @Override
    public Seguro createSeguro() { return new SeguroPremium(); }

}
