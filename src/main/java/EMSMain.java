import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class EMSMain {
    public static void main(String[] args) throws IOException, FontFormatException, SQLException, ClassNotFoundException {
//        DBConn Conn = new DBConn();
//        String SQLTxt = "INSERT INTO Login VALUES (1 ,\"Vishal\", \"$hiniGAMI\")";
//        Conn.statementInst.executeUpdate(SQLTxt);
        new FrontPage();

    }
}
