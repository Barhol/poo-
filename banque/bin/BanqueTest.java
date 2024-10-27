package banquesys;


public class BanqueTest {
    public static void main(String[] args) {
        // 3.1. Créer une banque
        Banque banque = new Banque();

        // 3.2. Ajouter trois comptes bancaires
        CompteBancaire compte1 = new CompteBancaire("001", "Alice");
        CompteBancaire compte2 = new CompteBancaire("002", "Bob");
        CompteBancaire compte3 = new CompteBancaire("003", "Charlie");

        banque.ajouterCompte(compte1);
        banque.ajouterCompte(compte2);
        banque.ajouterCompte(compte3);

        // 3.3. Effectuer des dépôts
        compte1.deposer(500);
        compte2.deposer(300);
        compte3.deposer(700);

        // 3.4. Effectuer des retraits
        compte1.retirer(200);
        compte2.retirer(100);

        // 3.5. Transférer de l’argent entre les comptes
        banque.transfert("001", "002", 100);
        banque.transfert("003", "001", 50);

        // 3.6. Afficher les soldes des comptes
        compte1.afficherSolde();
        compte2.afficherSolde();
        compte3.afficherSolde();

        // 3.7. Afficher le nombre total de comptes créés
        Banque.afficherNombreComptes();
         
       

        // Ajouter des comptes courants
        CompteCourant compteCourant1 = new CompteCourant("CC001", "Alice", 200);
        CompteCourant compteCourant2 = new CompteCourant("CC002", "Bob", 300);

        // Ajouter des comptes épargne
        CompteEpargne compteEpargne1 = new CompteEpargne("CE001", "Charlie", 0.05);
        CompteEpargne compteEpargne2 = new CompteEpargne("CE002", "Dave", 0.03);

        // Ajouter les comptes à la banque
        banque.ajouterCompte(compteCourant1);
        banque.ajouterCompte(compteCourant2);
        banque.ajouterCompte(compteEpargne1);
        banque.ajouterCompte(compteEpargne2);

        // Effectuer des dépôts
        compteCourant1.deposer(500);
        compteCourant2.deposer(300);
        compteEpargne1.deposer(700);
        compteEpargne2.deposer(1000);

        // Effectuer des retraits
        compteCourant1.retirer(600); // devrait être autorisé grâce au découvert
        compteCourant2.retirer(500); // devrait échouer (dépasse le découvert autorisé)
        compteEpargne1.retirer(100);
        compteEpargne2.retirer(50);

        // Calculer et appliquer les intérêts pour les comptes épargne
        compteEpargne1.calculerInteret();
        compteEpargne2.calculerInteret();

        // Afficher les soldes des comptes après les transactions
        compteCourant1.afficherSolde();
        compteCourant2.afficherSolde();
        compteEpargne1.afficherSolde();
        compteEpargne2.afficherSolde();

        // Afficher le nombre total de comptes créés
        Banque.afficherNombreComptes();
        Banque banque = new Banque();

        // Créer des comptes bancaires
        CompteBancaire compte1 = new CompteBancaire("001", "Alice");
        CompteBancaire compte2 = new CompteBancaire("002", "Bob");
        CompteBancaire compte3 = new CompteBancaire("003", "Charlie");

        // Ajouter les comptes à la banque
        banque.ajouterCompte(compte1);
        banque.ajouterCompte(compte2);
        banque.ajouterCompte(compte3);

        // Effectuer des transactions
        compte1.deposer(500); // Alice dépose 500
        compte1.retirer(200); // Alice retire 200
        compte2.deposer(1000); // Bob dépose 1000
        compte3.deposer(750); // Charlie dépose 750
        compte3.retirer(300); // Charlie retire 300

        // Afficher les soldes après les opérations
        compte1.afficherSolde();
        compte2.afficherSolde();
        compte3.afficherSolde();

        // Afficher l'historique des transactions pour chaque compte
        compte1.afficherTransactions(); // Historique pour Alice
        compte2.afficherTransactions(); // Historique pour Bob
        compte3.afficherTransactions(); // Historique pour Charlie
    }
}
