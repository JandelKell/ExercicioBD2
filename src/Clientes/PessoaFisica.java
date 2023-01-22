package Clientes;

public class PessoaFisica extends Pessoas implements PessoasAluguel{
    public PessoaFisica() {
        this.tipopessoa = "fisica";
    }

    @Override
    public String getTipo(){
        return this.tipopessoa;
    }
}
