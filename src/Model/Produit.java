package Model;

import java.sql.Date;

public class Produit {

    private int id;
    private Client cliant;
    private String nom_produit;
    private Categorie categorie;
    private int duree_enchere;
    private Date date_enchere;
    private int prix_min;

    public Produit() {
    }

    public Produit(int id, Client cliant, String nom_produit, Categorie categorie, int duree_enchere, Date date_enchere, int prix_min) {
        this.id = id;
        this.cliant = cliant;
        this.nom_produit = nom_produit;
        this.categorie = categorie;
        this.duree_enchere = duree_enchere;
        this.date_enchere = date_enchere;
        this.prix_min = prix_min;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getCliant() {
        return cliant;
    }

    public void setCliant(Client cliant) {
        this.cliant = cliant;
    }

    public String getNom_produit() {
        return nom_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public int getDuree_enchere() {
        return duree_enchere;
    }

    public void setDuree_enchere(int duree_enchere) {
        this.duree_enchere = duree_enchere;
    }

    public Date getDate_enchere() {
        return date_enchere;
    }

    public void setDate_enchere(Date date_enchere) {
        this.date_enchere = date_enchere;
    }

    public int getPrix_min() {
        return prix_min;
    }

    public void setPrix_min(int prix_min) {
        this.prix_min = prix_min;
    }


}
