package academy.devdojo.endpoint;

import academy.devdojo.domain.OriginalCode;
import academy.devdojo.dto.ResponseBodyDto;
import academy.devdojo.service.OriginalCodeService;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;

@Path("v1/original")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OriginalCodeController {

    @Inject
    OriginalCodeService originalCodeService;

    @GET
    @Operation(summary = "List the last 25 submitted codes")
    public ResponseBodyDto<OriginalCode> list() {
        return originalCodeService.list();
    }

    @POST
    public Long save(OriginalCode originalCode) {
        return originalCodeService.save(originalCode);
    }
}