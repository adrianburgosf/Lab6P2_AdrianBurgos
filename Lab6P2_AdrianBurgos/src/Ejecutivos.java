public class Ejecutivos extends Personas{
    private String cargo;
    private String empresa;
    private String tituloU;
    private String tituloM;

    public Ejecutivos(String cargo, String empresa, String tituloU, String tituloM, String nombre, String apellido, String correo, String usuario, String password) {
        super(nombre, apellido, correo, usuario, password);
        this.cargo = cargo;
        this.empresa = empresa;
        this.tituloU = tituloU;
        this.tituloM = tituloM;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTituloU() {
        return tituloU;
    }

    public void setTituloU(String tituloU) {
        this.tituloU = tituloU;
    }

    public String getTituloM() {
        return tituloM;
    }

    public void setTituloM(String tituloM) {
        this.tituloM = tituloM;
    }
    
}
