package Veiculos;

public interface Carro {
    default VeiculoAluguel getcarro(){
        return null;
    }
}
