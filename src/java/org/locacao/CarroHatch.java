package org.locacao;

public class CarroHatch implements Carro {

    @Override
    public String getDescricao() {
        return "Carro Hatch";
    }

    @Override
    public double calcularValor() {
        return 80;
    }
}
