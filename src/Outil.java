public class Outil {
    String nom;
    int solidite;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Outil(String nom, int solidite) {
        this.nom = nom;
        this.solidite = solidite;
    }

    public int getSolidite() {
        return solidite;
    }

    public void setSolidite(int solidite) {
        this.solidite = solidite;
    }

    @Override
    public String toString() {
        return "Outil{" +
                "nom='" + nom + '\'' +
                ", solidite=" + solidite +
                '}';
    }
}
