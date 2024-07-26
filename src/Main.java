public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans Legacy of Lands !");

        System.out.println("                 PARTIE VILLAGE                     ");

        //créer un village
        Village village1 = new Village("Mon nouveau village");
        System.out.println("Bien joué tu as créé un nouveau village appelé : " + village1.getNom());
        village1.setListRessources(Ressource.pierre);

        Village village2 = new Village("Un autre village");

        //ressources existantes
        System.out.println("Ressources existantes : " + Ressource.bois + "," + Ressource.fer + "," + Ressource.pierre + "," + Ressource.nourriture);

        System.out.println("                 PARTIE VILLAGEOIS                     ");

        //créer des villageois
        Villageois villageois1 = new Villageois();
        villageois1.setNom("Morgan");
        villageois1.setPv(10);
        villageois1.setCurrentVillage(village1);

        System.out.println("Premier villageois créé : " +  villageois1);

        Villageois villageois2 = new Villageois();
        villageois2.setNom("Coralie");
        villageois2.setPv(10);
        villageois2.setCurrentVillage(village2);

        //les villageois peuvent collecter des ressources
        System.out.println("Ressources du village avant qu'un villageois ne collecte du bois: " + village1.getListRessources());
        villageois1.collecter(Ressource.bois);
        System.out.println("Ressources du village après qu'un villageois ait collecté du bois: " + village1.getListRessources());

        //Un villageois peut échanger des ressources avec un commerçant
        System.out.println("Un villageois souhaite échanger sa ressource en pierre contre une ressource en fer");
        villageois1.echangerRessource(Ressource.pierre, Ressource.fer);
        System.out.println("Voilà la liste des ressources du village après l'échange: " + village1.getListRessources());

        //les villageois peuvent créer des batiments
        Maison maison1 = (Maison) villageois1.construire(TypeDeBatiment.Maison);

        Caserne caserne1 = (Caserne) villageois1.construire(TypeDeBatiment.Caserne);

        Atelier atelier1 = (Atelier) villageois1.construire(TypeDeBatiment.Atelier);

        MurDefense murDefense1 = (MurDefense) villageois1.construire(TypeDeBatiment.MurDefense);

        Ferme ferme1 = (Ferme) villageois1.construire(TypeDeBatiment.Ferme);

        MurDefense murDefense2 = (MurDefense) villageois1.construire(TypeDeBatiment.MurDefense);

        //un villageois peut devenir éclaireur
        System.out.println("Après avoir construit tous ces bâtiments, Morgan se reconverti en éclaireur !");
        villageois1.partirExplorer(village2);

        System.out.println("                 PARTIE SOLDATS                     ");

        //créer des soldats
        Soldat soldat1 = new Soldat();
        soldat1.setPv(20);
        soldat1.setCurrentVillage(village1);
        soldat1.setCapaciteAttaque(10);
        soldat1.setCurrentCaserne(caserne1);
        soldat1.setNom("Omer");

        System.out.println("Premier soldat créé : " +  soldat1);

        Soldat soldat2 = new Soldat();
        soldat2.setNom("Marie");
        soldat2.setPv(20);
        soldat2.setCurrentVillage(village1);
        soldat2.setCapaciteAttaque(10);

        System.out.println("Second soldat créé : " +  soldat2);

        Soldat soldatEnnemi = new Soldat();
        soldatEnnemi.setPv(20);
        soldatEnnemi.setCurrentVillage(village1);
        soldatEnnemi.setCapaciteAttaque(10);
        soldatEnnemi.setNom("Thibault");

        //un soldat peut attaquer un autre soldat et ne pas gagner
        System.out.println("Le soldat Omer tente d'attaquer un soldat ennemi");
        soldat1.attaquer(soldatEnnemi);

        //un soldat peut devenir chef et motiver d'autres soldats
        System.out.println("Entre temps, le soldat Marie est devenue cheffe et elle motive le soldat Omer");
        System.out.println("Niveau d'attaque avant la motivation: " + soldat1.getCapaciteAttaque());
        soldat2.motiver(soldat1);
        System.out.println("Niveau d'attaque après la motivation: " + soldat1.getCapaciteAttaque());

        //un soldat peut attaquer un autre soldat et gagner
        System.out.println("Omer retente d'attaquer le soldat ennemi");
        soldat1.attaquer(soldatEnnemi);
        System.out.println("Capacité d'attaque d'Omer après cette victoire: " + soldat1.getCapaciteAttaque());

        //un soldat peut attaquer un batiment ennemi
        System.out.println("Marie tente de détruire le mur de défense d'un village ennemi");
        soldat2.detruire(murDefense2);
        murDefense2.setSolidite(10);

        //et le détruire
        System.out.println("Et au bout de plusieurs attaques...");
        soldat2.detruire(murDefense2);

        System.out.println("                 PARTIE ARTISANS                     ");

        //créer des artisans
        Artisan artisan1 = new Artisan();
        artisan1.setNom("Soumaya");
        artisan1.setPv(10);
        artisan1.setCurrentVillage(village1);
        System.out.println("Artisan créé : " + artisan1);

        //l'artisan se rend sur son lieu de travail
        artisan1.seDeplacer(atelier1);

        //il peut y construire des outils
        atelier1.produireOutil(artisan1, "pelle", 10);
        System.out.println("Liste des outils de l'artisan : " + artisan1.getListeOutils());

        //et des armes pour des soldats
        atelier1.produireArme(artisan1, soldat1,"épée", 30);
        System.out.println("Liste des armes du soldat: " +soldat1.getListeArmes());

        //un artisan peut améliorer la solidité d'un batiment
        System.out.println("Solidité de la maison1 avant amélioration de l'artisan: " + maison1.getSolidite());
        artisan1.ameliorerBatiment(maison1);
        System.out.println("Solidité de la maison1 après l'amélioration de l'artisan: " + maison1.getSolidite());

//TODO reprendre les schemas mermaid en fonction des changements effectués
    }
}