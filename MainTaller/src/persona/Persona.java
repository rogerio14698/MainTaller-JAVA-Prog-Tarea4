/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import coche.Coche;

/**
 *
 * @author roger
 */
public class Persona {

    //atributos
    String dni;
    String nombre;
    int telefono;
    Coche vehiculo;  // para crear esta clase, llamamos al objeto COCHE desde el constructor de coches.Coches
    //Y asignamos el nombre que en este caso es vehiculo.

    //Constructor para persona
    public Persona(String dni, String nombre, int telefono, Coche vehiculo) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
    }
    //getters y setters

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

    public Coche getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Coche vehiculo) {
        this.vehiculo = vehiculo;
    }
    //Metodo toString

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", vehiculo=" + vehiculo + '}';
    }

    //metodo actualizar telefono recibiendo un string
    //Si introduce algun otra cosa que no sea una cadena de texto marca un error.
    //Va a lanzar una excepcion si al introducir telefono no es correcto el dato.
    public void actualizarTelefono(String telefonoTexto) throws Exception { //Throws Exception hace que este metodo pueda lanzar excepciones.
        
        try {
            int telefonoConvertido = Integer.parseInt(telefonoTexto); //Convierto el string a int
            this.telefono = telefonoConvertido; //Guarda el nuevo telefono.

        }catch (Exception e){
            throw new Exception(); 
        }
    }
        //Al introducir un numero ya no hace falta cambiar el tipo de variable.
    public void actualizarTelefono(int telefonoNum) {
        this.telefono = telefonoNum;
    }

    public void mostrarPersona() {
        System.out.println("DNI: " + dni
                + "Nombre: " + nombre
                + "Telefono: " + telefono
                + "Vehiculo: " + vehiculo
        );
    }

}
