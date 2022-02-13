package pk.hobby.applications;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class EmiService {
    private static final Logger LOGGER = Logger.getLogger(EmiService.class.getName());

    public List<Emi> getAllEmis() {
        return Emi.listAll();
    }

    public Emi getEmiById(Long id){
        return Emi.findById(id);
    }

}
