import java.util.ArrayList;

public class Alumno extends Persona
{
    private int legajo;
    private ArrayList<Carrera> carrera;

    public Alumno(int dni, String nombre, String apellido, int legajo)
    {
        super(dni, nombre, apellido);
        this.legajo = legajo;
        this.carrera = new ArrayList<>();
    }

    public ArrayList<Carrera> getCarrera()
    {
        return carrera;
    }

    public void verCronogramaCarrera()
    {
        for (Carrera c : carrera)
        {
            System.out.println("Cronograma de la carrera: " + c.getTitulo());
            for (Materia m : c.getMaterias())
            {
                System.out.println("Materia: " + m.getNombre() + " - Contenido: " + m.getContenido());
            }
        }
    }

    @Override
    public void verDatos()
    {
        System.out.println("Alumno: " + nombre + " " + apellido + ", DNI: " + dni + ", Legajo: " + legajo);
    }
}
