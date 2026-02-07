/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioVetor2_0;

import exercicioVetor2_0.Pessoas;
import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serão informadas?");
        int quantPessoas = scr.nextInt();
        scr.nextLine();
        Pessoas[] vetPessoas = new Pessoas[quantPessoas];
        
        for(int i = 0; i < vetPessoas.length; i++){
            System.out.println("Dados da pessoa " + (i+1));
            System.out.print("Nome: ");
            String nome = scr.nextLine();
            System.out.print("Idade: ");
            int idade = scr.nextInt();
            System.out.print("Altura: ");
            double altura = scr.nextDouble();
            scr.nextLine();
            vetPessoas[i] = new Pessoas(nome, idade, altura);
        }
        
        double alturaMedia = 0;
        int menor16Anos = 0;
        for (Pessoas vetPessoa : vetPessoas) {
            alturaMedia += vetPessoa.getAltura();
            if (vetPessoa.getIdade() < 16) {
                menor16Anos++;
            }
        }
        
        alturaMedia = alturaMedia/vetPessoas.length;
        menor16Anos = menor16Anos* 100 / vetPessoas.length;
        System.out.printf("Altura média %.2f %n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %d%%%n", menor16Anos);
        
        for (Pessoas vetPessoa : vetPessoas) {
            if (vetPessoa.getIdade() < 16) {
                System.out.println(vetPessoa.getNome());
            }
        }
        
        scr.close();
    }*/
}
    

