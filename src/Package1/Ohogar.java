
package Package1;

import java.awt.Color;

public class Ohogar extends Objeto {
    
    private String descripcion_h;
    private String instrucciones;
    private String garantia;

    public Ohogar() {
        super();
    }

    public Ohogar(String descripcion_h, String instrucciones, String garantia, Color color, String descripcion, String marca, double tamano, String calidad, Persona persona_ingreso) {
        super(color, descripcion, marca, tamano, calidad, persona_ingreso);
        this.descripcion_h = descripcion;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getDescripcion_h() {
        return descripcion_h;
    }

    public void setDescripcion_h(String descripcion_h) {
        this.descripcion_h = descripcion_h;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Ohogar{" + "garantia=" + garantia + '}';
    }

    
    
    
    
}
