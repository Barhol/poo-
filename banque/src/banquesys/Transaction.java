package banquesys;

import java.util.Date;

public class Transaction {
    private String type; // "credit" ou "debit"
    private double montant;
    private Date date;

    // Constructeur
    public Transaction(String type, double montant) {
        this.type = type;
        this.montant = montant;
        this.date = new Date(); // La date actuelle
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }

    // Méthode pour afficher une transaction
    public String toString() {
        return type + " de " + montant + " le " + date;
    }
}

