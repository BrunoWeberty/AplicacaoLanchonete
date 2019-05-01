package classesBO;

import classesDAO.Bwsr_LancheDAO;
import java.util.List;
import objetos.Bwsr_Lanche;

public class Bwsr_LancheBO 
{
    Bwsr_LancheDAO bwsr_lDAO;
    
    public Bwsr_LancheBO()
    {
        bwsr_lDAO = new Bwsr_LancheDAO();
    }
    
    public List<Bwsr_Lanche> Bwsr_GetLanches()
    {
        return bwsr_lDAO.Bwsr_GetLanches();
    }
    
    public Bwsr_Lanche Bwsr_BuscarLanche(int bwsr_Id)
    {
        return bwsr_lDAO.Bwsr_BuscarLanche(bwsr_Id);
    }
    
    public void Bwsr_Salvar(Bwsr_Lanche l)
    {
        bwsr_lDAO.Bwsr_Salvar(l);
    }
}
