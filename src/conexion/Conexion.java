package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author braya
 */
public class Conexion {
    
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_ventas", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion" + e);
        }
        return null;
    }
}
