package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class EtablirConnection {

    Connection c;

    public EtablirConnection(){}

    public Connection get_Connection() throws Exception{
        try{
            Class.forName("org.postgresql.Driver");
            this.c= DriverManager.getConnection("jdbc:postgresql://containers-us-west-157.railway.app:7023/railway","postgres","2f0ZU8YVuyoJdvZCblKS");
        }
        catch(Exception e){
            throw e;
        }
        return this.c;
    }

}
