package exercicioList1_0;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Barbara
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Aplicação {

    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();    
        System.out.print("Quantos funcionários serão registrados: ");
        int quant = scn.nextInt();  
       //Leitura e armazenamento dos dados.
        for(int i = 0; i< quant; i++){
            System.out.println();
            System.out.println("Funcinário #"+ (i+1));
            System.out.print("ID: ");
            int id = scn.nextInt();
            //Verificando id's exitentes.
            while (hasID(list, id)) { 
                System.out.print("ID já utilizado, informe um novo: ");
                id = scn.nextInt();
            }
            scn.nextLine();
            System.out.print("Nome: ");
            String nome = scn.nextLine();
            System.out.print("Salário: ");
            double salario = scn.nextDouble();
            scn.nextLine();
            list.add(new Funcionarios(id, nome, salario));
        }  
        System.out.print("Informe o ID do funcionário que terá um aumento de salário: ");
        int id = scn.nextInt();
        scn.nextLine();
        //Verificando, atraves de expressão LAMBDA, se o ID informado existe
        Funcionarios funcionario = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
        if(funcionario == null){
            System.out.println("Esse id não exixte!");  
        }else{
            System.out.print("Informe a porcentagem: ");
            double porcentagem = scn.nextDouble();
            funcionario.setSalario(porcentagem);
        }
        System.out.println("--------------------------");
        System.out.println("Lista de funcionários");
        for(Funcionarios pessoa : list){
            System.out.println(pessoa.toString());   
        }
        scn.close();
    }
    
    public static boolean hasID(List<Funcionarios> list, int id){
        Funcionarios funcionario = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
        return funcionario != null;
    }*/
}

