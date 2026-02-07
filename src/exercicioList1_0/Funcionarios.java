/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioList1_0;

/**
 *
 * @author Barbara
 */
public class Funcionarios {
    private Integer ID;
    private String nome;
    private Double salario;

    public Funcionarios() {
        
    }
    
    public Funcionarios(Integer ID, String nome, double salario) {
       this.ID = ID;
       this.nome = nome;
       this.salario = salario;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    @Override
    public String toString() {
        return ID + " " + nome + ", R$" + salario;
    }
}
