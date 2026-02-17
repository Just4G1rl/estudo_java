/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
/**
 *
 * @author Barbara
 */
public class Main {
    public static void main(String[] args) {
       LocalDate ld = LocalDate.now();
       LocalDateTime ldt = LocalDateTime.now();
       Instant ins = Instant.now();
       
       LocalDateTime ldt2 = LocalDateTime.ofInstant(ins,ZoneId.of("Africa/Kigali"));
   
      System.out.println(ldt2);
       
    }
}
