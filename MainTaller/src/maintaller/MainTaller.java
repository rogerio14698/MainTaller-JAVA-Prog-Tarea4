/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maintaller;

import coche.Coche;
import factura.Factura;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import mecanico.Mecanico;
import persona.Persona;

/**
 *
 * @author roger
 */
public class MainTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int telefonoTexto;
        //antes de crear persona tengo que crear un coche
        Coche car = new Coche("AAA-000", 2000, "Mercedes", 50000, false, Coche.COCHE.HIBRIDO);
        /*
        //Crear un coche pidiendo datos al usuario.
        System.out.println("Introduzca una matricula: ejemplo AAAA-0000");
        String matricula = sc.next();
        System.out.println("Introduzca el anio del coche: ");
        int anoFabricacion = sc.nextInt();
        System.out.println("Introduzca la marca del coche: ");
        String marca = sc.next();
        System.out.println("introduzca el kilometraje del coche: ");
        int km = sc.nextInt();
        System.out.println("Estado de repacion: 'fase' OR 'true'");
        boolean estaReparado = sc.nextBoolean();
        System.out.println("Selecciona una opcion de coche: ");
        for (Coche.COCHE tipoCoche : Coche.COCHE.values()){
            System.out.println(tipoCoche.ordinal()+ 1 + ". " + tipoCoche); //Aqui concatena el orden de los coches
            //Empezando por el 1 seguido de un . + el nombre del coche
            //que nos quedaria 1. FAMILIAR .... asi hasta el 4. con todas las opciones de coches que tengamos.
        }
        int tipoCocheSeleccionado = sc.nextInt(); //leer la opcion del usuario.
        Coche.COCHE tipoCoche = Coche.COCHE.values()[tipoCocheSeleccionado -1];
        //a la variable tipoCoche, se le asigna el valor que ha introducido el usuario -1, ya que 
        //empieza en 0, 1, 2, 3.... Y como 
        Coche car = new Coche(matricula, anoFabricacion, marca, km, estaReparado, tipoCoche);
        System.out.println(car);
        
        */
   
        //CREAR UN OBEJTO DE LA CLASE PERSONA
        Persona persona = new Persona("58472030A", "Pepe", 99999999, car);
        //Crear un objeto de la clase MECANICO
        Mecanico meca = new Mecanico("9900993F", "Manolo", 1234567890);

        //FORMATO DE LA FECHA;
        String fechaStr = "01-07-2010"; //La fecha en formato de cadena;
        //Formatear la fecha para que lo pueda leer.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        Factura factura = null; //Declaro la variable feura del bloque try. 
        //Llamar al metodo arreglarVehiculo.

        try {
            //Convierte la cadena a LocalDate
            LocalDate fecha = LocalDate.parse(fechaStr, formatter);
            //Crear la factura. pero sin declarar la variable ya que la he declarado fuera del try-catch. 
            factura = new Factura(10.0, fecha, persona); //Crear la factura 4º parte
            
            factura.SumarIva(); //Llamar a sumar IVA para crear bien la factura. 
           //factura.mostrarFactura(); //Mostrar la factura 5º parte sin arreglar coche BOLEAN = FALSE precio != 50, 
        } catch (DateTimeParseException e) {
            System.out.println("Error al introducir la fecha, prueba este formato dd-mm-yyyy." + e.getMessage());
        }
        //FIN DE FORMATEAR LA FECHA
        //Llamar al metodo arreglarVehiculo antes de mostrar la factura para que se vea el cambio.
        meca.arreglarVehiculo(car, factura);//3º parte del enunciado llamar a arreglarVehiculo. y pasar coche por parámetro.

        //MOSTRAR FACTURA FUERA DEL BLOQUE DE TRY CATCH.
        if (factura != null) {
            factura.mostrarFactura(); //mostrar factura por el metodo mostrarFactura. 
        } else {
            System.out.println("No se pudo crear la factura debido a un error en la fecha");
        }

        //Imprimir persona y mecanico --> 1º parte del enunciado
        System.out.println(persona);
        System.out.println(meca);
        System.out.println(factura); //Mostrar factura por el metodo toString. 
        //Fin 1º parte

        //Try catch para el metodo actualizarTelefono.  2º parte llamar al metodo actualizarTelefono.
        try {
            //actualizarTelefono del mecanico.
            System.out.println("Inserte el nuevo numero de telefono: ");
            telefonoTexto = sc.nextInt();
            persona.actualizarTelefono(telefonoTexto);
            System.out.println("El telefono ha sido actualizado a: " + persona.getTelefono());

        } catch (Exception e) {
            System.out.println("El formato del telefono no es valido. Intente introducir un formato valido!");
            System.out.println("El numero no ha sido actualizado, " + persona.getTelefono());
        }

    }

}
