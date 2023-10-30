package proyecto;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Registros extends Consulta {
    public void agregarRegistro(String query) throws SQLException {
        Statement statement = getConexion().createStatement();
        statement.executeUpdate(query);
    }

    public String mostrarRegistro(ResultSet resultSet, String... columnas) throws SQLException {
        String var = "";
        while (resultSet.next()) {
            StringBuilder registro = new StringBuilder();

            for (String columna : columnas) {
                String valor = resultSet.getString(columna);
                registro.append(columna).append(": ").append(valor).append(", ");
            }

            if (registro.length() > 0) {
                registro.setLength(registro.length() - 2);
            }

            var = registro.toString();
        }
        return var;
    }

    public void editarRegistro(String query) throws SQLException {
        Statement statement = getConexion().createStatement();
        statement.executeUpdate(query);
    }

    public void eliminarRegistro(String query) throws SQLException {
        Statement statement = getConexion().createStatement();
        statement.executeUpdate(query);
    }
}