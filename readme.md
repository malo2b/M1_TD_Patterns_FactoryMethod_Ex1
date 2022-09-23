# TD Factory method

## Exercice 1 - Jeu d’aventure

Question 2 :

La conception de la calsse Simulateur comporte un gros inconvénient dans l'hypothèse ou l'on souhaite faire évoluer le logiciel en ajoutant de nouvelles catégorie de personnages. Dans ce cas la, l'ajout d'un nouveau personnage impliquera automatiquement une modification du code de la classe Simulateur en ajoutant une nouvelle condition a la foret de IF déjà présente. La détermination du type de personnage à partir d'une chaine de caractère ouvre également la porte à d'éventuels problème de faute de frappe qui pourraient générer des bugs difficiles a détercter.

Question 3 :

La solution mise en place permet de s'affranchir d'une modification de la classe Simulateur à chaque ajout de personnage. On instancie direcement une classe dérivée de Personnage qui implémente toutes les méthodes génériques nécessaires à l'utilisation de la simulation (animer par exemple).
Dans ce cas précis (avec la même interraction textuelle de chaques type de Personnage), on peut imaginer la méthode animer concrète dans la classe Personnage et pouvant être appellée via l'opérateur "super" dans les classes dérivées.
