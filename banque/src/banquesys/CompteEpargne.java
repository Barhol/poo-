package banquesys;

public class CompteEpargne extends CompteBancaire {
    // Attribut supplémentaire
    private double tauxInteret;

    // Constructeur
    public CompteEpargne(String numeroCompte, String titulaire, double tauxInteret) {
        super(numeroCompte, titulaire); // Appel au constructeur de CompteBancaire
        this.tauxInteret = tauxInteret;
    }

    // Méthode pour calculer et ajouter les intérêts
    public void calculerInteret() {
        double interet = getSolde() * tauxInteret;
        deposer(interet);
        System.out.println("Intérêts de " + interet + " ajoutés au compte " + getNumeroCompte());
    }
}

