public class Moto extends Veiculo {
    //Um novo atributo = cilindrada
    //se cilindrada >300 : acrescimo de 15%

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, String placa, double precoBase, int cilindradas) {
        super(marca, modelo, ano, placa, precoBase);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularDiaria(){
        //Moto com mais de 300 cilindradas tera acrescimo de 15%
        if (cilindradas > 300){
            return getPrecoBase() * 1.15;
        }

        return getPrecoBase();
    }

    @Override
    public String toString(){
        return super.exibirDados() + "  " + cilindradas + " cc";
    }
}
