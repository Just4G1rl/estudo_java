/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioMatriz2_0;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Exercicio111 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int linhas = scn.nextInt();
        int colunas = scn.nextInt();
        int[][] matriz = new int[linhas][colunas];
        
        for(int i = 0; i < matriz.length; i++){
            System.out.println("");
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scn.nextInt();        
            }
        }
        int x = scn.nextInt();

        for(int i = 0; i < matriz.length; i++){
            System.out.println("");
            for(int j = 0;j< matriz[i].length; j++){
               if(x == matriz[i][j]){
                   System.out.println("Posição "+i+", "+j);
                   if(i > 0){
                       System.out.println("Acima: "+matriz[i-1][j]);
                   }
                   if(j > 0){
                       System.out.println("Direita: "+matriz[i][j-1]);
                   }
                   if(j < matriz[i].length - 1){
                       System.out.println("Esquerda: "+matriz[i][j+1]);
                   }
                   if(i < matriz.length){
                       System.out.println("Abaixo: "+matriz[i+1][j]);
                   }
               }
                System.out.print(" ");
            }
        }
    }
}
