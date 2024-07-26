import java.util.ArrayList;
import java.util.List;

public class Artisan extends Personne{
    private List<Outil> listeOutils;

    public Artisan(List<Outil> listeOutils) {
        this.listeOutils = new ArrayList<Outil>(listeOutils);
    }

    public Artisan() {
        super();
        this.listeOutils = new ArrayList<>();
    }

    public List<Outil> getListeOutils() {
        return listeOutils;
    }

    public void setListeOutils(List<Outil> listeOutils) {
        this.listeOutils = listeOutils;
    }

    public void ameliorerBatiment(Batiment batiment) {
        batiment.setSolidite(batiment.getSolidite() + 10);
        System.out.println("L'Artisan a amelioré le batiment " + batiment);
    }

    @Override
    public String toString() {
        return "Artisan{" +
                "listeOutils=" + listeOutils +
                ", nom='" + nom + '\'' +
                ", currentSituation=" + currentSituation +
                ", currentVillage=" + currentVillage +
                "} " + super.toString();
    }
}
