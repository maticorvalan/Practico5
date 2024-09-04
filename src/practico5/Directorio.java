/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author El Angel
 */
public class Directorio {
    TreeMap<Long,Contacto> listaContacto;

    public Directorio() {
        this.listaContacto= new TreeMap<>();
    }
    
    public void añadirContacto(Contacto contacto, Long telefono){
        listaContacto.put(telefono, contacto);        
    }
    
    public void borrarContacto(Long telefono){
        listaContacto.remove(telefono);          
    }
  
    public Contacto buscarContacto(Long telefono) {
        Contacto contacto = listaContacto.get(telefono);
        if (contacto != null) {
            JOptionPane.showMessageDialog(null, "Contacto Encontado", "Buscador", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Contacto No Encontado", "Buscador", JOptionPane.WARNING_MESSAGE);

        }
        return contacto;
    }
    
    public TreeSet<Long> buscarTelefono (String apellido){
       TreeSet<Long> listaTelefono=new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : listaContacto.entrySet()) {
            Contacto contacto = entry.getValue();            
            if (contacto.getNombre().equalsIgnoreCase(apellido)) {
                Long telefono=entry.getKey();
                listaTelefono.add(telefono);
            }
        }
        return listaTelefono;        
    }

    public ArrayList<Contacto> buscarContacto (String ciudad){
       ArrayList<Contacto> listaDeContactos=new ArrayList<>();       
        for (Map.Entry<Long, Contacto> entry : listaContacto.entrySet()) {
            Contacto contacto = entry.getValue();            
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                listaDeContactos.add(contacto);               
            }
        }        
        return listaDeContactos;        
    }
    
    
}
