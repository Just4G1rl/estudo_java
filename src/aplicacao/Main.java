/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Barbara
 */
public class Main {
    public static void main(String[] args) {
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       DateTimeFormatter dtfh = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       //withZone = determina um fuso horario para poder formatar o Intant.
       //(ZoneId.systemDefault() =reconhece e mostra o fuso Horario do usuário.
       DateTimeFormatter dtfi = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

       LocalDate ld = LocalDate.now();
       LocalDateTime ldt = LocalDateTime.now();
       Instant ins = Instant.now();
       
       LocalDate ldISO = LocalDate.parse("2026-02-09");
       LocalDateTime ldtISO = LocalDateTime.parse("2026-02-09T06:33:00");
       Instant insISO = Instant.parse("2026-02-09T09:33:00Z"); 
       Instant insISOSP = Instant.parse("2026-02-06T01:49:00-03:00"); 
       
       
       System.out.println("LocalDate: "+ld);
       System.out.println("LocalDateTime: "+ldt);
       System.out.println("Instant: "+ins);
       System.out.println("Data ISO8601: "+ldISO);       
       System.out.println("Data Hora ISO8601: "+ldtISO);
       System.out.println("Instant ISO8601: "+insISO);
       System.out.println("Instant ISO8601: "+insISOSP);
       System.out.println("Data formatada: "+ ld.format(dtf));
       System.out.println("Data Hora formatada: "+ ldt.format(dtfh));
       System.out.println("Instant formatado: "+ dtfi.format(ins));
       
    }
}
