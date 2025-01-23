/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecanico;
import coche.Coche;
import factura.Factura;

/**
 *
 * @author roger
 */
public class Mecanico {
    //Atributos
    String dni;
    String nombre;
    int telefono;
    
    //constructor

    public Mecanico(String dni, String nombre, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    //Getter y setter

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Mecanico{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
    //Metodo arreglarVehiculo recibiendo un objeto por parametro y devolver un decimal.
    public void arreglarVehiculo(Coche coche, Factura factura){
        //Recibe el objeto Coche desde el paquete coche y modifica el EstaRepado a True
        //Tambien recibe el objeto de FActura y modifica el precio de la factura segun el enunciado.
            //Si km menor q 5.000, el precio es 50, y si es mayor se divide entre 100 para el precio.
        coche.setEstaReparado(Boolean.TRUE);
        
        //Modificar el precio en la factura
        if(coche.getKm()<5000){
            factura.setPrecio(50);
        }else {
            factura.setPrecio(coche.getKm()/100);
        }
      
    }
    
    
    
    
    
}
