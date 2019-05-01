/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import classesBO.Bwsr_LancheBO;
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
import objetos.Bwsr_Lanche;

/**
 * REST Web Service
 *
 * @author Bruno_TI
 */
@Path("l")
public class Bwsr_LancheResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Bwsr_LancheResource
     */
    public Bwsr_LancheResource() {
    }

    /**
     * Retrieves representation of an instance of ws.Bwsr_LancheResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bwsr_Lanche> getJson()
    {
        //TODO return proper representation object
        return new Bwsr_LancheBO().Bwsr_GetLanches();
    }
    
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Bwsr_Lanche Bwsr_BuscarLanche (@PathParam("id") int id)
    {
        //TODO return proper representation object
        return new Bwsr_LancheBO().Bwsr_BuscarLanche(id);
    }

    /**
     * PUT method for updating or creating an instance of Bwsr_LancheResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        System.out.println(content);
        Gson g = new Gson();
        Bwsr_Lanche l = g.fromJson(content, Bwsr_Lanche.class);
        new Bwsr_LancheBO().Bwsr_Salvar(l); 
    }
    
}
