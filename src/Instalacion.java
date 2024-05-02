import java.util.ArrayList;
import java.util.List;

public class Instalacion {
    private String categoria;
    private String localizacion;
    private String nombre;
    private String tipo;
    private List<Prueba> pruebas;

    public Instalacion(){
    }

    public Instalacion(String categoria, String localizacion,String nombre, String tipo){
        this.categoria = categoria;
        this.localizacion = localizacion;
        this.nombre = nombre;
        this.tipo = tipo;
        this.pruebas = new ArrayList<>();
    }

    public void addPrueba(Prueba prueba){
        pruebas.add(prueba);
    }

    public void tercerAtletaSegundaPrueba(){
        Prueba segundaPrueba = pruebas.get(1);
        List<Atleta> atletasEnSegundaPrueba = segundaPrueba.getAtletas();
        Atleta tercerAtleta = atletasEnSegundaPrueba.get(2);
        System.out.println("El tercer atleta en la segunda prueba es: " + tercerAtleta.getNombre());
        System.out.println("El codigo de la segunda prueba es: " + segundaPrueba.getCodigo());
    }

}
