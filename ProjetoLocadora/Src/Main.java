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



    }
}
