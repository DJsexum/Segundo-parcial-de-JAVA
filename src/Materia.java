public class Materia
{
    private int codigo;
    private String nombre;
    private String contenido;

    public Materia(int codigo, String nombre, String contenido)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getContenido()
    {
        return contenido;
    }

    public void cambiarContenido(String nuevoContenido)
    {
        this.contenido = nuevoContenido;
    }
}
