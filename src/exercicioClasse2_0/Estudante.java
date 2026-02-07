/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioClasse2_0;

public class Estudante {
    public String nome;
    public double nota1Semestre;
    public double nota2Semestre;
    public double nota3Semestre;

     public double notaTotal(){
         return nota1Semestre + nota2Semestre + nota3Semestre;
    }
    public void aprovacao(){
        if(notaTotal() >= 60){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
            System.out.println("Faltaram " + (60 - notaTotal()) + " pontos");
        }
    }
}
