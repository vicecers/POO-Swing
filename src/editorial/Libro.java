/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorial;

/**
 *
 * @author vicec
 */
public class Libro extends Publicacion{
    
    private int numPaginas;

    public Libro(String titulo, double precio, int numPaginas) {
        super(titulo, precio);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{ " + "Titulo " + titulo + " Precio " + precio + " numPaginas=" + numPaginas + '}';
    }
    
    
        
    
    
    
}
