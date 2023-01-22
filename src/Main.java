import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente clientEntrada = new ClientEntrada();
        PessoasAluguel pessoa = clientEntrada.getclient();
        Carro carro = new CarroEntrada();
        VeiculoAluguel veiculo = carro.getcarro();
        System.out.println("digite as diarias");
        int diarias = scan.nextInt();
        Alugel aluguel = new AluguelVeiculo(pessoa.getTipo(), veiculo.getTipo(), diarias, veiculo.getValor());
        System.out.println("o valor base do aluguel é" + veiculo.getValor());
        System.out.println("valor com desconto:"+ aluguel.getValor());
    }
}