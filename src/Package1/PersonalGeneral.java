
package Package1;

public class PersonalGeneral extends Persona{
   
    private String ocupacion;
    private String horario;
    private int semanasT;
    private double sueldo;

    public PersonalGeneral() {
        super();
    }

    public PersonalGeneral(String ocupacion, String horario, int semanasT, double sueldo, String id, String nombre, String sexo, String estado_civil, double altura, double peso) {
        super(id, nombre, sexo, estado_civil, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanasT = semanasT;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanasT() {
        return semanasT;
    }

    public void setSemanasT(int semanasT) {
        this.semanasT = semanasT;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "PersonalGeneral";
    }
    
}
