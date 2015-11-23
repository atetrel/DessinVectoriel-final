#README

Notre code se sépare en 3 grosses parties et 2 parties plus petites. Une partie qui concerne les formes que nous pouvons dessiner, une partie qui concerne les visiteurs des différents formats et une partie qui concerne les différents ordres que nous pouvons exécuter (Remplir, insérer, ...) les deux petites parties sont main et outils. Main contient notre classe de test et la classe générale regroupant tout Dessin. outils contient les différents outils que nous avons à utiliser dans notre projet: un FileHandler qui gère les fichiers et le Crayon.


#La parite des visiteurs
 Chaque format possède une classe qui étend FigureVisitor que l'on appellera par le nom du langage (VML, SVG, ...). Cette classe contiendra une méthode qui permettra de visiter une figure. Elle sera étendue par plusieurs classes qui représenteront les figures et qui contiendront la méthode visit qui permettra de renvoyer le bon format en sortie.

**IMPORTANT** : Les sous classes doivent impérativement être nommées nomDuLangage + nomDeLaFigure (ex: VMLCercle si Cercle.java est une classe créée dans la partie des figures) et doit se trouver dans un package nommé "specific" dans le package du langage (tout en minuscule). Cette partie est importante puisqu'une partie du code est basée sur ce nommage.

On utilise la patron visiteur abusivement entre les sous classes de notre implémentation de visiteur et les figures.

#La partie ordres
La partie ordres est séparée en deux types d'ordres. Les ordres dits "logiques" comme les "for" et les "if ... then ... else" et les ordres dits de "dessin" comme "remplir", "inserer", ... ATTENTION: les ordres de dessins doivent hériter de la classe IOrdreDessin et les ordres logiques de la classe IOrdreLogique. En effet les deux types d'ordres ne sont pas interprétés de la même manière.

#La partie Figure
Elle contient toutes les figures possibles. Elles héritent soit de FigureFermee si elles peuvent être remplies soit de FigureOuverte si elles ne peuvent pas l'être. 


##Comment ça marche :

For et While utilisent les lambda expressions de Java 8 pour évaluer les expressions et conditions au fur et à mesure des boucles. Les arguments sont donc majoritairement des Fonctions. Des exemples sont fournis dans le main de base avec un logo explicatif regroupant toutes les fonctions utilisées. Les couleurs sont entrées en hexadécimal précédé d'un "#" et en chaîne de caractère.