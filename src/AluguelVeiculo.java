public class AluguelVeiculo implements Alugel{
    String tipopessoa;
    String tipocarro;
    int diarias;
    double valor;
    double desconto;

    public AluguelVeiculo(String tipopessoa, String tipocarro, int diarias, double valor) {
        this.tipopessoa = tipopessoa;
        this.tipocarro = tipocarro;
        this.diarias = diarias;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        if(tipopessoa.equalsIgnoreCase("juridica")&&(diarias>3)){
        desconto = 0.9;
        } else if(tipopessoa.equalsIgnoreCase("fisica")&&(diarias>5)) {
            desconto = 0.95;
        }else {
            desconto = 1;
        }

        return this.valor*desconto;
    }
}
