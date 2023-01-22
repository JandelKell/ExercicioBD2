package Veiculos;

import java.util.Scanner;

public class CarroEntrada implements Carro{
    @Override
    public VeiculoAluguel getcarro() {
        VeiculoAluguel carro;
        System.out.println("Digite para os veiculos - 1 para pequeno, 2- para pessoa medios e 3- para SUV");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()){
            case 1:
                carro = new VeiculoPequeno();
                return carro;
            case 2:
                carro = new VeiculoMedio();
                return carro;
            case 3:
                carro = new VeiculoSuv();
                return carro;
            default:
                throw new RuntimeException("Entrada invalida");
        }
    }
}
