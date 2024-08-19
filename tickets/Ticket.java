/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tickets;

/**
 *
 * @author Student
 */
public class Ticket {
    private int numero;
    private EstadoTicket tipo;

    public int getNumero() {
        return numero;
    }

    public EstadoTicket getTipo() {
        return tipo;
    }

    public Ticket(int numero, EstadoTicket tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    
    public Ticket(){
        this(0,null);
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
    
}
