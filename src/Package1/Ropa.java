
package Package1;

import java.awt.Color;

public class Ropa extends Objeto{
    
    private double talla;
    private String tipo_tela;
    private String pais_frabricado;

    public Ropa() {
        super();
    }

    public Ropa(double talla, String tipo_tela, String pais_frabricado, Color color, String descripcion, String marca, double tamano, String calidad, Persona persona_ingreso) {
        super(color, descripcion, marca, tamano, calidad, persona_ingreso);
        this.talla = talla;
        this.tipo_tela = tipo_tela;
        this.pais_frabricado = pais_frabricado;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getTipo_tela() {
        return tipo_tela;
    }

    public void setTipo_tela(String tipo_tela) {
        this.tipo_tela = tipo_tela;
    }

    public String getPais_frabricado() {
        return pais_frabricado;
    }

    public void setPais_frabricado(String pais_frabricado) {
        this.pais_frabricado = pais_frabricado;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + '}';
    }
    
    
    
}
