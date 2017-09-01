public class Estudiante
{
    // Variables de Instancia
    private String nombre;
    private int clave;
    
    /**
     * Constructor
     * @author Priscila Hernandez
     * @param claveInicial Pide clave del alumno.
     * @param nombreInicial Pide nombre del alumno.
     */
    public Estudiante(int claveInicial, String nombreInicial)
    {
        nombre = nombreInicial;
        clave = claveInicial;
    }
    
    /**
     * @return Muestra la clave y el nombre del alumno.
     */
    public String dimeDetalles()
    {
        return "Clave: " + clave + ", Nombre: " + nombre;
    }
    
    /**
     * @return clave Regresa la clave del alumno.
     */
    public int dimeClave()
    {
        return clave;
    }
}