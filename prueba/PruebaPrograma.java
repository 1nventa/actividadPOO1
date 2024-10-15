package actividad.prueba;

import actividad.clases.Bicicleta;
import actividad.clases.Ciclista;
import actividad.clases.Competencia;

public class PruebaPrograma {
    public static void main(String[] args) {
        System.out.println("Código: 7502410053 | Nombre: Carlos Hernandez");
        System.out.println("************************************");

        // Crear objetos usando el constructor por defecto
        Bicicleta bicicleta1 = new Bicicleta();
        Ciclista ciclista1 = new Ciclista();
        Competencia competencia1 = new Competencia();

        // Asignar valores a las propiedades
        bicicleta1.setMarca("Giant");
        bicicleta1.setTipo("Montaña");
        bicicleta1.setMaterial("Carbono");

        ciclista1.setNombre("Carlos López");
        ciclista1.setEdad(28);
        ciclista1.setNivel("Avanzado");

        competencia1.setNombreCompetencia("Tour de Francia");
        competencia1.setFecha("15/07/2024");
        competencia1.setLugar("Francia");

        // Mostrar datos de los objetos creados
        System.out.println(bicicleta1);
        System.out.println(ciclista1);
        System.out.println(competencia1);

        // Crear objetos usando el constructor con parámetros
        Bicicleta bicicleta2 = new Bicicleta("Trek", "Carretera", "Aluminio");
        Ciclista ciclista2 = new Ciclista("Laura Gómez", 32, "Intermedio");
        Competencia competencia2 = new Competencia("Vuelta a España", "10/09/2024", "España");

        // Mostrar datos de los objetos creados
        System.out.println(bicicleta2);
        System.out.println(ciclista2);
        System.out.println(competencia2);
    }
}