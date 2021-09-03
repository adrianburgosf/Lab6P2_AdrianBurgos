public class NotaC extends Notas{
    private String categoria;
    private String descripcion;
    private String publico;

    public NotaC(String titulo, String fecha, String prioridad, String etiqueta, String categoria, String descripcion, String publico, String texto) {
        super(titulo, fecha, prioridad, etiqueta, texto);
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.publico = publico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    @Override
    public String toString() {
        return "Titulo: "+super.getTitulo()+"\n"
                + "Fecha: "+super.getFecha()+"\n"
                + "Prioridad: "+super.getPrioridad()+"\n"
                + "Etiqueta: "+super.getEtiqueta()+"\n"
                + "Categoria: "+categoria+"\n"
                + "Descripcion: "+descripcion+"\n"
                + "Publico: "+publico+"\n"
                + "Texto: "+super.getTexto();
    }
}
