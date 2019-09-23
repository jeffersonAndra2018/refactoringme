package academy.devdojo.endpoint;

import academy.devdojo.domain.Language;
import academy.devdojo.dto.ResponseBodyDtoPaginated;
import academy.devdojo.service.LanguageService;
import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("v1/language")
@Produces(MediaType.APPLICATION_JSON)
public class LanguageController {

    @Inject
    LanguageService languageService;

    @GET
    public ResponseBodyDtoPaginated<Language> list(@DefaultValue("1") @QueryParam("startPage") int startPage,
        @DefaultValue("5") @QueryParam("pageSize") int pageSize) {
        return languageService.list(startPage, pageSize);
    }
}