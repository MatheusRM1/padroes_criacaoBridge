package org.locacao;

public interface FabricaAbstrata {

    Seguro createSeguro();
    Servico createServico();
}
