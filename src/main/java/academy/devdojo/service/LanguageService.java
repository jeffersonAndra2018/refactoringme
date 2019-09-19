package academy.devdojo.service;

import academy.devdojo.domain.Language;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@RequestScoped
public class LanguageService {

    @Inject
    EntityManager em;

    public List<Language> list() {
        return em.createQuery("Select l from Language l", Language.class).getResultList();
    }
}

