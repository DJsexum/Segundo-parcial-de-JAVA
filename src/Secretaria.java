public class Secretaria extends Persona
{
    private double salario;

    public Secretaria(int dni, String nombre, String apellido, double salario)
    {
        super(dni, nombre, apellido);
        this.salario = salario;
    }

    public void inscribirAlumno(Alumno alumno, Carrera carrera)
    {
        alumno.getCarrera().add(carrera);
        System.out.println("Alumno inscrito en la carrera: " + carrera.getTitulo());
    }

    public void cobrarCuota(Alumno alumno, Carrera carrera)
    {
        System.out.println("Cobrando cuota de " + carrera.getCuotaMensual() + " a " + alumno.nombre);
    }

    @Override
    public void verDatos()
    {
        System.out.println("Secretaria: " + nombre + " " + apellido + ", DNI: " + dni + ", Salario: " + salario);
    }
}
