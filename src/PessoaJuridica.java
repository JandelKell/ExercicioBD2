public class PessoaJuridica extends Pessoas implements PessoasAluguel{

    public PessoaJuridica() {
        this.tipopessoa = "juridica";
    }

    @Override
    public String getTipo(){
        return this.tipopessoa;
    }
}
