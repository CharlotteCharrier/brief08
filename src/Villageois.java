public class Villageois extends Personne implements Eclaireur {
    private Maison currentMaison;

    public Maison getCurrentMaison() {
        return currentMaison;
    }

    public Villageois() {
        super();
    }

    public void setCurrentMaison(Maison currentMaison) {
        this.currentMaison = currentMaison;
    }

    public void abriter(Maison maison) {
        this.setCurrentMaison(maison);
        System.out.println("Le villageois est abrité dans la maison " + maison);
    }

    public void echangerRessource(Ressource ressourcePerdue, Ressource ressourceGagnee) {
        this.currentVillage.retirerRessource(ressourcePerdue);
        this.currentVillage.ajouterRessource(ressourceGagnee);
        System.out.println("L'échange avec le commerçant a bien été effectué");
    }


    public Batiment construire(TypeDeBatiment typeBatiment) {
        Batiment monBatiment = new Maison();

        switch (typeBatiment) {
            case Maison -> {
                monBatiment = new Maison();
                System.out.println("Le villageois a construit une maison");
            }
            case Ferme -> {
                monBatiment = new Ferme(30);
                System.out.println("Le villageois a construit une ferme");
            }
            case Atelier -> {
                monBatiment = new Atelier();
                System.out.println("Le villageois a construit un atelier");
            }
            case Caserne -> {
                monBatiment = new Caserne();
                System.out.println("Le villageois a construit une caserne");
            }
            case MurDefense -> {
                monBatiment = new MurDefense();
                System.out.println("Le villageois a construit un mur de défense");
            }
        }
        return monBatiment;
    }

    public void collecter(Ressource ressource) {
        this.currentVillage.ajouterRessource(ressource);
        System.out.println("Le villageois a collecté: " + ressource);
    }

    @Override
    public void partirExplorer(Village village) {
        this.setCurrentVillage(village);
        System.out.println(this.getNom() + " est parti vers: " + village.getNom() + " pour explorer les environs");
    }

    //TODO faire des endroits possibles où l'éclaireur peut partir et ramener des ressources spécifiques ex: il va à la rivière il ramène de l'eau, il va dans une montagne il ramène de la pierre...
}
