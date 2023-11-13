package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

@Path("/cliente")
public class ClienteResource {

    private ClienteDAO clienteDAO;

    public ClienteResource() throws ClassNotFoundException, SQLException {
        this.clienteDAO = new ClienteDAO();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> buscar() throws SQLException {
        return clienteDAO.selecionar();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response cadastroRs(Cliente cliente, @Context UriInfo uriInfo) throws SQLException {
        clienteDAO.inserir(cliente);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(cliente.getCpf());
        return Response.created(builder.build()).build();
    }

    @PUT
    @Path("/{cpf}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizaRs(Cliente cliente, @PathParam("cpf") String cpf) throws SQLException {
        cliente.setCpf(cpf);
        clienteDAO.atualizar(cliente);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{cpf}")
    public Response deleteRs(@PathParam("cpf") String cpf) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        clienteDAO.deletar(cliente);
        return Response.ok().build();
    }
}
