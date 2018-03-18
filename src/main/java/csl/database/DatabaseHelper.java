package csl.database;

import com.sun.corba.se.impl.orb.DataCollectorBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Carmen on 17-3-2018.
 */
public class DatabaseHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseHelper.class);

    private DatabaseHelper instance;

    private DatabaseHelper() {
        if (instance == null) {
            instance = new DatabaseHelper();
        }
    }

    public DatabaseHelper getInstance() {
        return instance;
    }

    public static void createTable() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "admin");
            Statement statement = conn.createStatement();
            boolean worked = statement.execute("create table food (id int, name varchar(225))");
            if (worked) {
                LOGGER.info("Table created: food on test database");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
