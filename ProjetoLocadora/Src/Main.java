import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Carro carro1 = new Carro("Porsche", "Cayanne", 2027, "vvv-7777", 2350, 2);
//
//        System.out.println(carro1); //Se quiser que apareca tudo, tem que mudar la na classe veiculo (toString / exibirDados)
//
//        Moto moto1 = new Moto("Kawasaki", "Ninja 300", 2025, "vvv-7778", 400, 296);
//
//        System.out.println(moto1);

        Locadora locadora = new Locadora();


        locadora.adicionarVeiculo(new Carro("Porsche", "Cayanne",
                2027, "vvv-7777", 2350, 2));
        locadora.adicionarVeiculo(new Moto("Kawasaki", "Ninja 300",
                2025, "vvv-7778", 400, 296));
//        locadora.adicionarVeiculo(carro1);
//        locadora.adicionarVeiculo(moto1);

        locadora.listarVeiculo();


        int tamanho = locadora.getFrota().size(); //retornando o valor do tamanho frota de outra classe para main

        Scanner read = new Scanner(System.in);

        System.out.println("Escolha um veiculo que voce queira alugar de 1 a " +tamanho+ ": " );
        int veiculoEscolhido = read.nextInt();

        System.out.println("Quantos dias voce vai querer alugar? : ");
        int dias = read.nextInt();

        locadora.aluguelVeiculo(dias, veiculoEscolhido); //Conseguimos usar as chaves necessarias com o scanner


    }
}
