public class LocacaoSemanal extends Locacao {

    public LocacaoSemanal(Carro carro, FabricaAbstrata fabrica) {
        super(carro, fabrica);
    }

    @Override
    public double calcularValor() {
        return carro.calcularValor() * 30;
    }
}