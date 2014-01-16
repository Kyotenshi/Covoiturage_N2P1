Projet Covoiturage N2P1

par Hennache Johan et Ghesquière Jérôme



Accès GitHub : https://github.com/Kyotenshi/Covoiturage_N2P1



Nous avons organisé notre programme en se basant sur le modèle MVC : Modèle-Vue-Contrôleur

Covoiturage 

N2P1 est donc divisé en 3 paquetages :


Le Paquetage Model qui contient : 
	- Application.java
	- Membre.java
	- Trajet.java


Le paquetage View qui contient :
	- Affichage.java


Le paquetage défaut (qui fait ici office de Contrôleur) :
	- Main.java



Les classes du paquetage "Model" servent principalement à la création des objets, Membre et Trajet.

On a décidé d'inclure la voiture à la classe Membre.java, si le membre a une voiture, il sera capable de créer un trajet, sinon il ne pourra que joindre un trajet.

Un trajet peut donc être créer uniquement par une personne ayant une voiture, mais il peut être consulter et rejoins pas tous, qu'il dispose ou non d'un véhicule.

Contributions des collaborateurs :
 - Hennache Johan (Kyotenshi sur GitHub) : 
	Main.java (Serialization, deserialization, menu) 
	Affichage.java (affichageIntro, afficherMenu, afficherCreerMembre, afficherMembre, afficherCreerTrajet, afficherAjouterTrajet, inputString, inputNumber) 
	Membre.java 
	Trajet.java 
	Application.java (Appli, ajouterMembre, modifierMembre) 

 - Ghesquière Jérôme (Kotasan sur GitHub) : 
	Main.java 
	Affichage.java (afficherModifierMembre, afficherCreerTrajet) 
	Membre.java (Appli, ajouterMembre, modifierMembre, demanderMembre)
	Trajet.java Application.java (ajouterTrajet)