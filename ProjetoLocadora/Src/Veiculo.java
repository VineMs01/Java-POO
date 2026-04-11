// SISTEMA DE VEICULOS - 4 pilares da POO em Java
// Uma locadora de veiculos precisa calcular o valor da diaria
// de diferentes tipos de veiculos (Carro e moto).
// Cada tipo tem seu proprio calculo

//PILAR 1 - ABSTRACAO
//MODELAR APENAS O QUE IMPORTA: marca, modelo, ano, placa, preco base.
//METODO calcularDiaria()
// abstrato pois cada veiculo tera sua propria diaria (calculo)

abstract class Veiculo {

    //Atributos protegidos -> Encapsulamentos
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double precoBase;

    public Veiculo(String marca, String modelo, int ano, String placa, double precoBase){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.precoBase = precoBase;

    }

    /// metodo abstrato - CADA SUBTIPO DEFINE O CALCULO
    public abstract double calcularDiaria();

    //PILAR 2 - ENCAPSULAMENTO
    //MODIFICADORES VIA GETTERS E SETTER
    //O SETTER DE PRECOBASE TEM VALIDACAO: NAO ACEITA VALORES NEGATIVOS

    public String getMarca (){
        return marca;
    }

    public String getModelo (){
        return modelo;
    }

    public String getPlaca (){
        return placa;
    }

    public int getAno  (){
        return ano;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public void setPrecoBase(double precoBase){
        if (precoBase < 0){
            System.out.println("Erro: preco nao pode ser negativo");
            return;
        }
        this.precoBase = precoBase;
    }

    public String exibirDados() {
        return marca + " " + modelo + " (" + ano + ")  " + placa +" " + precoBase;
    }
}

// PILAR 3 - HERANCA
// Carro e Moto herdam tudo do veiculo, mas cada um adiciona
// seus proprios atributos e implementa calcularDiaria() do seu jeito.

//CARRO -> qtdPortas (atributo)
// metodo calcularDiaria -> se qtdPortas >= 4 entao acrescimo de 20%

//abstract class Carro extends Veiculo {
//    private int quantidadePortas;
//
//    public Carro(String marca, String modelo, int ano, String placa, double precoBase, int quantidadePortas){
//        super(marca, modelo, ano, placa, precoBase);
//        this.quantidadePortas = quantidadePortas;
//  }
