
package Package1;

public class Persona {
   
    private String id; //unico
    private String nombre;
    private String sexo;
    private String estado_civil;
    private double altura;
    private double peso;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Persona(String id, String nombre, String sexo, String estado_civil, double altura, double peso, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.altura = altura;
        this.peso = peso;
        this.edad=edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    
    
}
