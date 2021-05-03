
package sistemardd;

//Hecho por Burboa Astorga Ricardo 5IS-01V
//Instituto Tecnológico de Estudios Superiores de Los Cabos
//Ingeniería en Sistemas Computacionales

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectar {
    Connection conect = null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/srdd?zeroDateTimeBehavior=convertToNull", "root", "");
            System.out.println("Conexión establecida.");
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexión.");
            JOptionPane.showMessageDialog(null, "Error de conexión." +e);
        }
        return conect;
    }
    
    PreparedStatement preparedStatement(String sql){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
