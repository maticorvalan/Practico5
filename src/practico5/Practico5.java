/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5;

import practico5.practico5.vistas.menu;

/**
 *
 * @author Matias
 */
public class Practico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacto contacto1= new Contacto("39465216", "Jorge", "Gonzales", "Torrado 542", "Villa Mercedes");
        Contacto contacto2= new Contacto("39995555", "Miguel", "Gonzales", "Belgrano 2242", "San Luis");
        Directorio.añadirContacto(2657507377L, contacto2);
        Directorio.añadirContacto(2664555444L, contacto1);
        menu m=new menu(); 
        m.setVisible(true);
    }
    
}
