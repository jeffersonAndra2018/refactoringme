package academy.devdojo.endpoint;

import academy.devdojo.domain.Language;
import academy.devdojo.service.LanguageService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("v1/language")
@Produces(MediaType.APPLICATION_JSON)
public class LanguageController {

    @Inject
    LanguageService languageService;

    @GET
    public List<Language> list() {
        return languageService.list();
    }
}