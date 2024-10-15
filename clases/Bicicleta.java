package actividad.clases;
public class Bicicleta {
    private String marca;
    private String tipo;
    private String material;

    // Constructor por defecto
    public Bicicleta() {
        this.marca = "";
        this.tipo = "";
        this.material = "";
    }

    // Constructor con parámetros
    public Bicicleta(String marca, String tipo, String material) {
        this.marca = marca;
        this.tipo = tipo;
        this.material = material;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Método toString para mostrar los valores de las propiedades
    @Override
    public String toString() {
        return "Bicicleta [Marca: " + marca + ", Tipo: " + tipo + ", Material: " + material + "]";
    }
}