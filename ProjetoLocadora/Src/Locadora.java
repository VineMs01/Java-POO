import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {
    private List<Veiculo> frota;

    public Locadora() {
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo (Veiculo veiculo){
        frota.add(veiculo);
    }

    public void listarVeiculo(){
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);

            System.out.printf("\n[%d] %s %s | Diaria: R$ %.2f" ,(i+1), v.getMarca(), v.getModelo() , v.calcularDiaria());
        }
        System.out.println("\n========================================================\n");
    }
    public void alugarVeiculo(){
        System.out.println("Bem vindo a locadora de veiculos.");
        System.out.println("Qual veiculo voce quer alugar?");
        Scanner read = new Scanner(System.in);
        int opcao = read.nextInt();

        System.out.println("Quantos dias voce quer alugar o veiculo?");
        int dias = read.nextInt();

        while (true) {

            if (opcao == 1) {



                break;
            } else if (opcao == 2) {


                break;
            } else {
                System.out.println("Opcao invalida, tente novamente: ");
            }
        }
    }

}
