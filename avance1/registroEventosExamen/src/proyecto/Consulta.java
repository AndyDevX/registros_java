package proyecto;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Consulta extends Conexion {
    
    public ResultSet ejecutarConsulta(String query) throws Exception {
        Statement statement = getConexion().createStatement();
        return statement.executeQuery(query);
    }
    
    public void agregarRegistro(String query) throws Exception {
        /*
        Statement statement = getConexion().createStatement();
        statement.executeUpdate(query);
        */
        PreparedStatement statement = getConexion().prepareStatement(query);
        statement.executeUpdate();
    }
}
