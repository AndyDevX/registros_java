package proyecto;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Registros extends Consulta {
    
    public List<String[]> mostrarRegistro(ResultSet resultSet, String... columnas) throws SQLException {
    List<String[]> registros = new ArrayList<>();
    while (resultSet.next()) {
        String[] valores = new String[columnas.length];
        for (int i = 0; i < columnas.length; i++) {
            valores[i] = resultSet.getString(columnas[i]);
        }
        registros.add(valores);
        }
    return registros;
    }   
    
}