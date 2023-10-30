package proyecto;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Consulta extends Conexion {
    public ResultSet ejecutarConsulta(String query) throws SQLException {
        Statement statement = getConexion().createStatement();
        return statement.executeQuery(query);
    }
}
