public class Notas {
    private String titulo;
    private String fecha;
    private String prioridad;
    private String etiqueta;
    private String texto;

    public Notas(String titulo, String fecha, String prioridad, String etiqueta, String texto) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.etiqueta = etiqueta;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
