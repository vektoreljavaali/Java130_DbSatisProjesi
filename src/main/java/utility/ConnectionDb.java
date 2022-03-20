package utility;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConnectionDb {
    private final String URL = "jdbc:postgresql://localhost:5432/SatisDB";
    private final String username = "postgres";
    private final String password = "123";
    // Bağlantı için
    private Connection connection;

    public Connection getConnection(){
        try{
            Driver.class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL,username,password);
            return connection;
        }catch (Exception e){
            System.out.println("Hata...: "+e.toString());
            return null;
        }
    }

    public boolean closeConnection(){
        try{
            if(!connection.isClosed()){
                connection.close();
                return true;
            }
        }catch (Exception e){
            System.out.println("Close Error...: "+ e.toString());
        }
        return false;
    }

}
