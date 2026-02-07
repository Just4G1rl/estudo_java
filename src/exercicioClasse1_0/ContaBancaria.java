/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioClasse1_0;

/**
 *
 * @author Barbara
 */
public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    
    public ContaBancaria(){
        
    }
    
    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }
    public ContaBancaria(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getDeposito() {
        return saldo;
    }
    
    @Override
    public String toString() {
        return "ContaBancaria: " 
                + "numeroConta=" + numeroConta + 
                ", nomeTitular=" + nomeTitular + 
                ", saldo atual=" + String.format("%.2f",saldo);
    }
    
     public void deposito(double valor){
          saldo+=valor;
     }
     
     public void saque(double valor){
          saldo = saldo - (valor + 5.00);
     }
}
