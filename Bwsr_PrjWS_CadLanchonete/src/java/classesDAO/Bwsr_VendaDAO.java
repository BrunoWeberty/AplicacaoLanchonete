
package classesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import objetos.Bwsr_Venda;
import utilitarios.Conexao;

public class Bwsr_VendaDAO 
{
    Connection conn;
    
    public Bwsr_VendaDAO()
    {
        conn = new Conexao().conexao();
    }
    
    public void Bwsr_Salvar(Bwsr_Venda v) 
    {
        try {
            PreparedStatement ppStmt = conn.prepareStatement("INSERT INTO vendas(nome, valorTotal) values(?,?)");
            ppStmt.setString(1, v.getBwsr_Nome());
            ppStmt.setFloat(2, v.getBwsr_ValorTotal());
            ppStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();//Mostra erro no prompt
        }
    }
    
    public List<Bwsr_Venda> Bwsr_GetVendas() 
    {
        List<Bwsr_Venda> lstV = new LinkedList<Bwsr_Venda>();

        try {
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM vendas");
            ResultSet rs = ppStmt.executeQuery();
            while (rs.next()) {
                lstV.add(Bwsr_GetVenda(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();//Mostra erro no prompt
        }
        return lstV;
    }
    
    private Bwsr_Venda Bwsr_GetVenda(ResultSet rs) throws SQLException
    {
        Bwsr_Venda v = new Bwsr_Venda();
        
        v.setBwsr_Id(rs.getInt("id"));
        v.setBwsr_Nome(rs.getString("nome"));
        v.setBwsr_ValorTotal(rs.getFloat("valorTotal"));

        return v;
    }
    
    public Bwsr_Venda Bwsr_BuscarVenda(int bwsr_Id)
    {
        Bwsr_Venda v = new Bwsr_Venda();
        
        try {
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM vendas WHERE id = ?");
            ppStmt.setInt(1, bwsr_Id);
            ResultSet rs = ppStmt.executeQuery();
            rs.next();
            v=Bwsr_GetVenda(rs);

        } catch (SQLException e) {
            e.printStackTrace();//Mostra erro no prompt
        }
        
        return v;
    }
}
