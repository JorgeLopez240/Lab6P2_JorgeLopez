
package Package1;

import java.awt.Color;

public class Zapato extends Objeto{
   
    private double talla;
    private String descripcion_suela;
    private int comodidad; //1-10

    public Zapato() {
        super();
    }

    public Zapato(double talla, String descripcion_suela, int comodidad, Color color, String descripcion, String marca, double tamano, String calidad, Persona persona_ingreso) {
        super(color, descripcion, marca, tamano, calidad, persona_ingreso);
        this.talla = talla;
        this.descripcion_suela = descripcion_suela;
        this.comodidad = comodidad;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getDescripcion_suela() {
        return descripcion_suela;
    }

    public void setDescripcion_suela(String descripcion_suela) {
        this.descripcion_suela = descripcion_suela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapato{" + "descripcion_suela=" + descripcion_suela + '}';
    }
    
    
    
    
    
}
