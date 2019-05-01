package classesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import objetos.Bwsr_Lanche;
import utilitarios.Conexao;

public class Bwsr_LancheDAO 
{
    Connection conn;
    
    public Bwsr_LancheDAO()
    {
        conn = new Conexao().conexao();
    }
    
    public void Bwsr_Salvar(Bwsr_Lanche l) 
    {
        try {
            PreparedStatement ppStmt = conn.prepareStatement("INSERT INTO lanches(descricao, valor) values(?,?)");
            ppStmt.setString(1, l.getBwsr_Descricao());
            ppStmt.setFloat(2, l.getBwsr_Valor());
            ppStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();//Mostra erro no prompt
        }
    }
    
    public List<Bwsr_Lanche> Bwsr_GetLanches() 
    {
        List<Bwsr_Lanche> lstL = new LinkedList<Bwsr_Lanche>();

        try {
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM lanches");
            ResultSet rs = ppStmt.executeQuery();
            while (rs.next()) {
                lstL.add(Bwsr_GetLanche(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();//Mostra erro no prompt
        }
        return lstL;
    }
    
    private Bwsr_Lanche Bwsr_GetLanche(ResultSet rs) throws SQLException
    {
        Bwsr_Lanche l = new Bwsr_Lanche();
        l.setBwsr_Id(rs.getInt("id"));
        l.setBwsr_Descricao(rs.getString("descricao"));
        l.setBwsr_Valor(rs.getFloat("valor"));

        return l;
    }
    
    public Bwsr_Lanche Bwsr_BuscarLanche(int bwsr_Id)
    {
        Bwsr_Lanche l = new Bwsr_Lanche();
        
        try {
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM lanches WHERE id = ?");
            ppStmt.setInt(1, bwsr_Id);
            ResultSet rs = ppStmt.executeQuery();
            rs.next();
            l=Bwsr_GetLanche(rs);
        } catch (SQLException e) {
            e.printStackTrace();//Mostra erro no prompt
        }
        
        return l;
    }
}
