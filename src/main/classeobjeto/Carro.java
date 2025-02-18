package src.main.classeobjeto;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }
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

    @Override
    public String toString() {
        return "Carro: {" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}