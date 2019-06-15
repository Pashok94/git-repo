import java.sql.SQLException;

public class SQLTest {
    public static void main(String[] args) {
        try {
            Main.connect();
//            Main.insertStudent("Nikola", "Travkin", 125);
//            Main.createTable("newTable", "column1", "column2");
//            Main.delete(1);
//            Main.update(2, 125);
            Main.select(2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Main.disconnect();
        }
    }
}
