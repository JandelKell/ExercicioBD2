public class VeiculoMedio extends Veiculo implements VeiculoAluguel {

    public VeiculoMedio() {
        this.valor = 150;
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


