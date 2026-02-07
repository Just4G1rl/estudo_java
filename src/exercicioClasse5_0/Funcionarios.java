/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioClasse5_0;

/**
 *
 * @author Barbara
 */
public class Funcionarios {
    public String nome;
    public double salarioBruto;
    double impostos = 1000;
    
    public double salarioLiquido(){
        return salarioBruto - impostos;
    }
    
    public double aumentoSalarial(double porcentagem){
        return salarioBruto += (salarioBruto * porcentagem)/100;
    }
    
    @Override
    
    public String toString(){
        return "Funcionário: " + nome + ", R$" +salarioLiquido();
    }
}
