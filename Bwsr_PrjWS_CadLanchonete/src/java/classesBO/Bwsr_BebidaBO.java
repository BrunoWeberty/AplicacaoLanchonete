package classesBO;

import classesDAO.Bwsr_BebidaDAO;
import java.util.List;
import objetos.Bwsr_Bebida;

public class Bwsr_BebidaBO 
{
    Bwsr_BebidaDAO bwsr_bDAO;
    
    public Bwsr_BebidaBO()
    {
        bwsr_bDAO = new Bwsr_BebidaDAO();
    } 
    
    public List<Bwsr_Bebida> Bwsr_GetBebidas()
    {
        return bwsr_bDAO.Bwsr_GetBebidas();
    }
    
    public void Bwsr_Salvar(Bwsr_Bebida l)
    {
        bwsr_bDAO.Bwsr_Salvar(l);
    }
    
    public Bwsr_Bebida Bwsr_BuscarBebida(int bwsr_Id)
    {
        return bwsr_bDAO.Bwsr_BuscarBebida(bwsr_Id);
    }
}
