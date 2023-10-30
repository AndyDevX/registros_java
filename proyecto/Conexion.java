package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conexion;

    public void conectar(String url, String usuario, String contraseña) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el controlador de MySQL
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void desconectar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }

    public Connection getConexion() {
        return conexion;
    }
}