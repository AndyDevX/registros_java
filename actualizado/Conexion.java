package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection conexion;

    public void conectar() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el controlador de MySQL
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro_asistencia_eventos", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void desconectar() throws Exception {
        if (conexion != null) {
            conexion.close();
        }
    }

    public Connection getConexion() {
        return conexion;
    }
}