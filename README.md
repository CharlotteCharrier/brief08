````mermaid
---
title: Nebula Game Labs
---
classDiagram
    Village "1" --> "*" Batiment 
    Village "1" --> "*" Personne
    Chef ..> Soldat
    Artisan ..> Villageois
    Eclaireur ..> Villageois
    
    class Village {
        -String nom
        -List~Batiment~
        -List~Ressource~
    }
    Batiment <|-- Caserne
    Batiment <|-- Maison
    Batiment <|-- Atelier
    Batiment <|-- MurDefense
    Batiment <|-- Ferme
    
    class Batiment{
        -int solidite
        -Ressource ressourcesNecessairesConstruction
        -int tempsConstruction
    }
    class Ferme{
        -int ressources
        +produireNourriture(Ferme)
    }
    class Caserne{
        -List~Soldat~
    }
    
    class Atelier {
        +produireOutil(Artisan, String nom, int solidite)
        +produireArme(Artisan, Soldat, String nom, int solidite)
    }
    
    Personne <|-- Villageois
    Personne <|-- Soldat
    class Personne{
        <<abstract>>>
        #String nom
        #Batiment currentSituation
        #Village currentVillage
    }
    class Villageois{
        -Maison currentMaison
        +abriter(Maison)
        +construire(Batiment)
        +echanger(Ressource, Ressource)
        +collecter(Ressource)
    }
    class Soldat{
        -List~Arme~ 
        -int capaciteAttaque
        -Caserne currentCaserne
        +abriter(Caserne)
        +attaquer(Soldat)
        +detruire(Batiment)
    }
    
    class Ressource{
        <<enumeration>>
        bois
        pierre
        nourriture
        fer
    }
    
    class Chef{
        <<interface>>
        +motiver()
    }

    class Eclaireur{
        <<interface>>
        +partirExplorer()
    }

    class Artisan{
        -List~Outil~
        +ameliorerBatiment(Batiment)
    }
    
    class Outil{
        -String nom
        -int solidite
    }
    class Arme{
        -String nom
        -int solidite
    }

````
````mermaid
sequenceDiagram
    actor Villageois
    actor Soldats
    Villageois->>Ressource: part récolter
    Ressource-->>Villageois: ressources
    Villageois-)MurDéfense: construit
    Villageois->>Maison: se repose
    Soldats->>Village: attaquent
    destroy MurDéfense
    MurDéfense-->>Soldats: est détruit par
    Villageois->>Village: reconstruisent

````