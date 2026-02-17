/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities_enum.StatusPedido;
import java.util.Date;

/**
 *
 * @author Barbara
 */
public class Pedido {
    private Integer ID;
    private Date instante;
    private StatusPedido status;

    public Pedido() {
        
    }
    
    public Pedido(Integer ID, Date instante, StatusPedido status) {
        this.ID = ID;
        this.instante = instante;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getInstante() {
        return instante;
    }

    public void setInstante(Date instante) {
        this.instante = instante;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido   status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" + "ID=" + ID + ", instante=" + instante + ", status=" + status + '}';
    }
}
