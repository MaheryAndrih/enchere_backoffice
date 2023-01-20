package Model;

public class Categorie {

    private int id;
    private String nom_categorie;
    private double pourcentage;

    public Categorie() {
    }

    public Categorie(int id, String nom_categorie, double pourcentage) {
        this.id = id;
        this.nom_categorie = nom_categorie;
        this.pourcentage = pourcentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_categorie() {
        return nom_categorie;
    }

    public void setNom_categorie(String nom_categorie) {
        this.nom_categorie = nom_categorie;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

}
