public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans Legacy of Lands !");

        //créer un village
        Village village = new Village("Mon nouveau village");
        System.out.println("Bien joué tu as créé un nouveau village appelé : " + village.getNom());

        //ressources disponibles
        System.out.println("Ressources disponibles : " + Ressource.bois.toString() + "," + Ressource.fer.toString() + "," + Ressource.pierre.toString() + "," + Ressource.nourriture.toString());

        //créer des villageois
        Villageois villageois1 = new Villageois();
        villageois1.setNom("Morgan");
        villageois1.setPv(10);
        villageois1.setCurrentVillage(village);

        System.out.println("Premier villageois créé : " +  villageois1.toString());

        Villageois villageois2 = new Villageois();
        villageois2.setNom("Marie");
        villageois2.setPv(10);
        villageois2.setCurrentVillage(village);

        System.out.println("Second villageois créé : " +  villageois2.toString());

        //créer des soldats
        Soldat soldat1 = new Soldat();
        soldat1.setPv(20);
        soldat1.setCurrentVillage(village);
        soldat1.setCapaciteAttaque(10);
        soldat1.setCapaciteDefense(10);
        soldat1.setNom("Omer");

        System.out.println("Soldat créé : " +  soldat1);

        //créer des batiments
        Maison maison1 = new Maison();
        System.out.println(maison1.toString());

        Caserne caserne1 = new Caserne();
        System.out.println(caserne1.toString());

        Atelier atelier1 = new Atelier();
        System.out.println(atelier1.toString());

        MurDefense murdefense1 = new MurDefense();
        System.out.println(murdefense1.toString());

        Ferme ferme1 = new Ferme();
        System.out.println(ferme1.toString());


    }
}