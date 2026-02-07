/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioVetor3_0;

/**
 *
 * @author Barbara
 */
public class Produto {
   private String nome;
   private double preco;
   
    public Produto(String nome, double preco){
       this.nome = nome;
       this.preco = preco;
    }
   
     public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
  
    public void estoqueAtual(){
    System.out.printf("Atualização:%s, R$%.2f", getNome(), getPreco());
    }
}
