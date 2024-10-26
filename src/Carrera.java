import java.util.ArrayList;

public class Carrera
{
    private int codigo;
    private String titulo;
    private double cuotaMensual;
    private ArrayList<Materia> materias;

    public Carrera(int codigo, String titulo, double cuotaMensual)
    {
        this.codigo = codigo;
        this.titulo = titulo;
        this.cuotaMensual = cuotaMensual;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia)
    {
        materias.add(materia);
    }

    public ArrayList<Materia> getMaterias()
    {
        return materias;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public double getCuotaMensual()
    {
        return cuotaMensual;
    }

    public void cambiarValorCuota(double nuevaCuota)
    {
        this.cuotaMensual = nuevaCuota;
    }

    public ArrayList<Alumno> verAlumnosInscriptos()
    {
        return new ArrayList<>();
    }
}
