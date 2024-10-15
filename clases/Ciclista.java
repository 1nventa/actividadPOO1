package actividad.clases;
public class Ciclista {
    private String nombre;
    private int edad;
    private String nivel;

    // Constructor por defecto
    public Ciclista() {
        this.nombre = "";
        this.edad = 0;
        this.nivel = "";
    }

    // Constructor con parámetros
    public Ciclista(String nombre, int edad, String nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    // Método toString para mostrar los valores de las propiedades
    @Override
    public String toString() {
        return "Ciclista [Nombre: " + nombre + ", Edad: " + edad + ", Nivel: " + nivel + "]";
    }
}