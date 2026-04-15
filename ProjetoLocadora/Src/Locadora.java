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

    public List<Veiculo> getFrota() { //Criado para criar um tamanho e mandar para o main
        return frota;
    }

    public void listarVeiculo(){
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            System.out.printf("\n[%d] %s %s | Diaria: R$ %.2f" ,(i+1), v.getMarca(), v.getModelo() , v.calcularDiaria());
        }
        System.out.println("\n========================================================\n");
    }

    public void aluguelVeiculo(int dias, int idVeiculo){     //Como funciona os
        // valores entre o parenteses: no main voce vai pedir os valores em ordem respectivamente para ser reescrito e ler eles.

        Veiculo v = frota.get(idVeiculo - 1);
        double total = v.calcularDiaria() * dias;


        System.out.println(" ======= Resumo do aluguel veiculo =======");
        System.out.println("Veiculo: " +v.exibirDados());
        System.out.println("Quantidade de dias: " +dias);
        System.out.printf("Valor diario: %.2f " ,v.calcularDiaria());
        System.out.printf("\nTotal do periodo da regencia: R$ %.2f " ,total);

    }

}
