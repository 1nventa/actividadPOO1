package actividad.clases;
public class Competencia {
    private String nombreCompetencia;
    private String fecha;
    private String lugar;

    // Constructor por defecto
    public Competencia() {
        this.nombreCompetencia = "";
        this.fecha = "";
        this.lugar = "";
    }

    // Constructor con parámetros
    public Competencia(String nombreCompetencia, String fecha, String lugar) {
        this.nombreCompetencia = nombreCompetencia;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    // Getters y Setters
    public String getNombreCompetencia() {
        return nombreCompetencia;
    }

    public void setNombreCompetencia(String nombreCompetencia) {
        this.nombreCompetencia = nombreCompetencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    // Método toString para mostrar los valores de las propiedades
    @Override
    public String toString() {
        return "Competencia [Nombre: " + nombreCompetencia + ", Fecha: " + fecha + ", Lugar: " + lugar + "]";
    }
}