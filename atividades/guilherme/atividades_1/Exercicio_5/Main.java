package Exercicio_5;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 2000.0);
        
        System.out.println(f.getNome());
        System.out.println(f.getSalario());
        
        f.aplicarAumento(10.0);
        System.out.println(f.getSalario());
        
        f.aplicarAumento(-5.0);
        System.out.println(f.getSalario());
    }
}
