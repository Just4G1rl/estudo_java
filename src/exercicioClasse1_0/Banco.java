/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioClasse1_0;

import exercicioClasse1_0.ContaBancaria;
import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta;
        
        System.out.println("--------Conta Bancária--------");
        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Informe o nome do titular da conta: ");
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();
        System.out.print("Deseja fazer um deposito inicial(s/n)?" );
        char resposta = scanner.next().charAt(0);
        if(resposta == 's'){
            System.out.print("Informe o valor que deseja depositar: ");
            double depositoInicial = scanner.nextDouble();
            conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);

        }else{
            conta = new ContaBancaria(numeroConta, nomeTitular);

        }
        System.out.println(conta.toString());
        System.out.print("Informe o valor que deseja depositar: ");
        double valor = scanner.nextDouble();
        conta.deposito(valor);
        System.out.println(conta.toString());
        System.out.print("Informe o valor que deseja sacar: ");
        valor = scanner.nextDouble();
        conta.saque(valor);
        System.out.println(conta.toString());
        
        scanner.close();
       
    }*/
}
