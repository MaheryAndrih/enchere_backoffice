package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class EtablirConnection {

    Connection c;

    public EtablirConnection(){}

    public Connection get_Connection(String user,String password) throws Exception{
        try{
            Class.forName("org.postgresql.Driver");
            this.c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/enchere",user,password);
        }
        catch(Exception e){
            throw e;
        }
        return this.c;
    }

}
