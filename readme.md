README

Notre code se sépare en **TODO** grosses parties. Une partie qui concerne les formes que nous pouvons dessiner, une partie qui concerne les visiteurs des différents formats et une partie qui **TODO (finir quand le projet sera fini)**

La partie des visiteurs fonctionne comme ceci :

Chaque format possède une classe qui étend FigureVisitor que l'on appellera par le nom du langage (VML, SVG, ...). Cette classe contiendra une méthode qui permettra de visiter une figure. Elle sera étendue par plusieurs classes qui représenteront les figures et qui contiendront la méthode visit qui permettra de renvoyer le bon format en sortie.

IMPORTANT : Les sous classes doivent impérativement être nommées nomDuLangage + nomDeLaFigure (ex: VMLCercle si Cercle.java est une classe créée dans la partie des figures) et doit se trouver dans un package nommé "specific" dans le package du langage (tout en minuscule). Cette partie est importante puisqu'une partie du code est basée sur ce nommage.

On utilise la patron visiteur abusivement entre les sous classes de notre implémentation de visiteur et les figures.

La partie ordres est séparée en deux types d'ordres. Les ordres dits "logiques" comme les "for" et les "if ... then ... else" et les ordres dits de "dessin" comme "remplir", "inserer", ... ATTENTION: les ordres de dessins doivent être spécifiés dans 

Comment ça marche :

Lors de l'appel de draw sur un dessin avec le visiteur qui convient pour avoir le rendu au format souhaité, on appelle la méthode accept des figures qui déclenche le processus de visite. Le résultat est écrit dans le fichier directement **TODO (finir quand le projet est fini)**