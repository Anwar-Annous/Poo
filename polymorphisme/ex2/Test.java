package polymorphisme.ex2;

public class Test {
    public static void main(String[] args) {
        Employe[] employes = {
                new Developpeur("Alice", 4000, "Java"),
                new Manager("Bob", 6000, 5)
        };

        for (Employe e : employes) {
            e.afficherInfos();
        }

        // Sur-casting
        Employe dev = new Developpeur("Charlie", 4500, "Python");
        dev.afficherInfos();  // Affiche les infos de Charlie

        // Sous-casting
        if (dev instanceof Developpeur) {
            Developpeur d = (Developpeur) dev;
            d.afficherLangage();  // Affiche "Langage utilisé: Python"
        }

        if (employes[1] instanceof Manager) {
            Manager m = (Manager) employes[1];
            m.gererEquipe();  // Affiche "Le manager gère l'équipe."
        }
    }
}
