package org.locacao;

public class CarroSedan implements Carro{

    @Override
    public String getDescricao() {
        return "Carro Sedan";
    }

    @Override
    public double calcularValor() {
        return 100;
    }
}
