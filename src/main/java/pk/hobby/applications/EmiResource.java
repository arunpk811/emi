package pk.hobby.applications;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("emi")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class EmiResource {
    private final EmiService emiService;

    @Inject
    EmiResource(EmiService emiService){
        this.emiService = emiService;
    }

    @GET
    public List<Emi> getEmis(){
        return emiService.getAllEmis();
    }

    @GET
    @Path("/{id}")
    public Emi getEmis(@PathParam("id") Long id){
        return emiService.getEmiById(id);
    }
}
