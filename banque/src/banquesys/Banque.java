package banquesys;


import java.util.ArrayList;

public class Banque {
    // 2.1. Attributs
    private ArrayList<CompteBancaire> comptes;
    private static int nombreComptes = 0; // partagé entre toutes les instances

    // 2.2. Constructeur
    public Banque() {
        comptes = new ArrayList<>();
    }

    // 2.3. Méthodes
    // Ajouter un nouveau compte à la banque
    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
        nombreComptes++;
        System.out.println("Compte " + compte.getNumeroCompte() + " ajouté.");
    }

    // Rechercher un compte par son numéro
    public CompteBancaire chercherCompte(String numeroCompte) {
        for (CompteBancaire compte : comptes) {
            if (compte.getNumeroCompte().equals(numeroCompte)) {
                return compte;
            }
        }
        System.out.println("Compte non trouvé : " + numeroCompte);
        return null;
    }

    // Transférer de l’argent d’un compte à un autre
    public void transfert(String numeroSource, String numeroDest, double montant) {
        CompteBancaire source = chercherCompte(numeroSource);
        CompteBancaire destination = chercherCompte(numeroDest);
        if (source != null && destination != null && source.getSolde() >= montant) {
            source.retirer(montant);
            destination.deposer(montant);
            System.out.println("Transfert de " + montant + " de " + numeroSource + " vers " + numeroDest);
        } else {
            System.out.println("Transfert échoué : montant insuffisant ou compte introuvable.");
        }
    }

    // 2.4. Méthode statique pour afficher le nombre total de comptes créés
    public static void afficherNombreComptes() {
        System.out.println("Nombre total de comptes bancaires : " + nombreComptes);
    }
}
