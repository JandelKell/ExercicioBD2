import java.util.Scanner;

public class ClientEntrada implements Cliente{
    @Override
    public PessoasAluguel getclient() {
        PessoasAluguel cliente;
        System.out.println("Digite - 1 para pessoa Física, 2- para pessoa jurídica");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()){
            case 1:
                cliente = new PessoaFisica();
                return cliente;
            case 2:
                cliente = new PessoaJuridica();
                return cliente;
            default:
                throw new RuntimeException("Entrada invalida");
        }
    }



}
