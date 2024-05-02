import java.util.ArrayList;
import java.util.List;

public class EquipoNacional {
    private String nombre;
    private List<Atleta> equipo;

    public EquipoNacional(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
    }

    public void agregarAtletaAlEquipo(Atleta atleta) {
        equipo.add(atleta);
    }

    public List<Atleta> getAtletas() {
        return equipo;
    }

    public void statusEquipo(EquipoNacional equipoActual){
        System.out.println("Altura de los atletas en el equipo y si tienen peso extra:");
        for (Atleta atleta : equipoActual.getAtletas()) {
            System.out.println("Nombre: " + atleta.getNombre());
            System.out.println("Altura: " + atleta.getAltura() + "m");
            if (atleta.hayPesoExtra(atleta.calculaIMC(atleta.getAltura(), atleta.getPeso()))) {
                System.out.println("Tiene peso extra");
            } else {
                System.out.println("No tiene peso extra");
            }
            System.out.println("-----------------------");
        }
    }
}
