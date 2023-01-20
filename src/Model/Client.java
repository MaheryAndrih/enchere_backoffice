package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Client {

    private int id;
    private String username;
    private String mot_de_pass;
    private int sexe;
    private String email;

    public Client() {
    }

    public Client(int id, String username, String mot_de_pass, int sexe, String email) {
        this.id = id;
        this.username = username;
        this.mot_de_pass = mot_de_pass;
        this.sexe = sexe;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMot_de_pass() {
        return mot_de_pass;
    }

    public void setMot_de_pass(String mot_de_pass) {
        this.mot_de_pass = mot_de_pass;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client getClientById(int id) throws Exception{
        Connection con = null;
        PreparedStatement stat = null;
        ResultSet res = null;
        EtablirConnection ec = new EtablirConnection();
        Client valiny = new Client();
        try{
            con = ec.get_Connection("rencontre","rencontre");
            String requete = "select * from Client where id="+id;
            stat = con.prepareStatement(requete);
            res = stat.executeQuery();
            while(res.next()){
                valiny.setId(res.getInt("id"));
                valiny.setUsername(res.getString("username"));
                valiny.setMot_de_pass(res.getString("mot_de_pass"));
                valiny.setSexe(res.getInt("sexe"));
                valiny.setEmail(res.getString("email"));
            }
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
        return valiny;
    }

}
