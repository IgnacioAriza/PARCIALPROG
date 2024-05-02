import java.util.ArrayList;
import java.util.List;

public class Prueba {
    private int codigo;
    private String titulo;
    private List<Atleta> atletas;

    public Prueba(){
    }

    public Prueba(String titulo, int codigo){
        this.codigo = codigo;
        this.titulo = titulo;
        this.atletas = new ArrayList<>();
    }

    public void addAtleta(Atleta atleta){
        atletas.add(atleta);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Atleta> getAtletas(){
        return atletas;
    }
}
