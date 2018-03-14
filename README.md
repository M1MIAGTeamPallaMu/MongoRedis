# MongoRedis - Practical Lab Session



#### Quelles sont les limites d'une base de données orientée documents ?


Une des limites d'une base orientée document est qu'on ne dispose pas d'une structure clairement définie. La qualité des données fournies par un élément est variable.

(Cependant dans notre cas, la structure est définie via Java, dans une classe Entité)


De plus les requêtes sont moins fléxibles, certaines commodités des bases relationnelles n'existent pas.


#### Quels sont les types de données stockés dans Redis, que peut on faire comme types de requêtes ? (à répondre dans le compte rendu de TP (le readme)

Redis est orienté clé->valeur, ce sont donc des couples de valeurs (String, Hash, Sets ou Listes) qui sont stockés. Une clé peut avoir plusieurs valeurs.

Il est possible d'ajouter une valeur (SET), supprimer (DEL) une valeur ou voir les valeurs (GET) d'une clé avec Redis.
Il est également possible d'incrémenter un nombre contenu dans une clé (INCR)


#### Comment lancer ?

Téléchargez le projet et importez le en tant que projet Maven dans votre IDE préféré.

Afin de tester les deux versions : 

MongoDB : Lancez la classe App présente dans le package istic.miage.pallamu.mongo.

Redis : Lancez la classe App présente dans le package istic.miage.pallamu.redis.

#### Descriptif des classes 

Les classes du package mongo, Adress, Article et Customer,  représentent les entitées de la base de donnée mongodb.

Concernant redis il n'y en a pas eu besoin dans notre cas il ne s'agit que de clés valeurs et toutes les operations sont explicitement définies dans la class App du package redis.






