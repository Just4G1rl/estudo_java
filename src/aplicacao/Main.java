/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;

/**
 *
 * @author Barbara
 */
public class Main {
    public static void main(String[] args) {
       LocalDate ld = LocalDate.now();
       LocalDateTime ldt = LocalDateTime.now();
       Instant ins = Instant.now();
       LocalDate ldISO = LocalDate.parse("206-02-08");
       
       System.out.println("LocalDate: "+ld);
       System.out.println("LocalDateTime: "+ldt);
       System.out.println("Instant: "+ins);
    }
}
