public class Arme {
    private String nom;
    private int solidite;

    public int getSolidite() {
        return solidite;
    }

    public void setSolidite(int solidite) {
        this.solidite = solidite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Arme{" +
                "nom='" + nom + '\'' +
                ", solidite=" + solidite +
                '}';
    }
}
