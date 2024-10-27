import java.util.ArrayList;
import java.util.List;

public class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private String titulaire;
    private List<Transaction> transactions; // Liste pour enregistrer les transactions

    // Constructeur
    public CompteBancaire(String numeroCompte, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde = 0;
        this.transactions = new ArrayList<>(); // Initialiser la liste des transactions
    }

    // Méthode pour déposer de l'argent
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant; // Ajouter le montant au solde
            transactions.add(new Transaction("credit", montant)); // Enregistrer la transaction
            System.out.println("Dépôt de " + montant + " effectué sur le compte " + numeroCompte);
        } else {
            System.out.println("Le montant doit être positif.");
        }
    }

    // Méthode pour retirer de l'argent
    public void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant; // Déduire le montant du solde
            transactions.add(new Transaction("debit", montant)); // Enregistrer la transaction
            System.out.println("Retrait de " + montant + " effectué sur le compte " + numeroCompte);
        } else {
            System.out.println("Retrait refusé : montant insuffisant.");
        }
    }

    // Méthode pour afficher le solde
    public void afficherSolde() {
        System.out.println("Le solde du compte " + numeroCompte + " est de " + solde);
    }

    // Méthode pour afficher l'historique des transactions
    public void afficherTransactions() {
        System.out.println("Historique des transactions pour le compte " + numeroCompte + ":");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Getters et Setters
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }
}
