/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioClasse4_0;

/**
 *
 * @author Barbara
 */
public class Cotacao {
    public static final double IOF = 0.06;
    public static double valorDolar;
    
    public static double compraDolar(double quantDollar){
        double valorPago = quantDollar * valorDolar;
        return valorPago += valorPago * IOF; 
    }
}
