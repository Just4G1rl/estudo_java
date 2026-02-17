/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;
import entities.Pedido;
import entities_enum.StatusPedido;
import java.util.Date;

/**
 *
 * @author Barbara
 */
public class Main {
    public static void main(String[] args) {
        Pedido p01 = new Pedido(0001, new Date(), StatusPedido.PAGAMENTO_PENDENTE);
        
        System.out.println(p01);
    }
}
