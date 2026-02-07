/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioClasse3_0;
public class Calculadora {
    double numero1;
    double numero2;
    double resultado;
    
    public double soma1(){
        resultado = numero1 + numero2;
        return resultado;
    }
    
    public double soma2(){
        resultado += numero1;
        return resultado;
    }
    
   public double subtracao1(){
       resultado = numero1 - numero2;
       return resultado;
   }
   
   public double subtracao2(){
       resultado -=numero1;
       return resultado;
   }
   public double multiplicacao1(){
       resultado = numero1 * numero2;
       return resultado;
   }
   public double multiplicacao2(){
       resultado = resultado * numero1;
       return resultado;
   }
     public double divisao1(){
       if(numero2 != 0){
        resultado = numero1 / numero2;
       return resultado;   
       }
       return 0;
   }
   public double divisao(){
       if(numero2 != 0){
        resultado = resultado / numero2;
       return resultado;   
       }
       return 0;
   }
}

