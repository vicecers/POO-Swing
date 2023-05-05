/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editorial.app;

import editorial.CD;
import editorial.Libro;
import editorial.Publicacion;

/**
 *
 * @author vicec
 */
public class appEditorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           
        Publicacion libro = new Libro("Holis", 5000, 360);
        
        Publicacion cd = new CD("Para", 6000, 120);
        
        
        System.out.println(libro.toString());
        System.out.println(cd.toString());
        
    }
    
}
