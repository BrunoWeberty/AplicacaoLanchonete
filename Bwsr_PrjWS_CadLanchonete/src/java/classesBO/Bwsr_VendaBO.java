package classesBO;

import classesDAO.Bwsr_VendaDAO;
import java.util.List;
import objetos.Bwsr_Venda;

public class Bwsr_VendaBO
{
    Bwsr_VendaDAO bwsr_vDAO;
    
    public Bwsr_VendaBO()
    {
        bwsr_vDAO = new Bwsr_VendaDAO();
    }
    
    public void Bwsr_Salvar(Bwsr_Venda v)
    {
        bwsr_vDAO.Bwsr_Salvar(v);
    }
    
    public Bwsr_Venda Bwsr_BuscarVenda(int bwsr_Id)
    {
        return bwsr_vDAO.Bwsr_BuscarVenda(bwsr_Id);
    }
    
    public List<Bwsr_Venda> Bwsr_GetVendas()
    {
        return bwsr_vDAO.Bwsr_GetVendas();
    }
}
