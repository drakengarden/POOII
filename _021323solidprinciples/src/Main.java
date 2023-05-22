import com.uam.IDatabase;
import com.uam.DatabaseMySQL;
import com.uam.DatabaseSQLServer;

public class Main {
    public static void main(String[] args) {
        /*DatabaseMySQL dm = new DatabaseMySQL();
        DatabaseSQLServer ds = new DatabaseSQLServer(); //only this one has createHistory()*/
        IDatabase dm = new DatabaseMySQL();
        IDatabase ds = new DatabaseSQLServer(); //liskov principle not in practice
        //ds.createHistory(); //cannot call because not in interface
    }
}