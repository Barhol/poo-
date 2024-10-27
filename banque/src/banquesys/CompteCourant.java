package banquesys;

public class CompteCourant extends CompteBancaire {
    // Attribut supplémentaire
    private double decouvertAutorise;

    // Constructeur
    public CompteCourant(String numeroCompte, String titulaire, double decouvertAutorise) {
        super(numeroCompte, titulaire); // Appel au constructeur de CompteBancaire
        this.decouvertAutorise = decouvertAutorise;
    }

    // Méthode surchargée
    @Override
    public void retirer(double montant) {
        if (montant <= getSolde() + decouvertAutorise) {
            super.retirer(montant);
        } else {
            System.out.println("Montant dépasse le découvert autorisé !");
        }
    }
}

