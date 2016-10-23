/**
 * Clase utilizada para almacenar la información de los pacientes.
 * @author Luis Nájera 15581.
 * @author German Garcia 15008.
 * version 23.10.16
 */
public class Paciente <E> implements Comparable<E> {
    private String nombre;
    private String enfermedad;
    private String prioridad;

    public Paciente(String nombre, String enfermedad, String prioridad) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.prioridad = prioridad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public String getPrioridad() {
        return prioridad;
    }
    
    public int compareTo(E new_paciente) {
        String nuevaPrioridad=((Paciente)new_paciente).getPrioridad();
	return prioridad.compareTo(nuevaPrioridad);
    }
    
    public String toString(){
	return nombre+", "+enfermedad+", "+prioridad;
    }
}
