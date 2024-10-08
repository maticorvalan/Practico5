/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5;

/**
 *
 * @author El Angel
 */
public class Contacto {
    private String DNI;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;

    public Contacto(String DNI, String nombre, String apellido, String direccion, String ciudad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Contacto{" + "DNI=" + DNI + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Direccion=" + direccion + ", Ciudad=" + ciudad + '}';
    }
    
    
    
}
