package Veiculos;

public class VeiculoSuv extends Veiculo implements VeiculoAluguel {
    public VeiculoSuv() {
        this.tipocarro = "SUV";
        this.valor = 200;
    }

    @Override
    public double getValor() {

        return this.valor;
    }
    @Override
    public String getTipo() {
        return this.tipocarro;
    }
}
