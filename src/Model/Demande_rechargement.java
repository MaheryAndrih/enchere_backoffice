package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Demande_rechargement {

    private int id;
    private Client client;
    private int montant;
    private int etat;

    public Demande_rechargement() {
    }

    public Demande_rechargement(int id, Client client, int montant, int etat) {
        this.id = id;
        this.client = client;
        this.montant = montant;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public Demande_rechargement[] listeDemandeNonValider() throws Exception {
        Connection con = null;
        PreparedStatement stat = null;
        ResultSet res = null;
        Vector reponse = new Vector();
        EtablirConnection ec = new EtablirConnection();
        Demande_rechargement[] valiny = null;
        try{
            con = ec.get_Connection("enchere","enchere");
            String requete = "select * from demande_rechargement where etat=0";
            stat = con.prepareStatement(requete);
            res = stat.executeQuery();
            while(res.next()){
                Demande_rechargement p = new Demande_rechargement();
                p.setId(res.getInt("id"));
                p.setClient(new Client().getClientById(res.getInt("id_client")));
                p.setMontant(res.getInt("montant"));
                p.setEtat(res.getInt("etat"));
                reponse.add(p);
            }
        }
        catch(Exception ex){
            throw ex;
        }
        finally{
            valiny = new Demande_rechargement[reponse.size()];
            for(int i=0;i<reponse.size();i++){
                valiny[i] = (Demande_rechargement) reponse.elementAt(i);
            }
            if(res!=null){
                res.close();
            }
            if(con!=null){
                con.close();
            }
        }
        return valiny;
    }

    public void updateDemande() throws Exception{
        Connection con = null;
        PreparedStatement stat = null;
        ResultSet res = null;
        EtablirConnection ec = new EtablirConnection();
        try{
            con = ec.get_Connection("enchere","enchere");
            String requete = "update demande_rechargement set etat=1 where id="+this.getId();
            stat = con.prepareStatement(requete);
            int z = stat.executeUpdate();
        }
        catch(Exception ex){
            throw ex;
        }
        finally{
            if(res!=null){
                res.close();
            }
            if(con!=null){
                con.close();
            }
        }
    }

    public void validerdemande() throws Exception{
        try{
            this.updateDemande();
            Mouvement_compte mc = new Mouvement_compte();
            mc.setClient(this.getClient());
            mc.setMontant(this.getMontant());
            mc.Rechargercompte();
        } catch (Exception ex){
            throw ex;
        }
    }

}
