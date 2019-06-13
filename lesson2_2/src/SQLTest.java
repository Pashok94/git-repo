import java.sql.SQLException;

public class SQLTest {
    public static void main(String[] args) {
        try {
            Main.connect();
            Main.insertStudent("Vasiliy", "Pupkin", 130);
            //Main.createTable("newTable", "column1", "column2");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Main.disconnect();
        }
    }
}
