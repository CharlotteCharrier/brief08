import java.util.List;

public class Soldat extends Personne {
    private List<Arme> listeArmes;
    private int capaciteDefense;
    private int capaciteAttaque;
    private Caserne currentCaserne;

    public Soldat() {
        super();
    }

    public Soldat(List<Arme> listeArmes, int capaciteDefense, int capaciteAttaque) {
        this.listeArmes = listeArmes;
        this.capaciteDefense = capaciteDefense;
        this.capaciteAttaque = capaciteAttaque;
    }

    public List<Arme> getListeArmes() {
        return listeArmes;
    }

    public void setListeArmes(List<Arme> listeArmes) {
        this.listeArmes = listeArmes;
    }

    public int getCapaciteDefense() {
        return capaciteDefense;
    }

    public void setCapaciteDefense(int capaciteDefense) {
        this.capaciteDefense = capaciteDefense;
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

        System.out.println("Le soldat " + this.nom + "s'est abrité dans la caserne " + this.currentCaserne);
    }

    @Override
    public String toString() {
        return "Soldat{" +
                "listeArmes=" + listeArmes +
                ", capaciteDefense=" + capaciteDefense +
                ", capaciteAttaque=" + capaciteAttaque +
                ", currentCaserne=" + currentCaserne +
                ", pv=" + pv +
                ", nom='" + nom + '\'' +
                "} " + super.toString();
    }
}
