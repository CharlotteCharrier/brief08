public abstract class Personne {
    protected int pv;
    protected String nom;
    protected Batiment currentSituation;
    protected Village currentVillage;

    public Personne(int pv, String nom) {
        this.pv = pv;
        this.nom = nom;
    }

    public void seDeplacer(Batiment batiment) {
      this.setCurrentSituation(batiment);

        System.out.println(this.nom + " s'est deplacé vers " + batiment);
    }

    public void seBalader(Village village){
        this.setCurrentVillage(village);

        System.out.println(this.nom + " s'est baladé vers " + village);
    }

    public Personne() {}

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Batiment getCurrentSituation() {
        return currentSituation;
    }

    public void setCurrentSituation(Batiment currentSituation) {
        this.currentSituation = currentSituation;
    }

    public Village getCurrentVillage() {
        return currentVillage;
    }

    public void setCurrentVillage(Village currentVillage) {
        this.currentVillage = currentVillage;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "pv=" + pv +
                ", nom='" + nom + '\'' +
                ", currentSituation=" + currentSituation +
                ", currentVillage=" + currentVillage +
                '}';
    }
}
