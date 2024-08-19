/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tickets;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaTickets {
    private ArrayList<Ticket> tickets;

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public ListaTickets() {
        this.tickets = new ArrayList();
    }
    
    public void agregar(Ticket ticket){
        this.tickets.add(ticket);
    }
    
    public void eliminarPorPosicion(int pos){
        this.tickets.remove(pos);
    }
    
    public void eliminarPorValor(Ticket ticket){
        this.tickets.remove(ticket);
    }
    
    public Ticket buscarTicket(Ticket ticket, EstadoTicket tipo){
        for (int i = 0; i < this.tickets.size(); i++) {
            if (this.tickets.get(i)!=null){
                if(this.tickets.get(i).getTipo()==tipo){
                    return this.tickets.remove(i);
                }
            }
        }
        return null;
    }
}
