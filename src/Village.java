import java.util.ArrayList;
import java.util.List;

public class Village {
    private String nom;
    private List<Batiment> listeBatiments;
    private List<Ressource> listRessources;

    public List<Ressource> getListRessources() {
        return listRessources;
    }

    public void setListRessources(List<Ressource> listRessources) {
        this.listRessources = listRessources;
    }

    public Village() {
    }

    public Village(String nom) {
        this.nom = nom;
    }

    public Village(String nom, List<Batiment> listeBatiments) {
        this.nom = nom;
        this.listeBatiments = new ArrayList<Batiment>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Batiment> getListeBatiments() {
        return listeBatiments;
    }

    public void setListeBatiments(List<Batiment> listeBatiments) {
        this.listeBatiments = listeBatiments;
    }

    @Override
    public String toString() {
        return "Village{" +
                "nom='" + nom + '\'' +
                ", listeBatiments=" + listeBatiments +
                ", listRessources=" + listRessources +
                '}';
    }
}
