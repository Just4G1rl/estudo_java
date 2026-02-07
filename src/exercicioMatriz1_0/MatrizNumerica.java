/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioMatriz1_0;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class MatrizNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int tamanhoMatriz = scn.nextInt();
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j]= scn.nextInt();
            }
        }
        int count = 0;
        System.out.println("Negative Numbers");    
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == j){
                   System.out.print(matriz[i][j]+" ");
                }
                if(matriz[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("/nMain Diagonal = " + count);    

        scn.close();
    }    
    
    
    
}
