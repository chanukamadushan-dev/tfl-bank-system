package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection connection;
    private static DBConnection instace;

    private DBConnection(){

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trust_forever_bankdb",
                    "root", "2004");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DBConnection getInstance(){

        if(instace == null){
            instace = new DBConnection();
        }
        return instace;
    }

    public Connection getConnection(){
        return  connection;
    }

}
