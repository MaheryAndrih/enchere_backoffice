package Model;

public class Enchere {

    private int id;
    private Produit produit;
    private Client client;
    private int montant_enchere;

    public Enchere() {
    }

    public Enchere(int id, Produit produit, Client client, int montant_enchere) {
        this.id = id;
        this.produit = produit;
        this.client = client;
        this.montant_enchere = montant_enchere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getMontant_enchere() {
        return montant_enchere;
    }

    public void setMontant_enchere(int montant_enchere) {
        this.montant_enchere = montant_enchere;
    }

}
