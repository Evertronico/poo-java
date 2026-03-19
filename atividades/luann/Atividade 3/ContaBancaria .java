package negocios;

import java.util.jar.JarOutputStream;

public class Produto {
    private double deposito;
    private double saque;  /// dificil para caramba fazer aqui custei fazer ta everaldo 
    private double saldo;
    
    public ContaBancaria(double deposito, double saque) {
        setDeposito(deposito);
        setSaque(saque);
    }

    public double getDeposito(){
        return this.deposito;
    }

    public void setDeposito(double deposito){
        if (deposito <= 0){
            throw new IllegalArgumentException("valor de deposito tem que ser maior que zero");
        }
        this.saldo += deposito;
    }

    puplic void getSaque(){
        return this.saque;
    }

    public void setSaque(double saque){
        if (saque <= 0){
            throw new IllegalArgumentException("valor de saque tem que ser maior que zero");
        }
        if (saque > this.saldo){
            throw new IllegalArgumentException("valor de saque maior que o saldo disponivel");
        }
        this.saldo -= saque;
    }
}
