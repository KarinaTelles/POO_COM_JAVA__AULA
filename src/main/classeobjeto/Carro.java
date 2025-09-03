package src.main.classeobjeto;

public class Carro extends Veiculo implements Eletric{
    private String marca;
    private String modelo;
    private int ano;
    private int quantidadeDePortas;

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    //Classe Carro.java
    @Override
    public void ligar(){
        System.out.println("Carro ligado!");
    }
    @Override
    public String toString() {
        return "Carro: {" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }

    @Override
    public void carregar() {
        System.out.println("Carregando...");
    }
}