/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;

import java.time.LocalDate;
import persona.Persona;

/**
 *
 * @author roger
 */
public class Factura {

    //Atributos:
    double precio;
    LocalDate fecha; //he puesto la fecha como un int, me daba error al construir el objeto.
    Persona cliente; //Siendo persona un objeto de la clase persona. 
    //Constructor.

    public Factura(double precio, LocalDate fecha, Persona cliente) {
        this.precio = precio;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    //Getter y setters:
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    //Calcular Iva
    private double calcularIva(double precio) {
        return precio * 0.21;

    }

    public void SumarIva() {
        double iva = calcularIva(precio);//Llamamos a calcularIva para obtener el IVA
        precio += iva; //Al precio le sumamos el IVA
    }

    public void mostrarFactura() {
        System.out.println("Factura: AAAA-00000 " + " Precio: " + precio + " Fecha: " + fecha + " Cliente: " + cliente);

    }

    @Override
    public String toString() {
        return "Factura{" + "precio=" + precio + ", fecha=" + fecha + ", cliente=" + cliente + '}';
    }

}
