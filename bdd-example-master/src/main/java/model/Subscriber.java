package model;

public class Subscriber {
    private String nom;

    private String prenom;

    private Contract  contract;

    @Override
    public String toString() {
        return "Subscriber{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public Subscriber(String nom, String prenom, Contract contract) {
        this.nom = nom;
        this.prenom = prenom;
        this.setContract(contract);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
