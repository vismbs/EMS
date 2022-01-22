import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class EMSMain {
    public static void main(String[] args) throws IOException, FontFormatException, SQLException, ClassNotFoundException {
//        DBConn Conn = new DBConn();
//        String SQLTxt = "DELETE FROM Employee";
////        String SQLTxt = "CREATE TABLE Employee " +
////                "(empId TEXT NOT NULL," +
////                "empName TEXT NOT NULL, " +
////                "empAge TEXT NOT NULL," +
////                "empAddress TEXT NOT NULL," +
////                "empEmail TEXT NOT NULL," +
////                "empPost TEXT NOT NULL," +
////                "empFather TEXT NOT NULL," +
////                "empDOB TEXT NOT NULL," +
////                "empPhone TEXT NOT NULL," +
////                "empEdu TEXT NOT NULL," +
////                "empAadhar TEXT NOT NULL" +
////                ")";
////        String SQLString = "DROP TABLE Employee";
//        Conn.statementInst.executeUpdate(SQLTxt);
        new Search_Employee();

    }
}
