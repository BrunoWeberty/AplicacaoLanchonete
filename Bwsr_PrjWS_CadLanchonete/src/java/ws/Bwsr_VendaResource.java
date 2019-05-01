/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import classesBO.Bwsr_BebidaBO;
import classesBO.Bwsr_VendaBO;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import objetos.Bwsr_Bebida;
import objetos.Bwsr_Venda;

/**
 * REST Web Service
 *
 * @author Bruno_TI
 */
@Path("v")
public class Bwsr_VendaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public Bwsr_VendaResource() {
    }

    /**
     * Retrieves representation of an instance of ws.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bwsr_Venda> getJson()
    {
        //TODO return proper representation object
        return new Bwsr_VendaBO().Bwsr_GetVendas();
    }
    
    @Path("/{id}")
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Bwsr_Venda Bwsr_BuscarVenda(@PathParam("id") int id)
    {
        return new Bwsr_VendaBO().Bwsr_BuscarVenda(id);
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) 
    {
        System.out.println(content);
        Gson g = new Gson();
        Bwsr_Venda v = g.fromJson(content, Bwsr_Venda.class);
        new Bwsr_VendaBO().Bwsr_Salvar(v); 
    }
    
    
}
