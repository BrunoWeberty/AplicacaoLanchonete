package classesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import objetos.Bwsr_Bebida;
import utilitarios.Conexao;

public class Bwsr_BebidaDAO 
{
    Connection conn;
    
    public Bwsr_BebidaDAO()
    {
        conn = new Conexao().conexao();
    }
    
    public void Bwsr_Salvar(Bwsr_Bebida b) 
    {
        try {
            PreparedStatement ppStmt = conn.prepareStatement("INSERT INTO bebidas(descricao, valor) values(?,?)");
            ppStmt.setString(1, b.getBwsr_Descricao());
            ppStmt.setFloat(2, b.getBwsr_Valor());
            ppStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();//Mostra erro no prompt
        }
    }
    
    public List<Bwsr_Bebida> Bwsr_GetBebidas() 
    {
        List<Bwsr_Bebida> lstB = new LinkedList<Bwsr_Bebida>();

        try {
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM bebidas");
            ResultSet rs = ppStmt.executeQuery();
            while (rs.next()) {
                lstB.add(Bwsr_GetBebida(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();//Mostra erro no prompt
        }
        return lstB;
    }
    
    private Bwsr_Bebida Bwsr_GetBebida(ResultSet rs) throws SQLException
    {
        Bwsr_Bebida b = new Bwsr_Bebida();
        b.setBwsr_Descricao(rs.getString("descricao"));
        b.setBwsr_Valor(rs.getFloat("valor"));

        return b;
    }
    
    public Bwsr_Bebida Bwsr_BuscarBebida(int bwsr_Id)
    {
        Bwsr_Bebida b = new Bwsr_Bebida();
        
        try {
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM bebidas WHERE id = ?");
            ppStmt.setInt(1, bwsr_Id);
            ResultSet rs = ppStmt.executeQuery();
            while (rs.next()) {
                b.setBwsr_Id(rs.getInt("id"));
                b.setBwsr_Descricao(rs.getString("descricao"));
                b.setBwsr_Valor(rs.getFloat("valor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();//Mostra erro no prompt
        }
        
        return b;
    }
}
