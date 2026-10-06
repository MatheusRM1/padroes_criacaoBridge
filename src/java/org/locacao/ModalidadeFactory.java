package org.locacao;

public class ModalidadeFactory {

    private ModalidadeFactory() {};

    private static ModalidadeFactory instance = new ModalidadeFactory();

    public static ModalidadeFactory getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabricaAbstrata(String fabrica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.locacao." + fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fabrica invalida");
        }
        return (FabricaAbstrata) objeto;
    }
}