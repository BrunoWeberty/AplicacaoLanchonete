
package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao 
{
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/bdlanchonete";
    final private String usuario = "root";
    final private String senha = "vertrigo";
    
    public Connection conexao()
    {
        Connection conn = null;
        
        try {
            Class.forName(driver);
        conn = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
         return conn;        
        
    }
}
