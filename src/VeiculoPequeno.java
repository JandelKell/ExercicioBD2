public class VeiculoPequeno extends Veiculo implements VeiculoAluguel {

    public VeiculoPequeno() {
        this.tipocarro = "pegueno";
        this.valor = 100;
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
