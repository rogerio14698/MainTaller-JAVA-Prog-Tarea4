/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coche;

/**
 *
 * @author roger
 */
public class Coche {

    public static enum COCHE {
        FAMILIAR,
        DEPORTIVO,
        MONOPLAZA,
        HIBRIDO
    }

    //Atributos
    String matricula;
    int anoFabricacion;
    String marca;
    int km;
    Boolean estaReparado;
    //Extra
    COCHE tipoCoche;

    //constructor con todos los atributos
    public Coche(String matricula, int anoFabricacion, String marca, int km, Boolean estaReparado, COCHE tipoCoche) {
        this.matricula = matricula;
        this.anoFabricacion = anoFabricacion;
        this.marca = marca;
        this.km = km;
        this.estaReparado = estaReparado;
        this.tipoCoche = tipoCoche;
    }

    //constructor sin los km, iniciando en 0
    public Coche(String matricula, int anoFabricacion, String marca, Boolean estaReparado, COCHE tipoCoche) {
        this.matricula = matricula;
        this.anoFabricacion = anoFabricacion;
        this.marca = marca;
        this.estaReparado = estaReparado;
        this.tipoCoche = tipoCoche;
    }

    //Metodos getters y setters de los atributos.
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Boolean getEstaReparado() {
        return estaReparado;
    }

    public void setEstaReparado(Boolean estaReparado) {
        this.estaReparado = estaReparado;
    }

    public COCHE getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(COCHE tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    //Fin de los metodos getters y setters 
    //Metodo to String
    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", anoFabricacion=" + anoFabricacion + ", marca=" + marca + ", km=" + km + ", estaReparado=" + estaReparado + ", tipoCoche=" + tipoCoche + '}';
    }

}
