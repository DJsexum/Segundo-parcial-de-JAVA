public abstract class Persona
{
    protected int dni;
    protected String nombre;
    protected String apellido;

    public Persona(int dni, String nombre, String apellido)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public abstract void verDatos();
}