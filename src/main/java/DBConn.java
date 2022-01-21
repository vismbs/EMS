import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class Name: DBConn
 * Usage: It's used to create a Connection between Java and SQLiteDB
 */
public class DBConn {

    // A STATIC FIELD FOR CONNECTION VARIABLE AS MAKING IT STATIC WOULD MAKE IT COMMON FOR ALL INSTANCES REDUCING MEMORY LOAD
    private static Connection Conn;

    // HANDLING THE EXCEPTION AND PRINTING THE ERROR IF THE DB FAILS TO CONNECT
    static {
        try {
            Conn = DriverManager.getConnection("jdbc:sqlite:EMS.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // FINDING THE SQLITE JDBC CLASS
    DBConn() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
    }

    // A GETTER FOR CONNECTION
    public static Connection getConnection(){
        return Conn;
    }
}
