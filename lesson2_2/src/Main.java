import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static Connection connection;
    private static Statement stmt;

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("JDBC:sqlite:students_list.db");
            stmt = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void disconnect(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertStudent (String first_name, String last_name, int group_number){
        String sql = String.format("INSERT INTO student_list (first_name, last_name, group_numb)" +
                "values('%s','%s',%d", first_name,last_name,group_number);
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public static void createTable (String name, String column1, String column2){
        String sql = String.format("CREATE TABLE %s (%s TEXT, %s TEXT", name,column1,column2);
         try {
             stmt.execute(sql);
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
}
