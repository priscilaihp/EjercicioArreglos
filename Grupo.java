public class Grupo
{
    // Variables de Instancia
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    /**
     * Constructor
     * @author Priscila Hernandez
     * @param totalEstudiantes Pide el total de estudiantes en el grupo.
     * @param nomMateria Pide el nombre de la materia.
     */
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }
    
    /**
     * Busca un estudiante por medio de su clave.
     * @param claveEstudiante Pide la clave del alumno.
     * @return Si se encontro el alumno regresa la posición en el arreglo, de lo contrario regresa -1.
     */
    public int buscaEstudiante(int claveEstudiante)
    {
        for(int i = 0; i < estudiantes.length && estudiantes[i] != null; i++)
        {
            if(estudiantes[i].dimeClave() == claveEstudiante)
            { 
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Busca un espacio disponible en el arreglo.
     * @return Regresa la primer posicion nula dentro del arreglo.
     */
    private int buscaEspacioDisponible()
    {
        for(int i = 0; i < estudiantes.length; i++)
        {
            if(estudiantes[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Inscribe un alumno en el grupo.
     * @param unEstudiante Es el objeto estudiante a inscribir en el grupo.
     * @return Regresa verdadero si el estudiante fue inscrito o falso en caso de que no se pudiera incribir.
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
        int existe = this.buscaEstudiante(unEstudiante.dimeClave());
        if(existe != -1)
        {
            return false; // El estudiante ya esta inscrito.
        }
        int posDisponible = this.buscaEspacioDisponible();
        if(posDisponible == -1)
        {
            return false; // El arreglo esta lleno.
        }
        estudiantes[posDisponible] = unEstudiante;
        return true; // El estudiante fue inscrito.
    }
    
    /**
     * Da de baja un alumno en el grupo.
     * @param unEstudiante Es el objeto estudiante a dar de baja en el grupo.
     * @return Regresa verdadero si el estudiante fue dado de baja o falso si no fue encontrado.
     */
    public boolean darBaja(Estudiante unEstudiante)
    {
        int existe = this.buscaEstudiante(unEstudiante.dimeClave());
        if(existe != -1)
        {
            estudiantes[existe] = null;
            return true;
        }
        return false;
    }
}