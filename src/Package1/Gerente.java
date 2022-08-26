
package Package1;

public class Gerente extends Persona{
    
    private String usuario;
    private String password;
    private String cargo;

    public Gerente() {
        super();
    }

    public Gerente(String usuario, String password, String cargo, String id, String nombre, String sexo, String estado_civil, double altura, double peso, int edad) {
        super(id, nombre, sexo, estado_civil, altura, peso, edad);
        this.usuario = usuario;
        this.password = password;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Gerente";
    }
    
    
    
}
