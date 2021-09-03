public class Estudiantes extends Personas{
    private String carrera;
    private int cursando;

    public Estudiantes(String carrera, int cursando, String nombre, String apellido, String correo, String usuario, String password) {
        super(nombre, apellido, correo, usuario, password);
        this.carrera = carrera;
        this.cursando = cursando;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCursando() {
        return cursando;
    }

    public void setCursando(int cursando) {
        this.cursando = cursando;
    }
    
    
}
