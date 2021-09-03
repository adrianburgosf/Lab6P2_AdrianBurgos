import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creativos extends Personas{
    private String ocupacion;
    private int edad;
    private File archivo=null;

    public Creativos() {
    }
    
    public Creativos(String ocupacion, int edad, String nombre, String apellido, String correo, String usuario, String password) {
        super(nombre, apellido, correo, usuario, password);
        this.ocupacion = ocupacion;
        this.edad = edad;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void escribirArchivo(String x) throws IOException {
        System.out.println(x);
        FileWriter canal=null;
        BufferedWriter ram=null;
        try {
            canal = new FileWriter(archivo, false);
            ram = new BufferedWriter(canal);
            ram.write(super.getNombre());
            ram.newLine();
            ram.flush();
            ram.write(super.getApellido());
            ram.newLine();
            ram.flush();
            ram.write(super.getCorreo());
            ram.newLine();
            ram.flush();
            ram.write(ocupacion);
            ram.newLine();
            ram.flush();
            String edad1 = "";
            edad1 += edad;
            ram.write(edad1);
            ram.newLine();
            ram.flush();
            ram.write(x);
            ram.newLine();
            ram.flush();
        } catch (Exception e) {
        }
        ram.close();
        canal.close();
    }
}
