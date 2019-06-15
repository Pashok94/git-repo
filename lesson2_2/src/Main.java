import java.sql.*;

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
                "values('%s','%s',%d);", first_name,last_name,group_number);
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public static void createTable (String name, String column1, String column2){
        String sql = String.format("CREATE TABLE %s (%s TEXT, %s TEXT);", name,column1,column2);
         try {
             stmt.execute(sql);
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }

     public static void delete (int id){
        String sql = String.format("DELETE FROM student_list WHERE id = %d;", id);
         try {
             stmt.execute(sql);
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }

     public static void update (int id, int newGroupNumb){
        String sql = String.format("UPDATE student_list SET group_numb = %d WHERE id = %d;", newGroupNumb, id);
         try {
             stmt.execute(sql);
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }

     public static void select (int id){
        String sql = String.format("SELECT * FROM student_list WHERE id = %d;", id);
         try {
             ResultSet rs = stmt.executeQuery(sql);
             System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) );
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
}
