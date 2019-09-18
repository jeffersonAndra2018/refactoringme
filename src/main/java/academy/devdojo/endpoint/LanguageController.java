package academy.devdojo.endpoint;

import academy.devdojo.domain.Language;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/language")
public class LanguageController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Language> list() {
        return List.of(new Language("Java"),new Language("Python"));

    }
}