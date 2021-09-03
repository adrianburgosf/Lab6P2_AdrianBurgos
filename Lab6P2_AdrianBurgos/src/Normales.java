public class Normales extends Personas{
    private String hobbie;
    private String interes;

    public Normales(String hobbie, String interes, String nombre, String apellido, String correo, String usuario, String password) {
        super(nombre, apellido, correo, usuario, password);
        this.hobbie = hobbie;
        this.interes = interes;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
    
}
