import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Materia matematicas = new Materia(101, "Matemáticas", "Matematica y Logica");
        Materia programacion = new Materia(102, "Programación", "C y Java");

        Carrera ingenieria = new Carrera(1001, "Ingeniería", 5000.0);
        ingenieria.agregarMateria(matematicas);
        ingenieria.agregarMateria(programacion);

        Alumno alumno1 = new Alumno(12345678, "Juan Cruz", "Cabrera", 1001);
        alumno1.getCarrera().add(ingenieria);

        Secretaria secretaria = new Secretaria(11111111, "Guille", "Gomez", 30000.0);

        secretaria.inscribirAlumno(alumno1, ingenieria);
        secretaria.cobrarCuota(alumno1, ingenieria);

        System.out.println("\nDatos del Alumno 1:");
        alumno1.verDatos();
        alumno1.verCronogramaCarrera();

        System.out.println("\nCambiar cuota de la carrera 'Ingeniería'");
        ingenieria.cambiarValorCuota(5500.0);
        System.out.println("Nueva cuota mensual de la carrera: " + ingenieria.getCuotaMensual());

        System.out.println("\nCambiar contenido de la materia 'Programación'");
        programacion.cambiarContenido("Java, Python, y C++");
        System.out.println("Nuevo contenido de la materia: " + programacion.getContenido());

        System.out.println("\nAlumnos inscritos en la carrera de " + ingenieria.getTitulo() + ":");
        ArrayList<Alumno> alumnosInscriptos = ingenieria.verAlumnosInscriptos();
    }
}