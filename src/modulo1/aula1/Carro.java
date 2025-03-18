package modulo1.aula1;

import javax.swing.JOptionPane;

public class Carro {
    // atributos da classe
    public String marca;
    public String modelo;
    public String cor;
    public int anoFabricacao;

    public Carro(String marca, String modelo, String cor, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    public Carro(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void ligar() {
        JOptionPane.showMessageDialog(null, this.modelo + " Ligou");
    }
}
