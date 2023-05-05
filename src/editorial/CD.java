/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorial;

/**
 *
 * @author vicec
 */
public class CD extends Publicacion {

    private double tiempoMinutos;

    public CD(String titulo, double precio, double tiempoMinutos) {
        super(titulo, precio);
        this.tiempoMinutos=tiempoMinutos;
    }

    public double getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(double tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
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
        return "CD{" + "Titulo " + titulo + " Precio " + precio + " tiempoMinutos=" + tiempoMinutos + '}';
    }

   


}
