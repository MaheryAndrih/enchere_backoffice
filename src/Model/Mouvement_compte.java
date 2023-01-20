package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Mouvement_compte {

    private Client client;
    private int type_mouvement;
    private int montant;

    public Mouvement_compte() {
    }

    public Mouvement_compte(Client client, int type_mouvement, int montant) {
        this.client = client;
        this.type_mouvement = type_mouvement;
        this.montant = montant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getType_mouvement() {
        return type_mouvement;
    }

    public void setType_mouvement(int type_mouvement) {
        this.type_mouvement = type_mouvement;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public void Rechargercompte() throws Exception{
        Connection con = null;
        PreparedStatement stat = null;
        ResultSet res = null;
        EtablirConnection ec = new EtablirConnection();
        try{
            con = ec.get_Connection("enchere","enchere");
            String requete = "insert into mouvement_compte(id_client,type_mouvement,montant) values  ("+this.getClient().getId()+",1,"+this.getMontant()+")";
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

}
