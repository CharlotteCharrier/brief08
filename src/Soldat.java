import java.util.ArrayList;
import java.util.List;

public class Soldat extends Personne implements Chef {
    private List<Arme> listeArmes;
    private int capaciteAttaque;
    private Caserne currentCaserne;

    public Soldat() {
        super();
        this.listeArmes = new ArrayList<>();
    }

    public Soldat(List<Arme> listeArmes, int capaciteAttaque) {
        this.listeArmes = new ArrayList<>();
        this.capaciteAttaque = capaciteAttaque;
    }

    public List<Arme> getListeArmes() {
        return listeArmes;
    }

    public void setListeArmes(List<Arme> listeArmes) {
        this.listeArmes = listeArmes;
    }

    public int getCapaciteAttaque() {
        return capaciteAttaque;
    }

    public void setCapaciteAttaque(int capaciteAttaque) {
        this.capaciteAttaque = capaciteAttaque;
    }

    public Caserne getCurrentCaserne() {
        return currentCaserne;
    }

    public void setCurrentCaserne(Caserne currentCaserne) {
        this.currentCaserne = currentCaserne;
    }

    public void abriter(Caserne caserne) {
        this.setCurrentCaserne(caserne);

        System.out.println("Le soldat " + this.nom + " s'est abrité dans la caserne " + this.currentCaserne);
    }

    public void attaquer(Soldat soldatEnnemi) {
        if(soldatEnnemi.capaciteAttaque > this.capaciteAttaque || soldatEnnemi.capaciteAttaque == this.capaciteAttaque) {
            System.out.println("L'ennemi était trop fort: " + this.getNom() + " est parti se reposer dans sa caserne");
            this.abriter(this.currentCaserne);
        } else {
            this.setCapaciteAttaque(getCapaciteAttaque() + 10);
            System.out.println(this.getNom() + " a triomphé ! Il remporte la victoire ainsi que 10 points d'attaque supplémentaires !");
        }
    }

    public void detruire(Batiment batimentEnnemi){
        batimentEnnemi.setSolidite(batimentEnnemi.getSolidite() - 10);
        if(batimentEnnemi.getSolidite() <= 0) {
            System.out.println("Le soldat: " + this.nom + " a détruit le " + batimentEnnemi);
        } else {
            System.out.println("Le " + batimentEnnemi + " est toujours debout");
        }
    }

    @Override
    public String toString() {
        return "Soldat{" +
                "listeArmes=" + listeArmes +
                ", capaciteAttaque=" + capaciteAttaque +
                ", currentCaserne=" + currentCaserne +
                ", nom='" + nom + '\'' +
                "} " + super.toString();
    }

    @Override
    public void motiver(Soldat soldat) {
        soldat.setCapaciteAttaque(getCapaciteAttaque() +1);
    }
}
