import java.util.ArrayList;
import java.util.List;

public class Artisan extends Personne{
    private List<Outil> listeOutils;

    public Artisan(List<Outil> listeOutils) {
        this.listeOutils = new ArrayList<Outil>(listeOutils);
    }

    public List<Outil> getListeOutils() {
        return listeOutils;
    }

    public void setListeOutils(List<Outil> listeOutils) {
        this.listeOutils = listeOutils;
    }

    public void ameliorerBatiment(Batiment batiment) {
        batiment.setSolidite(batiment.getSolidite() + 1);
        System.out.println("L'Artisan a amelioré le batiment " + batiment);
    }
}
