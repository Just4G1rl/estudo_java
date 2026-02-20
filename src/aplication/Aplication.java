/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplication;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Aplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Worker worker = new Worker();
        
        
        System.out.print("Informe o nome do departamento: ");
        String name = scn.nextLine();
        worker.setDepartment(name);
        
        System.out.print("Informe os dados do funcionário: ");
        System.out.print    ("Nome: ");
        name = scn.nextLine();
        worker.setName(name);
        System.out.print("Nível: ");
        String level = scn.nextLine().toUpperCase().trim().replaceAll(" ", "_");
        worker.setLevel(level);
        scn.nextLine();
        System.out.print("Informe o salário base: ");
        double baseSalary = scn.nextDouble();
        worker.setBaseSalary(baseSalary); 
        scn.nextLine();
        System.out.print("Quantos contratos esse trabalhador tem?");
        int quantContratos = scn.nextInt();
        scn.nextLine();
        
        for(int i = 0; i < quantContratos; i++){
            System.out.println("Informe os dados do #"+ (i+1) +" contrato:");
            System.out.print("Data(DD/MM/AAAA:");
            String date = scn.nextLine();
            System.out.print("Valor por hora:");
        }
    }   
}
