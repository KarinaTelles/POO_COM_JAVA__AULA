package src.main;

import src.main.classeobjeto.Carro;

public class Main {
    public static void main(String[]args){
        Carro dolphin = new Carro();
        Carro corollaCross = new Carro();

        dolphin.setAno(2023);
        dolphin.setMarca("BYD");
        dolphin.setModelo("Dolphin");

        corollaCross.setAno(2022);
        corollaCross.setMarca("Toyota");
        corollaCross.setModelo("Corolla Cross");

        System.out.println(dolphin.toString());
        System.out.println(corollaCross.toString());
        dolphin.ligar();
        dolphin.mover();
        dolphin.acelerar();
        dolphin.freiar();
    }
}
